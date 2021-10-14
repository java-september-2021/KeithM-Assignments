package com.keith.dojooverflow.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keith.dojooverflow.models.Answer;
import com.keith.dojooverflow.models.NewQuestion;
import com.keith.dojooverflow.models.Question;
import com.keith.dojooverflow.models.Tag;
import com.keith.dojooverflow.repository.AnswerRepository;
import com.keith.dojooverflow.repository.QuestionRepository;
import com.keith.dojooverflow.repository.TagRepository;

@Service
public class AppServices {
	
		@Autowired
		private QuestionRepository qRepo;
	
		@Autowired
		private AnswerRepository aRepo;
		
		@Autowired
		private TagRepository tRepo;
		
		public void createQuestion(NewQuestion question) {
			
			List<Tag> questionTags = new ArrayList<Tag>();
			
			for(String subject: question.splitTags()) {
				
				Tag tag = this.tRepo.findBySubject(subject).orElse(null);
				if(tag == null) {
					
					tag = new Tag(subject);
					this.tRepo.save(tag);
				}
				
				if(!questionTags.contains(tag))
					questionTags.add(tag);
			}
			
			Question newQuestion = new Question(question.getQuestion(), questionTags);
		    qRepo.save(newQuestion);
		}
		
		public Answer createAnswer(Answer answer) {
			return this.aRepo.save(answer);
		}
		
		public Tag createTag(Tag tag) {
			return this.tRepo.save(tag);
		}
		
		public Question getSingleQuestion(Long id) {
			return this.qRepo.findById(id).orElse(null);
		}
		
		public List<Question> getAllQuestions(){
			return qRepo.findAll();
		}
		
		public List<Answer> getAllAnswers(){
			return aRepo.findAll();
		}
		
		public List<Tag> getAllTags(){
			return tRepo.findAll();
		}

		 public Question findQuestion(Long id) {
			Optional<Question> optionalQuestion = qRepo.findById(id);
		 	if(optionalQuestion.isPresent()) {
		 		return optionalQuestion.get();
		 	} else {
		 		return null;
		 	}
		 }
		 
}
