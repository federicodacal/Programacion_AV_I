
public class Program {

	public static void main(String[] args) {
		
		System.out.println("Hola");
		
		int num = 1;
		boolean bool = false;
		
		System.out.println(num);
		System.out.println(num+1);
		
		if(bool) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		/*****************************************************************/
		
		Persona persona = new Persona(100, "Pepe");
		Persona persona2 = new Persona(101);
		Persona otraPersona = null;
		String string = new String("hola");
		String s = "hola!";
		
		persona.mostrar();
		persona2.mostrar();
		// otraPersona.mostrar(); // Exception because otraPersona is null
		
		if(persona.equals(persona2)) {
			System.out.println("Son equivalentes");
		}
		else {
			System.out.println("NO son equivalentes");
		}
		
		/*****************************************************************/
		
		System.out.println(persona.toString());
		
		/*****************************************************************/
		
		System.out.println("Hashcode: " + persona.hashCode());
		System.out.println("Hashcode: " + persona2.hashCode());
		
		/*****************************************************************/
		
		char a = 'a';
		char[] palabra = new char[2];
		palabra[0]='a';
		palabra[1]='b';
		
		String stringPalabra = "ab";
		
		System.out.println(stringPalabra);
		System.out.println(stringPalabra.toUpperCase());
		System.out.println(stringPalabra);
		
		stringPalabra = stringPalabra.toUpperCase();
		
		System.out.println(stringPalabra);
		
		String str1 = "Con";
		String str2 = "cat";
		
		String str3 = str1.concat(str2);
		System.out.println(str3);
		
		if(str3.equalsIgnoreCase("concat")) {
			System.out.println("True");
		}
		
		if(str3.equals("concat")) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
