package com.example.demo.controller;
 
import java.util.ArrayList;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PersonaDTO;
import com.example.demo.dto.PersonaMapper;
import com.example.demo.model.DomicilioModel;
import com.example.demo.model.PersonaModel;
import com.example.demo.repository.PersonaRepository;


@RestController
@RequestMapping("/api")
public class PersonaController {
	
	@Autowired // Singleton de la entidad para no generar múltiples objetos
	PersonaRepository personaRepository;
	
	@Autowired 
	PersonaMapper personaMapper;  
	
	@GetMapping({"/saludar", "/saludo"})
	public String saludar() {
		return "Hola";
	}
	
	@GetMapping("/persona")
	public ResponseEntity<?> obtenerPersona() {
		try {
			PersonaModel p = new PersonaModel();
			p.setId(1L);
			p.setNombre("Juan");
			p.setApellido("Perez");
			p.setDni(100);
			return new ResponseEntity<PersonaModel>(p, HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/persona/{id}")
	public ResponseEntity<?> obtenerPersonaPorId(@PathVariable Long id) {
		/* try {
			if(id == 1) {
				PersonaModel p = new PersonaModel();
				p.setId(1L);
				p.setNombre("Juan");
				p.setApellido("Perez");
				p.setDni(100);
				return new ResponseEntity<PersonaModel>(p, HttpStatus.OK);
			}
			else {
				return new ResponseEntity<String>("No se encontró el id " + id, HttpStatus.CONFLICT);
			}

		}
		catch(Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		} */
		
		if(id == null) {
			return new ResponseEntity<String>("del /persona " + id, HttpStatus.OK);
		}
		try {
			
			java.util.Optional<PersonaModel> pOpt = personaRepository.findById(id);
			
			if(pOpt.isPresent()) {
				return new ResponseEntity<PersonaModel>(pOpt.get(), HttpStatus.OK);
			}
			else {
				return new ResponseEntity<String>("No se encontró persona con id " + id, HttpStatus.OK);
			}
		}
		catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/personas")
	public ResponseEntity<?> obtenerPersonas() {
		
		/* List<PersonaModel> personas = new ArrayList<>();
		
		PersonaModel p1 = new PersonaModel();
		p1.setId(1L);
		p1.setNombre("Juan");
		p1.setApellido("Perez");
		p1.setDni(100);
		
		PersonaModel p2 = new PersonaModel();
		p2.setId(2L);
		p2.setNombre("Pepe");
		p2.setApellido("Pepito");
		p2.setDni(200);
		
		personas.add(p1);
		personas.add(p2); */
		
		List<PersonaModel> personas = (List<PersonaModel>) personaRepository.findAll();
		
		return new ResponseEntity<List<PersonaDTO>>(personaMapper.lstEntityToLstDto(personas), HttpStatus.OK);
	}
	
	@PostMapping("/persona")
	public ResponseEntity<?> crearPersona(@RequestBody @Validated PersonaModel p) {
		
		System.out.println(p.toString());
		
		for(DomicilioModel d : p.getDomicilios()) {
			d.setPersona(p);
		}
		
		personaRepository.save(p);
		
		return new ResponseEntity<String>("Persona creada", HttpStatus.OK);
	}
	
	@DeleteMapping("/persona")
	public ResponseEntity<?> eliminarPersona(@RequestBody @Validated PersonaModel p) {
		
		System.out.println(p.toString());
		
		personaRepository.delete(p);
				
		return new ResponseEntity<String>("Persona eliminada", HttpStatus.OK);
	}
	
	@PutMapping("/persona")
	public ResponseEntity<?> modificarPersona(@RequestBody @Validated PersonaDTO p) {
		
		System.out.println(p.toString());
		
		java.util.Optional<PersonaModel> pOpt = personaRepository.findById(p.getId());
		
		if(pOpt.isPresent()) {
			personaRepository.save(personaMapper.dtoToEntity(p)); // Si tiene id hace un update, si no tiene id hace insert
			return new ResponseEntity<String>("Persona modificada", HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("No se encontró persona con id " + p.getId(), HttpStatus.OK);
		}
	}
	
	/*******************************************************************************/
	
	@GetMapping("/personaApellido/{lastname}")
	public ResponseEntity<?> obtenerPersonaPorApellido(@PathVariable String lastname) {
		if(lastname == null) {
			return new ResponseEntity<String>("del /personaApellido", HttpStatus.OK);
		}
		try { 
			
			List<PersonaModel> entities = personaRepository.findAllByApellido(lastname); 
			
			return new ResponseEntity<List<PersonaDTO>>(personaMapper.lstEntityToLstDto(entities), HttpStatus.OK);

		}
		catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/personaNombre/{name}")
	public ResponseEntity<?> obtenerPersonaPorNombre(@PathVariable String name) {
		if(name == null) {
			return new ResponseEntity<String>("del /personaNombre", HttpStatus.OK);
		}
		try {
			
			String calle = "Calle Falsa";
			
			List<PersonaModel> entities = personaRepository.buscarPorDatos(name, calle); 
			
			return new ResponseEntity<List<PersonaDTO>>(personaMapper.lstEntityToLstDto(entities), HttpStatus.OK);

		}
		catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	
}
