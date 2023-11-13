
public class ProgramEjer {

	public static void main(String[] args) {
		
		Pair<String, Persona> p = new Pair<String, Persona>();
		
		p.setParam1("Hola");
		System.out.println(p.getParam1());
		
		Persona per = new Persona(100, "Juan");
		
		p.setParam2(per);
		System.out.println(p.getParam2());

	}

}
