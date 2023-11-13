
public class Generics {

	public static void main(String[] args) {
		
		/*
		Caja caja = new Caja();
		
		caja.guardar(1);
		caja.guardar("hola");
		
		Object o = caja.sacar();
		*/
		
		Caja<String> caja = new Caja<String>();
		
		//caja.guardar(1); // Error!
		caja.guardar("hola");
		
		String str = caja.sacar();
		
		System.out.println(str);
		
		Caja<Integer> otraCaja = new Caja<Integer>();
		
		otraCaja.guardar(1);
		//caja.guardar("hola"); // Error!
		
		Integer num = otraCaja.sacar();
		
		System.out.println(num);

	}

}
