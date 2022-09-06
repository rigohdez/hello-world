package com.softtek.persona.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.persona.dao.PersonaDao;
import com.softtek.persona.dto.PersonaDTO;

@Service
public class PersonaServiceImpl implements PersonaService{
	
	@Autowired
	PersonaDao personaDao;

	@Override
	public List<PersonaDTO> executeGetPersonas() {
		// TODO Auto-generated method stub
		return personaDao.executeGetPersonas();
	}

	@Override
	public PersonaDTO executeGetPersonasById(Long id) {
		// TODO Auto-generated method stub
		return personaDao.executeGetPersonasById(id);
	}

	@Override
	public PersonaDTO executeSavePersona(PersonaDTO NewPersona) {
		
		return personaDao.executeSavePersona(NewPersona);
	}
	

	@Override
	public String executeDeletePersonaById(Long id) {
		personaDao.executeDeletePersonaById(id);
		return "Persona eliminada";
	}

	

}
