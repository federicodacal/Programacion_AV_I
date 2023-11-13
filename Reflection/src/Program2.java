import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.lang.reflect.Constructor;

public class Program2 {

	public static void main(String[] args) {
		
		try {
			
			Class c = Class.forName("Persona");
			
			Object p = null;
			
			Constructor[] cons = c.getConstructors(); 
			
			for(Constructor co:cons) {
				
				System.out.println(co.getName());
				System.out.println(co.getParameterCount());
				
				Parameter[] params = co.getParameters();
				
				for(Parameter pa:params) {
					System.out.println(pa.getParameterizedType());
				}
				
				// Constructor por defecto
				if(co.getParameterCount() == 0) {
					p = co.newInstance(null);
				}
				
				// Constructor por un parametro
				if(co.getParameterCount() == 1) {
					
					Object[] parametros = new Object[1];
					parametros[0] = "Matias";
					
					p = co.newInstance(parametros);
					
				}
				
				System.out.println(p.toString());
				
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	public static void generarObjetos(String nombreClase) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class c = Class.forName(nombreClase);
		
		Object p = null;
		
		Constructor[] cons = c.getConstructors();
		
		for(Constructor con:cons) {
			
			if(con.getParameterCount() == 0) {
				Object[] params = new Object[0];
				
				p = con.newInstance(params);
			}
		}
	}
	
	public static void insert(Object obj) {
		
		String query = "insert into" + obj.getClass().getSimpleName() + "('') values ("+ obj + ")";
		
	}

}
