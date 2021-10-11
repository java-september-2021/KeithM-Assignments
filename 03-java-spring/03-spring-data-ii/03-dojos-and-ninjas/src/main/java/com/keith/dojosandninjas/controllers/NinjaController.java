package com.keith.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.keith.dojosandninjas.models.Ninja;
import com.keith.dojosandninjas.services.DojoServices;
import com.keith.dojosandninjas.services.NinjaServices;

@Controller
@RequestMapping("/ninja")
public class NinjaController {

		@Autowired
		private NinjaServices nServices;
		@Autowired
		private DojoServices dServices;
		
		@GetMapping("/new")
		public String create(@ModelAttribute("ninja") Ninja ninja, Model viewModel) {
			viewModel.addAttribute("dojos", this.dServices.getAllDojo());
			return "newninja.jsp";
		}
		
		@PostMapping("/newNinja")
		public String addNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
			
			if(result.hasErrors()) {
				return "newninja.jsp";
			}
			
			this.nServices.createNinja(ninja);
			
			return "redirect:/";
		}
}
