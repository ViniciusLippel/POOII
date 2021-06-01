package c2;

public class DevJunior extends Funcionario {

	public DevJunior(double salario) {
		super(salario);
	}
	
	public double gratificacao() {
		return getSalario() + 1000;
	}

}
