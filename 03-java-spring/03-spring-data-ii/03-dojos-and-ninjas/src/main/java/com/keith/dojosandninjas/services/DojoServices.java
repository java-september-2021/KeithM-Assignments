package com.keith.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keith.dojosandninjas.models.Dojo;
import com.keith.dojosandninjas.respository.DojoRepository;

@Service
public class DojoServices {
	@Autowired
	private DojoRepository dRepo;
	
	public Dojo create(Dojo dojo) {
		return this.dRepo.save(dojo);
	}
	
	public List<Dojo> getAllDojo(){
		return this.dRepo.findAll();
	}
}
