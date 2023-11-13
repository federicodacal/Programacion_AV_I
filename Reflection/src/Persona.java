
public class Persona {

	public String nombre;
	private Long dni;
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public Long getDni() {
		return this.dni;
	}
	
	private void setDni(Long dni) {
		this.dni = dni;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre: " + this.nombre + "]";
	}
	
	public void mostrar() {
		System.out.println(this.toString());
	}
	
}
