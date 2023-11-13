
//public class Hilo extends Thread {
public class Hilo implements Runnable {
	
	@Override
	public void run() {
		
		int cont = 1;
		
		Thread thread = Thread.currentThread();
		
		while(true) {
			
			if(Thread.interrupted()) {
				return;
			}
			
			try {			
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
				return;
			}
			
			System.out.println(cont + " Hilo ejecutado: " + thread.getName());
			
			cont++;
		}
		
		
	}

}
