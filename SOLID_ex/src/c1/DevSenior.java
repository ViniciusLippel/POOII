package c1;

public class DevSenior{
	
	private double salario;
	
	
	
	public DevSenior(double salario) {
		
		this.salario = salario;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	public double gratificacao() {
		return getSalario() + 2000;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DevSenior [salario=");
		builder.append(salario);
		builder.append("]");
		return builder.toString();
	}
	
	

}
