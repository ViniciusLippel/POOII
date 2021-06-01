package b2;

public class Misto1 implements TipoFrete{

	@Override
	public double calcular(Pedido p, TipoFrete tf) {
		return p.getTotal() * 0.07;
	}

}
