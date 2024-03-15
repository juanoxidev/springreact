package com.springreact.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springreact.test.entity.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
