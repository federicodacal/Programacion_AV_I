/*
1. Supongamos que necesitamos una clase que represente un par de objetos de tipos
diferentes. Podríamos crear una clase genérica llamada Pair que tenga dos campos de
tipo genérico T y U, y que tenga métodos para obtener y establecer los valores de
estos campos
*/

public class Pair<T, U> {

	private T param1;
	private U param2;
	
	public T getParam1() {
		return this.param1;
	}
	
	public void setParam1(T param1) {
		this.param1 = param1;
	}
	
	public U getParam2() {
		return this.param2;
	}
	
	public void setParam2(U param2) {
		this.param2 = param2;
	}
	
}
