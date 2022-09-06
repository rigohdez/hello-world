package com.softtek.persona.dao;

import java.util.List;

import com.softtek.persona.dto.PersonaDTO;

public interface PersonaDao {
	
	List<PersonaDTO> executeGetPersonas();
	PersonaDTO executeGetPersonasById(Long id);
	PersonaDTO executeSavePersona(PersonaDTO newPersona);
	
	String executeDeletePersonaById(Long id);
	
}
