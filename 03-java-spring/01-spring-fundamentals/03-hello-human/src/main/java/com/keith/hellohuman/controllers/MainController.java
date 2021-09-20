package com.keith.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/{name}")
	public String userName(@PathVariable("name") String name, Model viewModel) {
		viewModel.addAttribute("name", name);
		return "name.jsp";
	
	}
	
}
