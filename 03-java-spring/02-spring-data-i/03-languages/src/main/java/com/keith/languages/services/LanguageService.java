package com.keith.languages.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keith.languages.models.Language;
import com.keith.languages.repository.LanguageRepository;

@Service
public class LanguageService {
	@Autowired
	private LanguageRepository lRepo;

	//Get all languages in an array
	public List<Language> getAllLanguages(){
		return this.lRepo.findAll();
	}
	
	//Get one language
	public Language getOneLanguage(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	
	//Create a language
	public Language createLanguage(Language language) {
		return this.lRepo.save(language);
	}
	
	//Edit a language
	public Language editLanguage(Language language) {
		return this.lRepo.save(language);
	}
	
	//Delete a language
	public void deleteLanguage(Long id) {
		this.lRepo.deleteById(id);
	}

}
