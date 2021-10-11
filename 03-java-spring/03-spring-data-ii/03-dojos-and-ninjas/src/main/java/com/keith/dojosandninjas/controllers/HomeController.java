package com.keith.dojosandninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.keith.dojosandninjas.services.DojoServices;


@Controller
public class HomeController {
	
	@Autowired
	private DojoServices dServices;
	
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("allDojos", dServices.getAllDojo());
		return "index.jsp";
	}
	
	
}
