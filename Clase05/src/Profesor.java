import java.util.List;

public class Profesor extends Persona {

	public List<String> materias;
	
	@Override
	public String toString() {
		return "Profesor [materias:" + this.materias.get(0) + "] " + super.toString();
	}
	
}
