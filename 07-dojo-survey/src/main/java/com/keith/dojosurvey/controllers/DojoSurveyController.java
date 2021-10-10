package com.keith.dojosurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DojoSurveyController {
	
	@GetMapping("/")
	public String index() {
		return "form.jsp";
	}
	
	@GetMapping("/result")
	public String result(HttpSession session) {
		session.getAttribute("name");
		session.getAttribute("location");
		session.getAttribute("language");
		session.getAttribute("comment");
		return "result.jsp";
	}
	
	@PostMapping("/store")
	public String store(@RequestParam("name")String name, @RequestParam("location")String location, @RequestParam("language")String language, @RequestParam("comment")String comment, HttpSession session){		
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("language", language);
		session.setAttribute("comment", comment);
		return "redirect:/result";
	}
	

}
