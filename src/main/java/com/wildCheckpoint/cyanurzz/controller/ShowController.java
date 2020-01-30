package com.wildCheckpoint.cyanurzz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.wildCheckpoint.cyanurzz.repository.ArticleRepository;
import com.wildCheckpoint.cyanurzz.repository.GroupeRepository;
import com.wildCheckpoint.cyanurzz.repository.SpectacleRepository;
import com.wildCheckpoint.cyanurzz.repository.UserRepository;

@Controller
public class ShowController {

	
	@Autowired
	private SpectacleRepository spectacleRepository;
	
	@GetMapping("/show/{id}")
	public String toShow(@PathVariable("id") Integer id,  Model model) {
		
		model.addAttribute("articles", spectacleRepository.getOne(id).getArticles());
		model.addAttribute("groupes", spectacleRepository.getOne(id).getGroupes());
		model.addAttribute("show", spectacleRepository.getOne(id));
		return "show";
	}
}
