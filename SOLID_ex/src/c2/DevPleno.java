package c2;

public class DevPleno extends Funcionario {

	public DevPleno(double salario) {
		super(salario);
	}
	
	public double gratificacao() {
		return getSalario() + 1500;
	}

}
