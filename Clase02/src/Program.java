import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/*
		System.out.println("Ingrese dato:");
		
		Scanner sc = new Scanner(System.in);
		String stg = sc.nextLine();
		
		System.out.println(stg);
		System.out.println("Length: " + StringUtils.getLength(stg));
		System.out.println(StringUtils.printHalf(stg));
		System.out.println(StringUtils.getLastChar(stg));
		System.out.println(StringUtils.reverse(stg));
		System.out.println(StringUtils.dashWord(stg));
		System.out.println(StringUtils.containsHola(stg));
		System.out.println(StringUtils.comprimirCadena(stg));
		
		System.out.println("**********************************************\n");*/
		
		/*
		3. Cree una interface llamada ICalcular, que tenga los siguientes métodos:
		● sumar
		● restar
		● multiplicar
		● dividir throw MiExcepcion
		Todos los métodos reciben dos parámetros del tipo Numbre y retornan un Double. El
		método dividir debe lanzar una excepción si se intenta dividir por 0.
		Cree una clase llamada calculadora la cual implemente la interface anterior.
		En el método main se deben mostrar por consola todos los métodos disponibles y un
		número. El usuario debe ingresar la operación deseada y los valores requeridos por el
		método   
		*/
		
		Calculadora c = new Calculadora();
		Double x = 4D;
		Double y = 0D;
		
		System.out.println(c.sumar(x, y));
		System.out.println(c.restar(x, y));
		System.out.println(c.multiplicar(x, y));
		
		try {
			System.out.println(c.dividir(x, y));			
		}
		catch(MiException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
