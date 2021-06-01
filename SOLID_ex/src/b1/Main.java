package b1;

public class Main {
	
	public static void main(String[] args) {
		
		Pedido p = new Pedido(1,"São Paulo",1245.89);
		
		TipoFrete tf = TipoFrete.RODO;
		System.out.println(tf.name() + " : " + p.calculaFrete(tf));
		
		tf = TipoFrete.AEREO;
		System.out.println(tf.name() + " : " + p.calculaFrete(tf));
		
		tf = TipoFrete.NAVIO;
		System.out.println(tf.name() + " : " + p.calculaFrete(tf));
		
		tf = TipoFrete.MISTO;
		System.out.println(tf.name() + " : " + p.calculaFrete(tf));
		
	}

}