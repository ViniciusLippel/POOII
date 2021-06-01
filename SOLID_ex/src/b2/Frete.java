package b2;

public class Frete {

	public double calcular(Pedido p, TipoFrete tf) {
		return tf.calcular(p, tf);
	}
	
}