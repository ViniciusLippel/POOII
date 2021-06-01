package b2;

public class Rodo implements TipoFrete{

	@Override
	public double calcular(Pedido p, TipoFrete tf) {
		return p.getTotal() * 0.01;
	}

}
