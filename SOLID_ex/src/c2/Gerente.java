package c2;

public class Gerente extends Funcionario {

	public Gerente(double salario) {
		super(salario);
	}
	
	public double gratificacao() {
		return getSalario() + 2500;
	}

}
