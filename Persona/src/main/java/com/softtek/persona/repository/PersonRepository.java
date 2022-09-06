package com.softtek.persona.repository;

import org.springframework.data.repository.CrudRepository;

import com.softtek.persona.modelo.Personas;


public interface PersonRepository extends CrudRepository<Personas, Long> {

}
