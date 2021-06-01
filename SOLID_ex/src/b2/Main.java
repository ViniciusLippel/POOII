package b2;

public class Main {
	
	public static void main(String[] args) {
		
		Pedido p = new Pedido(1,"São Paulo",1245.89);
		Frete f = new Frete();
		
		TipoFrete tf = new Rodo();
		System.out.println("RODO : " + f.calcular(p, tf));
		
		tf = new Aereo();
		System.out.println("AEREO : " + f.calcular(p, tf));
		
		tf = new Navio();
		System.out.println("NAVIO : " + f.calcular(p, tf));
		
		tf = new Misto();
		System.out.println("MISTO : " + f.calcular(p, tf));
		
		tf = new Misto1();
		System.out.println("MISTO 1 : " + f.calcular(p, tf));
	}

}