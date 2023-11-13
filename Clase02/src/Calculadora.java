
public class Calculadora implements ICalcular {

	@Override
	public Double sumar(Number x, Number y) {
		return (Double)x + (Double)y;
	}

	@Override
	public Double restar(Number x, Number y) {
		return (Double)x - (Double)y;
	}

	@Override
	public Double multiplicar(Number x, Number y) {
		return (Double)x * (Double)y;
	}

	@Override
	public Double dividir(Number x, Number y) throws MiException {
		if((Double)y == 0) {
			throw new MiException("La división por 0 no está definida");
		}
		else {
			return (Double)x / (Double)y;
		}
	}

}
