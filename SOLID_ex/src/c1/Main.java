package c1;

public class Main {
	
	public static void main(String[] args) {
		
		Funcionario f = new Funcionario(0);
		System.out.println(f.gratificacao());
		
		Estagiario e = new Estagiario(0);
		System.out.println(e.gratificacao());
		
		DevJunior dj = new DevJunior(0);
		System.out.println(dj.gratificacao());
		
		DevPleno dp = new DevPleno(0);
		System.out.println(dp.gratificacao());
		
		DevSenior ds = new DevSenior(0);
		System.out.println(ds.gratificacao());
		
		Gerente g = new Gerente(0);
		System.out.println(g.gratificacao());
	}

}
