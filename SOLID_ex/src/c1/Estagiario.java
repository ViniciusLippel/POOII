package c1;

public class Estagiario{

	private double salario;

	public Estagiario(double salario) {
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
		return getSalario() + 500;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Estagiario [salario=");
		builder.append(salario);
		builder.append("]");
		return builder.toString();
	}
	
}