
public class MiHilo implements Runnable {
	
	Integer contador;
	
	public MiHilo(Integer contador) {
		this.contador = contador;
	}
	
	
	@Override
	public void run() {
		
		for(int i=0; i<1000; i++) {
			
			synchronized(this) {
				int cont = this.contador;
				cont = cont + 1;
				this.contador = cont;	
			}
		}
	}
	
	// public synchronized voidOtroMetodo() {
		// System.out.println("Hola");
	//}
	
	public void otroMetodo() {
		synchronized(this) {
			System.out.println("Hola");
		}
	}

}
