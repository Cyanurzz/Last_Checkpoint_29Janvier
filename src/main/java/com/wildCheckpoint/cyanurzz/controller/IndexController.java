package com.wildCheckpoint.cyanurzz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wildCheckpoint.cyanurzz.repository.ArticleRepository;
import com.wildCheckpoint.cyanurzz.repository.GroupeRepository;
import com.wildCheckpoint.cyanurzz.repository.SpectacleRepository;
import com.wildCheckpoint.cyanurzz.repository.UserRepository;

@Controller
public class IndexController {
	
	@Autowired
	private ArticleRepository articleRepository;
	
	@Autowired
	private GroupeRepository groupeRepository;
	
	@Autowired
	private SpectacleRepository spectacleRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/")
	public String toHome(Model model, @RequestParam (value = "logout", required = false) String logout) {
		
		model.addAttribute("articles", articleRepository.findAll());
		model.addAttribute("groupes", groupeRepository.findAll());
		model.addAttribute("spectacles", spectacleRepository.findAll());
		model.addAttribute("user", userRepository.findAll());
		
		return "index";
	}
}
