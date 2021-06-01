package c1;

public class DevJunior {

	private double salario;
	
	
	
	public DevJunior(double salario) {
		
		this.salario = salario;
	}

	

	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	public double gratificacao() {
		return getSalario() + 1000;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DevJunior [salario=");
		builder.append(salario);
		builder.append("]");
		return builder.toString();
	}
	
	

}
