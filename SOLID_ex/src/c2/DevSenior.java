package c2;

public class DevSenior extends Funcionario {

	public DevSenior(double salario) {
		super(salario);
	}
	
	public double gratificacao() {
		return getSalario() + 2000;
	}

}
