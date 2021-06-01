package c1;

public class Funcionario {
	
	private double salario;

	public Funcionario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double gratificacao() {
		return salario + 100;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Funcionario [salario=");
		builder.append(salario);
		builder.append("]");
		return builder.toString();
	}
	
	

}
