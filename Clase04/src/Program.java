
public class Program {
	
	public static void main(String[] args) {
	
		/*
		//Thread t1 = new Thread();
		Hilo h1 = new Hilo();
		
		//t1.start();
		h1.start();
		
		System.out.println("Termino main");
		*/
		
		Hilo hilo = new Hilo();
		Thread t1 = new Thread(hilo, "Mi hilo");
		
		System.out.println("Empieza main");
		
		t1.start();
		
		try {			
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		t1.interrupt();
		
		System.out.println("Termino main");
	}
	
}
