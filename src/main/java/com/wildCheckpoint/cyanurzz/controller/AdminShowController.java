package com.wildCheckpoint.cyanurzz.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wildCheckpoint.cyanurzz.entity.Spectacle;
import com.wildCheckpoint.cyanurzz.repository.SpectacleRepository;

@Controller
public class AdminShowController {

	@Autowired
	private SpectacleRepository spectacleRepository;
	
	@GetMapping("/admin/show")
	public String toShow(Model model) {
		
		model.addAttribute("spectacles", spectacleRepository.findAll());
		return "adminShow";
	}
	
    @GetMapping("/admin/show/delete")
    public String deleteSpectacle(@RequestParam Integer id) {
    	Spectacle spectacleToDelete = spectacleRepository.findById(id).get();
    	spectacleRepository.delete(spectacleToDelete);
    	
    	return "redirect:/admin/show";
    }
    
    
	@GetMapping("/admin/show/update")
	public String toShow(Model model ,@RequestParam(required = false) Integer id) {
	 	Spectacle spectacle =new Spectacle();
    	if (id != null) {
    		Optional<Spectacle> optionalSpectacle = spectacleRepository.findById(id);
    		if (optionalSpectacle.isPresent()) {
    			spectacle = optionalSpectacle.get();
    		}
    	}
		model.addAttribute("spectacle", spectacle);
		return "adminShowUpdate";
	}
	
	@PostMapping("/admin/show/update")
	public String postShow(Model model, @ModelAttribute Spectacle spectacle) {
    	spectacleRepository.save(spectacle);
    	
		return "redirect:/admin/show";
	}
}
