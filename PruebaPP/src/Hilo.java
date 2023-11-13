
public class Hilo extends Thread {
	public void run() {
		for(int i=0; i<4; i++) {
			try {
				Thread.sleep(1000000L);
			}
			catch(InterruptedException e) {
				
			}
		}
	}
}
