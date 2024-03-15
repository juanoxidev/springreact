package com.springreact.test.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.springreact.test.entity.Persona;

public interface PersonaService {

	Page<Persona> findAll(Pageable page);

}
