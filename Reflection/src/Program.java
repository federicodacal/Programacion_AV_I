import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Program {

	public static void main(String[] args) {
		
		/*cl.getMethods();
		cl.getFields();
		cl.getConstructors();
		cl.getTypeName();
		cl.getSimpleName();
		cl.getSuperclass();
		*/
		
		Persona p = new Persona("Generico");
		//p.nombre = "Generico";
		
		Class cl = p.getClass();
		Class cl1 = Persona.class;
		// Class cl2 = Class.forName("Persona");
		
		System.out.println(cl.getSimpleName());
		System.out.println(cl.getFields()[0]);
		
		System.out.println("*************************");
		
		Field[] atts = cl.getFields();
		
		for(Field f:atts) {
			System.out.println(f.getName());
			System.out.println(f.getType());
			
			try {
				
				if(f.getModifiers()==0) {
					
					f.set(p, "Nuevo valor");
					System.out.println(f.get(p));
				}
				
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("*************************"); 
		
		Method[] met = cl.getMethods();
		
		for(Method m:met) {
			System.out.println(m.getName());
			System.out.println(m.getReturnType());
			System.out.println(m.getParameterCount());
			System.out.println(m.getExceptionTypes());
			System.out.println("--------");
			//System.out.println(f.get());
		}
		
		System.out.println("*************************"); 
		
		Method[] mett = cl.getDeclaredMethods();
		
		for(Method m:mett) {
			
			System.out.println(m.getName());
			
			Object[] params = new Object[0];
			
			try {
				
				//m.invoke(p, params);
				
				if(m.getName().equals("toString")) {
					
					Object o = m.invoke(p, params);
					System.out.println(o);
					
				}
				else if(m.getName().equals("setDni")) {
					
					if(m.getModifiers() == 2) {
						m.setAccessible(true);
					}
					
					Object[] parametros = new Object[1];
					parametros[0] = 333333L;
					
					m.invoke(p, parametros);
					
				}
				else if(m.getName().equals("getDni")) {
					
					Object ob = m.invoke(p, null);
					System.out.println(ob);
					
				}

				
				
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
			
			System.out.println("--------");
			//System.out.println(f.get());
		}
		


	}

}
