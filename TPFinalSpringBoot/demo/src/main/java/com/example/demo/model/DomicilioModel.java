package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.io.Serializable;

import javax.persistence.CascadeType;

@Entity
@Table(name = "sys_domicilio")
public class DomicilioModel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7369456692304428967L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dom_id")
	private Long id;
	
	@Column(name = "dom_calle")
	private String calle;
	
	@Column(name = "dom_altura")
	private Integer altura;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "per_id")
	private PersonaModel persona;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getAltura() {
		return altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	public PersonaModel getPersona() {
		return persona;
	}

	public void setPersona(PersonaModel persona) {
		this.persona = persona;
	}
	
	

}
