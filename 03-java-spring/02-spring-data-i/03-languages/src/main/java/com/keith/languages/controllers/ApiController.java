package com.keith.languages.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keith.languages.models.Language;
import com.keith.languages.services.LanguageService;

@RestController
@RequestMapping("/api")
public class ApiController {
	@Autowired
	private LanguageService lService;
	

	
	@GetMapping("/{id}")
	public Language getOne(@PathVariable("id") Long id) {
		return this.lService.getOneLanguage(id);
	}
	
	@PostMapping("/create")
	public Language create(Language language) {
		return this.lService.createLanguage(language);
		
	}
	

}
