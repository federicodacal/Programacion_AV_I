
public class Program {

	public static void main(String[] args) {
		
		/*
		MiHilo hilo = new MiHilo(0); // Unica instancia de 'MiHilo'
		
		Thread t1 = new Thread(hilo, "t1");
		Thread t2 = new Thread(hilo, "t2");
		
		t2.start();
		t1.start();
		
		hilo.otroMetodo();
		
		
		while(t1.isAlive() || t2.isAlive()) { }
		
		System.out.println("Cantidad de procesos: " + hilo.contador);
		*/
		// notify, notifyAll
		
		System.out.println("**********************************************");
		
		MiHilo2 miHilo = new MiHilo2(0);
		
		Thread t3 = new Thread(miHilo, "t3");
		Thread t4 = new Thread(miHilo, "t4");
		
		t3.start();
		t4.start();
		
		miHilo.otroMetodo();
				
		while(t3.isAlive() || t4.isAlive()) { 
			
			try {
				Thread.sleep(3000L);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}  
			
			synchronized (miHilo) {
				miHilo.notifyAll();
			}
			
		}		

		System.out.println("Cantidad de procesos: " + miHilo.contador);
		
	}
	
}
