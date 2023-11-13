
public class Motor {
	
	private boolean encendido;
	
	public Motor() {
		this.encendido = false;
	}
	
	public boolean getEncendido() {
		return this.encendido;
	}
	
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	public void arrancar() {
		this.setEncendido(true);
	}
	
	public void apagar() {
		this.setEncendido(false);
	}

}
