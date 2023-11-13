
public class Puerta {

	public boolean abierta;
	public Ventana ventana;
	
	public Puerta() {
		this.ventana = new Ventana();
		this.abierta = false;
	}
	
	public Ventana getVentana() {
		return this.ventana;
	}
	
	public void setVentana(Ventana ventana) {
		this.ventana = ventana;
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
