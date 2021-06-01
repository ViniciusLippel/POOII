package c2;

public class Estagiario extends Funcionario {

	public Estagiario(double salario) {
		super(salario);
	}
	
	public double gratificacao() {
		return getSalario() + 500;
	}

}
