package c1;

public class Gerente {
	
	private double salario;

	public Gerente(double salario) {
		super();
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double gratificacao() {
		return getSalario() + 2500;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gerente [salario=");
		builder.append(salario);
		builder.append("]");
		return builder.toString();
	}

}