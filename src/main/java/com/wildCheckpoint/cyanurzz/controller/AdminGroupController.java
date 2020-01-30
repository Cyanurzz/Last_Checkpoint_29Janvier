package com.wildCheckpoint.cyanurzz.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wildCheckpoint.cyanurzz.entity.Groupe;
import com.wildCheckpoint.cyanurzz.repository.GroupeRepository;
import com.wildCheckpoint.cyanurzz.repository.SpectacleRepository;

@Controller
public class AdminGroupController {
	
	
	@Autowired
	private GroupeRepository groupeRepository;
	
	@Autowired 
	SpectacleRepository spectacleRepository;
	
	@GetMapping("/admin/groupe")
	public String toGroupe(Model model) {
		
		model.addAttribute("groupes", groupeRepository.findAll());
		return "adminGroupe";
	}
	
    @GetMapping("/admin/groupe/delete")
    public String deleteGroupe(@RequestParam Integer id) {
    	Groupe groupeToDelete = groupeRepository.findById(id).get();
    	groupeRepository.delete(groupeToDelete);
    	
    	return "redirect:/admin/groupe";
    }
    
    
	@GetMapping("/admin/groupe/update")
	public String toGroup(Model model ,@RequestParam(required = false) Integer id) {
	 	Groupe groupe =new Groupe();
    	if (id != null) {
    		Optional<Groupe> optionalGroupe = groupeRepository.findById(id);
    		if (optionalGroupe.isPresent()) {
    			groupe = optionalGroupe.get();
    		}
    	}
    	model.addAttribute("spectacles", spectacleRepository.findAll());
		model.addAttribute("groupe", groupe);
		return "adminGroupeUpdate";
	}
	
	@PostMapping("/admin/groupe/update")
	public String postArticle(Model model, @ModelAttribute Groupe groupe) {
		
		model.addAttribute("spectacles", spectacleRepository.findAll());
    	groupeRepository.save(groupe);
		return "redirect:/admin/groupe";
	}
}
