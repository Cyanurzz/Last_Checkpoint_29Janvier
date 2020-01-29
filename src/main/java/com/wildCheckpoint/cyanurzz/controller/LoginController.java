package com.wildCheckpoint.cyanurzz.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.wildCheckpoint.cyanurzz.entity.User;
import com.wildCheckpoint.cyanurzz.repository.UserRepository;


@Controller
public class LoginController  {
	
	@Autowired
	private  UserRepository userRepository;
    
	@GetMapping("/login")
	public String showLogin(Model model) {
		
		return "login";
	}
	
	@GetMapping("/logout")
	public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/?logout=true";
	}

	@GetMapping("/register")
	public String showRegister(Model model) {
	    model.addAttribute("user", new User());
		return "register";
	}
	
	@PostMapping("/register")
	public String addMember(User user) {
		user.setPassword(user.getPassword());
		user.setRole("MEMBRE");
		userRepository.save(user);
		return "redirect:/login";
	}
	
}

