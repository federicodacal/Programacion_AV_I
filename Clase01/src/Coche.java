
public class Coche {
	
	private Motor motor;
	private Rueda[] ruedas = {new Rueda(), new Rueda(), new Rueda(), new Rueda()};
	private Puerta[] puertas = {new Puerta(), new Puerta()};
	
	public Coche() {
		this.motor = new Motor();
	}
	
	public Motor getMotor() {
		return this.motor;
	}
	
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	public Rueda[] getRuedas() {
		return this.ruedas;
	}
	
	public void setRuedas(Rueda[] ruedas) {
		this.ruedas = ruedas;
	}
	
	public Puerta[] getPuertas() {
		return this.puertas;
	}
	
	public void setPuertas(Puerta[] puertas) {
		this.puertas = puertas;
	}
	
	public String arrancar() {
		boolean ok = true;
		String rta = "";
		
		for(Rueda r:this.ruedas) {
			if(!r.inflada) {
				ok = false;
				rta += "Todas las ruedas deben estar infladas!";
				break;
			}
		}
		
		for(Puerta p:this.puertas) {
			if(p.abierta) {
				ok = false;
				rta += "\nTodas las puertas deben estar cerradas!";
				break;
			}
		}
		
		if(ok) {
			rta = "Ruidito de encendido";
			this.motor.arrancar();
		}
		
		return rta;
	}
	
	public String parar() {
		String rta = "";
		
		if(this.getMotor().getEncendido()) {
			this.motor.apagar();
			
			for(Puerta p:this.puertas) {
				p.abrir();
				p.ventana.cerrar();
			}
			
			rta = "Coche apagado";
		}
		else {
			rta = "Ya esta apagado";
		}

		for(Rueda r:this.ruedas) {
			rta += " Rueda inflada: " + r.getInflada();
		}

		return rta;
	}
	

}
