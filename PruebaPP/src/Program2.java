import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class Program2 {

	public static void main(String[] args) {
		
		try {
			Class c = Class.forName("Auto");
			
			Object auto = null;
			
			Constructor[] cons = c.getDeclaredConstructors(); 
			
			for(Constructor co:cons) {
				
				// Constructor por defecto
				if(co.getParameterCount() == 0) {
					auto = co.newInstance(null);
				}
			}
			
			
			Field[] atts = c.getDeclaredFields();
			
			for(Field f:atts) {
				if(f.getModifiers() == 2) {
					
					f.setAccessible(true);
					System.out.println(f.getName());
					System.out.println(f.get(auto));
				}
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

}
