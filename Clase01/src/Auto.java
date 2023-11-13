
public class Auto {

	private String patente;
	private String modelo;
	private Float precio;
	private EMarca marca;
	
	public Auto(String patente, String modelo, Float precio, EMarca marca) {
		this.patente = patente;
		this.modelo = modelo;
		this.precio = precio;
		this.marca = marca;
	}
	
	public String getPatente() {
		return this.patente;
	}
	
	public void setPatente(String patente) {
		this.patente = patente;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public Float getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	
	public EMarca getMarca() {
		return this.marca;
	}
	
	public void setPrecio(EMarca marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Patente: " + this.patente + " - Marca: " + this.marca + " - Modelo: " + this.modelo + " - Precio: $" + this.precio;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		else if(obj.getClass().equals(this.getClass())) {
			Auto a = (Auto)obj;
			
			if(a.patente == this.patente && a.marca.equals(this.marca)) {
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
	public int hashCode() {
		return this.patente.hashCode() + this.marca.hashCode();
	}
	
	
	
		
}
