/* 2. 
Crea las siguientes clases:
● Motor: con métodos para arrancar el motor y apagarlo.
● Rueda: con métodos para inflar la rueda y desinflarla.
● Ventana: con métodos para abrirla y cerrarla.
● Puerta: con una ventana y métodos para abrir la puerta y cerrar la puerta.
● Coche: con un motor, cuatro ruedas y dos puertas;
con los métodos: Arrancar (chequea que las puertas estén cerradas, que las ruedas
estén infladas y arranca el motor. Si falla algo, se deberá informar lo ocurrido por
consola), Parar (chequea que el coche este andando, apaga el motor, abre las
puertas y cierra las ventanas. Si falla algo, se deberá informar lo ocurrido por
consola) y control (debe informar el estado de las ruedas).
● Agregue los atributos que crea necesarios
*/
public class ProgramEjer2 {

	public static void main(String[] args) {
		
		Coche c = new Coche();
		
		c.getRuedas()[0].desinflar();
		c.getPuertas()[1].abrir();
		
		String str = c.arrancar();
		System.out.println(str);
		
		c.getRuedas()[0].inflar();
		c.getPuertas()[1].cerrar();
		
		str = c.arrancar();
		System.out.println(str);
		
		str = c.parar();
		System.out.println(str);
		
		str = c.arrancar();
		System.out.println(str);
	}

}
