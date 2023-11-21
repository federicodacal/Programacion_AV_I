package com.example.demo.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.model.DomicilioModel;

@Component
public class DomicilioMapper {
		
	public DomicilioModel dtoToEntity(DomicilioDTO dto) {
		DomicilioModel entity = new DomicilioModel();
				
		entity.setId(dto.getId());
		entity.setCalle(dto.getCalle());
		entity.setAltura(dto.getAltura());
		
		return entity;
	}
	
	public DomicilioDTO entityToDto(DomicilioModel entity) {
		
		DomicilioDTO dto = new DomicilioDTO();
				
		dto.setId(entity.getId());
		dto.setCalle(entity.getCalle());
		dto.setAltura(entity.getAltura());
		
		return dto;
	}
	
	public List<DomicilioDTO> lstEntityToLstDto(List<DomicilioModel> entity) {
		List<DomicilioDTO> dto = new ArrayList<>();
		
		for(DomicilioModel e : entity) {
			dto.add(this.entityToDto(e));
		}
		
		return dto;
	}
	
	public List<DomicilioModel> lstDtoToLstEntity(List<DomicilioDTO> dto) {
		List<DomicilioModel> entity = new ArrayList<>();
		
		for(DomicilioDTO d : dto) {
			entity.add(this.dtoToEntity(d));
		}
		
		return entity;
	}
}
