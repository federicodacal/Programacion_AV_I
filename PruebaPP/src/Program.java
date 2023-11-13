import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Program {
	
	private void mostrarPalabra() {
		System.out.println("Palabra");
	}
	
	public void mostrarNumero(String n) {
		System.out.println("Palabra");
	}

	public static void main(String[] args) {
		
		/*
		String uno = new String("UNO");
		String dos = new String("DOS");
		String tres = new String("UNO");
		
		Map lista = new TreeMap();
		lista.put(uno, uno);
		lista.put(dos, dos);
		lista.put(tres, tres);
		
		System.out.println(lista.size());
		*/
		
		/*
		Hilo h = new Hilo();
		h.start();
		h.interrupt();
		System.out.println(h.isAlive());
		*/
		
		Class clazz = Program.class;
		Method[] metodos = clazz.getDeclaredMethods();
		
		for(Method m:metodos) {
			try {
				System.out.println(m.getName());
				m.invoke(clazz.newInstance(), null);
			}
			catch(Exception e) {
				
			}
		}
	}
	
}
