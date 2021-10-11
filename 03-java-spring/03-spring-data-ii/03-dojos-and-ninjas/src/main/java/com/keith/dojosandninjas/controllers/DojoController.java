package com.keith.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.keith.dojosandninjas.models.Dojo;
import com.keith.dojosandninjas.services.DojoServices;

@Controller
@RequestMapping("/dojo")
public class DojoController {

	@Autowired
	private DojoServices dServices;
	
	
	
	@GetMapping("/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "newdojo.jsp";
	}
	
	
	@PostMapping("/newDojo")
	public String addDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		
		if(result.hasErrors()) {
			return "newdojo.jsp";
		}
		
		this.dServices.create(dojo);
		
		return "redirect:/";
	}
	
}

