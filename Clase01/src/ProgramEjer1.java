/* 1.
Crear un POJO llamado auto, con los siguientes atributos:
● patente: cadena
● marca: EMarca
● modelo: cadena
● percio: numérico
En el main crear tres objetos y mostrarlos por pantalla. Sobrescriba el método
toString, equals y hashCode.
EMarca es un enumerado. 
*/
public class ProgramEjer1 {

	public static void main(String[] args) {
		
		Auto a1 = new Auto("YYY555", "Fiesta", 200.5F, EMarca.Ford);
		Auto a2 = new Auto("ZZZ444", "Corolla", 400F, EMarca.Toyota);
		Auto a3 = new Auto("XXX333", "Uno", 150F, EMarca.Fiat);
		Auto a4 = new Auto("YYY555", "Ka", 260.5F, EMarca.Ford);
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println(a4.toString());
		
		System.out.println("********************");
		
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a3));
		System.out.println(a1.equals(a4));
		
		System.out.println("********************");
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
		System.out.println(a4.hashCode());
		
	}

}
