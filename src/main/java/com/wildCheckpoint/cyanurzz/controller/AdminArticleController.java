package com.wildCheckpoint.cyanurzz.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wildCheckpoint.cyanurzz.entity.Article;
import com.wildCheckpoint.cyanurzz.repository.ArticleRepository;

@Controller
public class AdminArticleController {
	
	@Autowired
	private ArticleRepository articleRepository;
	
	@GetMapping("/admin/article")
	public String toArticle(Model model) {
		
		model.addAttribute("articles", articleRepository.findAll());
		return "adminArticle";
	}
	
    @GetMapping("/admin/article/delete")
    public String deleteArticle(@RequestParam Integer id) {
    	Article articleToDelete = articleRepository.findById(id).get();
    	articleRepository.delete(articleToDelete);
    	
    	return "redirect:/admin/article";
    }
    
    
	@GetMapping("/admin/article/update")
	public String toArticle(Model model ,@RequestParam(required = false) Integer id) {
	 	Article article =new Article();
    	if (id != null) {
    		Optional<Article> optionalArticle = articleRepository.findById(id);
    		if (optionalArticle.isPresent()) {
    			article = optionalArticle.get();
    		}
    	}
		model.addAttribute("article", article);
		return "adminArticleUpdate";
	}
	
	@PostMapping("/admin/article/update")
	public String postArticle(Model model, @ModelAttribute Article article) {
    	articleRepository.save(article);
    	
		return "redirect:/admin/article";
	}
}
