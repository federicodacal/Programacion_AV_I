package com.example.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PersonaModel;

@Repository
public interface PersonaRepository extends CrudRepository<PersonaModel, Long>{ // <Entidad, Tipo del id>
	
	List<PersonaModel> findAllByApellido(String apellido);
	
	@Query("select p from PersonaModel p "
			+ "inner join p.domicilios d "
			+ "where p.nombre =:name "
			+ "and d.calle =:calle")
	List<PersonaModel> buscarPorDatos(String name, String calle);
	
	@Transactional // Query que modifica, una transacción en la BD (anotación implementada también en el método save del controler)
	@Modifying
	@Query("update Persona p set p.sexo = 'femenino'")
	List<PersonaModel> modificarPersona(String name, String calle);
}
