package c2;

public class Main {
	
	public static void main(String[] args) {
		
		Funcionario f = new Funcionario(0);
		System.out.println(f.gratificacao());
		
		f = new Estagiario(0);
		System.out.println(f.gratificacao());
		
		f = new DevJunior(0);
		System.out.println(f.gratificacao());
		
		f = new DevPleno(0);
		System.out.println(f.gratificacao());
		
		f = new DevSenior(0);
		System.out.println(f.gratificacao());
		
		f = new Gerente(0);
		System.out.println(f.gratificacao() + "\n\n");
		
		Funcionario[] lista = {new Funcionario(0), new Estagiario(0), new DevJunior(0), new DevPleno(0), new DevSenior(0), new Gerente(0)};
		
		for (Funcionario func : lista) {
			System.out.println(func.gratificacao());
		}
		
	}

}
