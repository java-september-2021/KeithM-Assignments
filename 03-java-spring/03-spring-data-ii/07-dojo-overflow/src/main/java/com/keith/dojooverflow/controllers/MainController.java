package com.keith.dojooverflow.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.keith.dojooverflow.models.Answer;
import com.keith.dojooverflow.models.NewQuestion;
import com.keith.dojooverflow.models.Question;
import com.keith.dojooverflow.services.AppServices;

@Controller
public class MainController {
	
		@Autowired
		private AppServices aServices;
		
		@GetMapping("/")
		public String main(Model viewModel) {
			viewModel.addAttribute("allQuestions", aServices.getAllQuestions());
			return "index.jsp";
		}
		
		@GetMapping("/question/{id}")
		public String displayQuestion(@PathVariable("id") Long id, @ModelAttribute("answers") Answer answers, Model model) {
			model.addAttribute("question", aServices.findQuestion(id));
			return "question.jsp";
		}
		
		@GetMapping("/question/new")
		public String newQuestion(@ModelAttribute("question") Question question) {
			return "newquestion.jsp";
		}
		
		@PostMapping("/question/new/create")
		public String makeQuestion(@Valid @ModelAttribute("question") NewQuestion question, BindingResult result) {
			
			if(result.hasErrors()) {
			return "newquestion.jsp";
			}
			
			this.aServices.createQuestion(question);
			
			return "redirect:/";			
			
		}
		
		@PostMapping("/addAnswer")
		public String addAnswer(@Valid @ModelAttribute("answers") Answer answer, BindingResult result) {
			
			if(result.hasErrors()) {
			return "question.jsp";
			}
			
			this.aServices.createAnswer(answer);
			
			Long id = answer.getAnsweredQuestion().getId();
			return "redirect:/question/" + id;
		}

}
