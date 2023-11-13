/*
 1. Cargar un String por teclado e implementar los siguientes métodos:
● Imprimir la cantidad de caracteres que posee.
● Imprimir la primera mitad de los caracteres de la cadena.
● Imprimir el último caracter.
● Imprimirlo en forma inversa.
● Imprimir cada caracter del String separado con un guión.
● Implementar un método que verifique si la cadena posee la palabra “hola”
(indistintamente si posee letras mayúsculas o minúsculas)

2. Cree un algoritmo para comprimir cadenas, dada una cadena “aAaBbccccaab” el resultado
debe ser “a3b2c4a2b1”. Nótese que cuenta la cantidad de letras consecutivas si distinguir
entre mayúsculas y minúsculas. 

*/

public class StringUtils {

	public static int getLength(String str) {
		if(str != null) {
			return str.length();			
		}
		else {
			return 0;
		}
	}
	
	public static String printHalf(String str) {
		
		if(str != null) {
			int len = str.length();
			
			if(len < 2) {
				return str;
			}
			else {
				int newLen = Math.round(len/2);
				return str.substring(0, newLen);
			}		
		}
		else {
			return "";
		}
	}
	
	public static String getLastChar(String str) {
		if(str != null) {
			return str.substring(str.length()-1);			
		}
		else {
			return "";
		}
	}
	
	public static String reverse(String str) {
		if(str != null) {
			return new StringBuilder(str).reverse().toString();			
		}
		else {
			return "";
		}
	}
	
	public static String dashWord(String str) {
		String s = "";
		
		if(str != null) {
			int len = str.length();
			
			for(int i=0; i<len; i++){
				s += str.charAt(i);
				s += "-";
			}			
		}
		
		return s;
	}
	
	public static boolean containsHola(String str) {
		
		boolean resp = false;
		
		if(str != null) {
			
			if(str.toLowerCase().contains("hola")) {
				resp = true;
			}
		}
		
		return resp;
	}
	
	public static String comprimirCadena(String str) {
		String s = "";
		String caracter = "";
		int cont = 0;
		
		if(str != null && !str.isEmpty()) {
				
			for(int i=0; i<str.length(); i++) {
				if(i==0) {
					cont++;
				}
				else if(caracter.compareToIgnoreCase(String.valueOf(str.charAt(i))) == 0) {
					cont++;
				}
				else {
					s += caracter.toLowerCase() + cont;
					cont = 1;		
				}
				
				caracter = String.valueOf(str.charAt(i));
				if(i == str.length()-1) {
					s += caracter.toLowerCase() + cont;						
				}
				
			}
			
		}
		
		return s;
	}
	
}
