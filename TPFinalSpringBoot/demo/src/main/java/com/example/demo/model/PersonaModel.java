package com.example.demo.model;

import javax.persistence.Transient;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "sys_persona")
public class PersonaModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1367246936244134243L;

	@Column(name = "per_id")
	@Id // PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTOINCREMENTAL
	private Long id;
	
	@NotEmpty
	@Column(name = "per_nombre")
	private String nombre;
	
	@NotBlank
	@Column(name = "per_apellido")
	private String apellido;
	
	@NotNull
	@Column(name = "per_dni")
	private Integer dni;
	
	@Column(name = "per_sexo")
	private String sexo;
	
	@OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
	private List<DomicilioModel> domicilios;

	@Transient // no se guarda en BD
	private String atrNoPersistido;
	
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public Integer getDni() {
		return this.dni;
	}
	
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public List<DomicilioModel> getDomicilios() {
		return domicilios;
	}

	public void setDomicilios(List<DomicilioModel> domicilio) {
		this.domicilios = domicilio;
	}

	@Override 
	public String toString() {
		return "Persona [id= " + id + ", nombre= " + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
	}

}
