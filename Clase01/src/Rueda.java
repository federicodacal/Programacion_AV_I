
public class Rueda {

	public boolean inflada;
	
	public Rueda() {
		this.inflada = true;
	}
	
	public boolean getInflada() {
		return this.inflada;
	}
	
	public void setInflada(boolean inflada) {
		this.inflada = inflada;
	}
	
	public void inflar() {
		this.setInflada(true);
	}
	
	public void desinflar() {
		this.setInflada(false);
	}
	
}
