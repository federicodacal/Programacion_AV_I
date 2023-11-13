
public class Persona extends Object implements Comparable<Persona> {
	
	// Wrappers
	private Integer dni;
	private String nombre;
	
	public Persona(int dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	
	public Persona(int dni) {
		this.dni = dni;
	}
	
	public Persona() {
		
	}
	
	public int getDni() {
		return this.dni;
	}
	
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void mostrar() {
		System.out.println(this.nombre + " " + this.dni);
	}
	
	public static void mostrarEstatico() {
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		else if(obj.getClass().equals(this.getClass())) {
			Persona p = (Persona)obj;
			
			if(p.dni == this.dni && p.nombre.equals(this.nombre)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	@Override 
	public String toString() {
		return this.nombre + " " + this.dni;
	}
	
	@Override
	public int hashCode() {
		final int primo = 31;
		int resultado = primo * this.dni;
		
		if(this.nombre != null) {
			resultado += this.nombre.hashCode();			
		}
		
		return resultado;
	}
	
	/*
	public int compareTo(Object o) {
		Persona p = (Persona) o;
		return this.getNombre().compareTo(p.getNombre());
	}*/
	
	public int compareTo(Persona p) {
		return this.getNombre().compareTo(p.getNombre());
	}
	
}
