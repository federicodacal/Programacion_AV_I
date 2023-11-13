import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		p.nombre = "Pepe";
		
		Alumno a = new Alumno();
		
		a.nombre = "Juan";
		a.legajo = 100L;
		
		Profesor pf = new Profesor();
		
		pf.nombre = "Matias";
		pf.materias = new ArrayList<>();
		pf.materias.add("Programacion");
		
	    mostrar(p);
	    mostrar(a);
	    mostrar(pf);
	    
	    List<Profesor> profes = new ArrayList<>();
	    profes.add(pf);
	    
	    List<Persona> personas = new ArrayList<>();
	    personas.add(p);
	    
	    List<Alumno> alumnos = new ArrayList<>();
		alumnos.add(a);
		
		mostrarLista(profes);
		mostrarLista(personas);
		mostrarLista(alumnos);
		
	}
	
	public static void mostrar(Object o) {
		System.out.println(o);
	}

	public static void mostrarLista(List<? extends Persona> lista) {
		for(Persona p:lista) {
			System.out.println(p.toString());
		}
	}
	
}
