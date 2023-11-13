
public class MiHilo2 implements Runnable {
	
	Integer contador;
	
	public MiHilo2(Integer contador) {
		this.contador = contador;
	}
	
	
	@Override
	public void run() {
		
		for(int i=0; i<1000; i++) {
			
			synchronized(this) {
				try {
					this.wait();
					System.out.println(Thread.currentThread().getName() + " ejecuto el wait");
				}
				catch (InterruptedException e) {
					e.printStackTrace();
					return;
				}
			}
		}
	}
	
	public void otroMetodo() {
		synchronized(this) {
			System.out.println("Hola");
		}
	}
	

}
