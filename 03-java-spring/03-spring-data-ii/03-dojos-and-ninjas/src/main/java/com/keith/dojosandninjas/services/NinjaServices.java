package com.keith.dojosandninjas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keith.dojosandninjas.models.Ninja;
import com.keith.dojosandninjas.respository.NinjaRepository;

@Service
public class NinjaServices {
	@Autowired
	private NinjaRepository nRepo;
	
	public Ninja createNinja(Ninja ninja) {
		return this.nRepo.save(ninja);
	}
}
