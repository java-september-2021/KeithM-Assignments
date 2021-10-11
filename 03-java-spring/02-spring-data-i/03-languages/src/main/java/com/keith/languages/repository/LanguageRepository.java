package com.keith.languages.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.keith.languages.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long>{
	
	//Select * from Language
	List<Language> findAll();
	
}
