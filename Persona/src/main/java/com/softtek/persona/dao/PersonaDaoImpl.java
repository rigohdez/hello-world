package com.softtek.persona.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softtek.persona.dto.PersonaDTO;
import com.softtek.persona.modelo.Personas;
import com.softtek.persona.repository.PersonRepository;

@Repository
public class PersonaDaoImpl implements PersonaDao{

	@Autowired
	DataSource dataSourse;
	
	@Autowired
	PersonRepository personRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<PersonaDTO> executeGetPersonas() {

		List<PersonaDTO> listPersonasSalida = new ArrayList<>();

		for (Personas personaDataBase : personRepository.findAll()) {
			PersonaDTO personaEnMemoria = new PersonaDTO();
			personaEnMemoria.setId(personaDataBase.getPerson_id());
			personaEnMemoria.setName(personaDataBase.getFirst_name());
			personaEnMemoria.setLastName(personaDataBase.getLast_name());
			
			listPersonasSalida.add(personaEnMemoria);

		}

		return listPersonasSalida;
	}

	@Override
	public PersonaDTO executeGetPersonasById(Long id) {
		
		Personas personaDataBase = personRepository.findById(id).get();
		
		PersonaDTO personaSalida = new PersonaDTO();
		
		personaSalida.setId(personaDataBase.getPerson_id());
		personaSalida.setName(personaDataBase.getFirst_name());
		personaSalida.setLastName(personaDataBase.getLast_name());
		
		return personaSalida;
	}
	
	@Override
	public PersonaDTO executeSavePersona(PersonaDTO newPersona) {
		
		Personas personaNueva = new Personas();
		
		personaNueva.setPerson_id(newPersona.getId());
		personaNueva.setFirst_name(newPersona.getName());
		personaNueva.setLast_name(newPersona.getLastName());
		
		personRepository.save(personaNueva);
		
		return newPersona;
	}
	

	@Override
	public String executeDeletePersonaById(Long id) {
		personRepository.deleteById(id);
		return null;
		
	}

}
