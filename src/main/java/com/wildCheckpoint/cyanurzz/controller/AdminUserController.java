package com.wildCheckpoint.cyanurzz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wildCheckpoint.cyanurzz.entity.User;
import com.wildCheckpoint.cyanurzz.repository.UserRepository;



@Controller
public class AdminUserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/admin/user")
	public String toUser(Model model) {
		model.addAttribute("users", userRepository.findAll());
		
		return "adminUser";
	}
	
    @GetMapping("/admin/user/delete")
    public String deleteArticles(@RequestParam Integer id) {
    	User userToDelete = userRepository.findById(id).get();
    	userRepository.delete(userToDelete);
    	
    	return "redirect:/admin/user";
    }
		
}
