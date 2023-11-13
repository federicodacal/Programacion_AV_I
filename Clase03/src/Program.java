import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		//List arrayList = new ArrayList();
		//List linkedList = new LinkedList();
		
		List<String> arrayList = new ArrayList<String>();
		List<Integer> linkedList = new LinkedList<Integer>();
		
		arrayList.add("Hola");
		arrayList.add("Chau");
		
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.get(arrayList.size()-1));
		System.out.println("Len: " + arrayList.size());
		
		arrayList.remove(1);
		
		System.out.println("Len: " + arrayList.size());
		
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		for(Object o:arrayList) {
			System.out.println(o);
		}
		
		linkedList.add(1);
		linkedList.add(2);
		
		System.out.println(linkedList.get(0));
		System.out.println(linkedList.get(1));
		System.out.println(linkedList.get(linkedList.size()-1));
		System.out.println("Len: " + linkedList.size());
		
		for(int i=0; i<linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}
		
		for(Object o:linkedList) {
			System.out.println(o);
		}
		
		System.out.println("********************************************************");
		
		/********************************************************/
		
		Set<String> setHash = new HashSet<String>();  
		Set<Persona> setPersona = new HashSet<Persona>();
		
		setHash.add("Juan");
		setHash.add("Pepe");
		setHash.add("Ana");
		setHash.add("Laura");
		setHash.add("Maria");
		
		for(Object o:setHash) {
			System.out.println(o);
		}
		
		System.out.println("-------------");
		
		setHash.remove("Laura");
		setHash.add("Juan"); // No lo agrega
		setHash.add("Juan"); // No lo agrega
		setHash.add("Juan"); // No lo agrega
		
		for(Object o:setHash) {
			System.out.println(o);
		}
		
		System.out.println("********************************************************");
		
		/********************************************************/
		
		Set<Persona> setOrdenado = new TreeSet<Persona>();
		
		setOrdenado.add(new Persona(1234, "Juan"));
		setOrdenado.add(new Persona(1235, "Carlos"));
		setOrdenado.add(new Persona(1236, "Ana"));
		
		for(Object o:setOrdenado) {
			System.out.println(o);
		}
		
		System.out.println("********************************************************");
		
		/********************************************************/
		
		Map map = new HashMap();
		
		map.put("p1", "Prueba1");
		map.put("p2", "Prueba2");
		map.put("p3", "Prueba3");
		
		System.out.println(map.get("p1"));
		System.out.println(map.get("p2"));
 
	}

}
