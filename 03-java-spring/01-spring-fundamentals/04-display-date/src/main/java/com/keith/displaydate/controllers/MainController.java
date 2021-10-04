package com.keith.displaydate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@Controller
public class MainController {

		
	@RequestMapping("/")
	public String hello() {
		return "main.jsp";
	}
		
	@RequestMapping("/date")
	public String date(Model model) {
		Date formatDate = new Date();

    	model.addAttribute("day", new SimpleDateFormat("EEEEE").format(formatDate));
    	model.addAttribute("dayNumber", new SimpleDateFormat("dd").format(formatDate));
    	model.addAttribute("month", new SimpleDateFormat("MMMMM").format(formatDate));
    	model.addAttribute("year", new SimpleDateFormat("yyyy").format(formatDate));
		return "date.jsp";
	}
		
	@RequestMapping("/time")
	public String time(Model model) {
		Date formatTime = new Date();

    	model.addAttribute("hour", new SimpleDateFormat("hh").format(formatTime));
    	model.addAttribute("minute", new SimpleDateFormat("mm").format(formatTime));
    	model.addAttribute("timeOfDay", new SimpleDateFormat("aa").format(formatTime));
		return "time.jsp";
	}	
	
	
	
}
