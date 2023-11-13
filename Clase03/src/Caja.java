
public class Caja<T extends Object> {
	
	/*
	private Object obj;
	
	public void guardar(Object o) {
		this.obj = o;
	}
	
	public Object sacar() {
		return this.obj;
	}
	*/
	private T obj;
	
	public void guardar(T o) {
		this.obj = o;
	}
	
	public T sacar() {
		return this.obj;
	}

}
