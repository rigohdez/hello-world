package com.softtek.persona.service;

import java.util.List;

import com.softtek.persona.dto.PersonaDTO;

public interface PersonaService {
	
	List<PersonaDTO> executeGetPersonas();
	PersonaDTO executeGetPersonasById(Long id);
	PersonaDTO executeSavePersona(PersonaDTO newPersona);
	
	String executeDeletePersonaById(Long id);
	
}
