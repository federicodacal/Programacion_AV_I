
public class Ventana {

	public boolean abierta;
	
	public Ventana() {
		this.abierta = false;
	}
	
	public boolean getAbierta() {
		return this.abierta;
	}
	
	public void setAbierta(boolean abierta) {
		this.abierta = abierta;
	}
	
	public void abrir() {
		this.setAbierta(true);
	}
	
	public void cerrar() {
		this.setAbierta(false);
	}
}
