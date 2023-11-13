package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PersonaModel;

@Repository
public interface PersonaRepository extends CrudRepository<PersonaModel, Long>{ // <Entidad, Tipo del id>
	
}