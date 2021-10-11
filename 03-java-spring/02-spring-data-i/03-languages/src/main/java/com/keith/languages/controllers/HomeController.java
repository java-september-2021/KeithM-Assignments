package com.keith.languages.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.keith.languages.models.Language;
import com.keith.languages.services.LanguageService;

@Controller
public class HomeController {
	@Autowired
	private LanguageService lService;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("allLanguages", lService.getAllLanguages());
		return "index.jsp";
	}

//	@PostMapping("/new")
//	public String addNew(@RequestParam("lName") String language, @RequestParam("cName") String creator, @RequestParam("version") String version) {
//		Language languageToCreate = new Language(language, creator, version);
//		this.lService.createLanguage(languageToCreate);
//		return "redirect:/";
//	}
	
	@GetMapping("/new")
	public String add(@ModelAttribute("newLanguage") Language language) {
		return "new.jsp";
	}
	
	
	@PostMapping("/new")
	public String addRecord(@Valid @ModelAttribute("newLanguage") Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "new.jsp";
		}
		this.lService.createLanguage(language);
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String editRecord(@PathVariable("id") Long id, @ModelAttribute("language") Language language, Model viewModel) {
		viewModel.addAttribute("language", this.lService.getOneLanguage(id));
		return "edit.jsp";
	}
	
	
	@PostMapping("/edit/{id}")
	public String edit(@Valid @ModelAttribute("language") Language language, BindingResult result, @PathVariable("id") Long id, Model viewModel) {
		if(result.hasErrors()) {
			viewModel.addAttribute("language", this.lService.getOneLanguage(id));
			return "edit.jsp";
		}
		this.lService.editLanguage(language);
		return "redirect:/";
	}
	
	@GetMapping("/show/{id}")
	public String showRecord(@PathVariable("id") Long id, @ModelAttribute("language") Language language, Model viewModel) {
		viewModel.addAttribute("language", this.lService.getOneLanguage(id));
		return "language.jsp";
	}
	
	@GetMapping("/delete/{id}")
	public String Delete(@PathVariable("id") Long id) {
		lService.deleteLanguage(id);
		return "redirect:/";
	}
	
	
}
