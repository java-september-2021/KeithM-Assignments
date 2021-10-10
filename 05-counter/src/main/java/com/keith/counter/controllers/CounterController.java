package com.keith.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CounterController {
	@GetMapping("/")
	public String index(Model viewModel, HttpSession session) {
		if(session.getAttribute("count") == null) {
		session.setAttribute("count", 0);
		} 
		viewModel.addAttribute("count", session.getAttribute("count"));
		return "index.jsp";
	}
	
	@GetMapping("/counter")
	public String count(HttpSession session) {
		int counter = (int)session.getAttribute("count");
		int plusOne = counter + 1;
		session.setAttribute("count", plusOne);
		return "counter.jsp";
	}
	
}
