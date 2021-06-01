package c1;

public class DevPleno{
	
	private double salario;
	
	
	
	
	public DevPleno(double salario) {
		
		this.salario = salario;
	}




	public double getSalario() {
		return salario;
	}




	public void setSalario(double salario) {
		this.salario = salario;
	}




	public double gratificacao() {
		return getSalario() + 1500;
	}




	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DevPleno [salario=");
		builder.append(salario);
		builder.append("]");
		return builder.toString();
	}
	
	

}
