package b2;

public class Misto implements TipoFrete{

	@Override
	public double calcular(Pedido p, TipoFrete tf) {
		return p.getTotal() * 0.04;
	}

}
