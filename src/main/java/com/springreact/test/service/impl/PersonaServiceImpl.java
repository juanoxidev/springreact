package com.springreact.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.springreact.test.entity.Persona;
import com.springreact.test.repository.PersonaRepository;
import com.springreact.test.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaRepository personaRepository;

	@Override
	public Page<Persona> findAll(Pageable page) {
		// TODO Auto-generated method stub
		return personaRepository.findAll(page);
	}

}
