package com.example.demo.dto;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.PersonaModel;

@Component
public class PersonaMapper {
	
	@Autowired
	DomicilioMapper dMapper;

	public PersonaModel dtoToEntity(PersonaDTO dto) {
		PersonaModel entity = new PersonaModel();
		
		entity.setId(dto.getId());
		entity.setApellido(dto.getApellido());
		entity.setNombre(dto.getNombre());
		entity.setDni(dto.getDni());
		entity.setSexo(dto.getSexo());
		entity.setDomicilios(dMapper.lstDtoToLstEntity(dto.getDomicilios()));
		
		return entity;
	}
	
	public PersonaDTO entityToDto(PersonaModel entity) {
		PersonaDTO dto = new PersonaDTO();
		
		dto.setId(entity.getId());
		dto.setApellido(entity.getApellido());
		dto.setNombre(entity.getNombre());
		dto.setDni(entity.getDni());
		dto.setSexo(entity.getSexo());
		dto.setDomicilios(dMapper.lstEntityToLstDto(entity.getDomicilios()));
		
		return dto;
	}
	
	public List<PersonaDTO> lstEntityToLstDto(List<PersonaModel> entity) {
		List<PersonaDTO> dto = new ArrayList<>();
		
		for(PersonaModel e : entity) {
			dto.add(this.entityToDto(e));
		}
		
		return dto;
	}
	
}
