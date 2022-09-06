package com.softtek.persona.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.persona.dto.PersonaDTO;
import com.softtek.persona.service.PersonaService;

@RestController
public class PersonaController {
	
	@Autowired
	PersonaService personaService;
	
	
	@GetMapping("/executeListPersonas")
	public List<PersonaDTO> executeListPersona(){
		return  personaService.executeGetPersonas();
	}
	
	@GetMapping("/executeListPersonasById")
	public PersonaDTO executeListPersonaById(@RequestParam(value="id", defaultValue="1" ) Long id){
		System.out.println(id);
		return  personaService.executeGetPersonasById(id);
	}

	@PostMapping("/executeSavePersona")
	public PersonaDTO executeSavePersona(@RequestBody PersonaDTO newPersona){
		
		return personaService.executeSavePersona(newPersona);	
	}
	
	
	@DeleteMapping("/executeDeletePersonaById")
	public String executeDeletePersonaById(@RequestParam(value="id")Long id) {
		return personaService.executeDeletePersonaById(id);
		
		
	}
}
