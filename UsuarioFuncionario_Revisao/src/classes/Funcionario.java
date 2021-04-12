package classes;
import java.time.LocalDate;

public class Funcionario extends Usuario {
	
	private String nome;
	private String email;
	private int[] horasTrabalhadas;
	private double[] valorHora;
	private LocalDate dataNasc;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public int[] getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(int[] horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public float[] getValorHora() {
		return valorHora;
	}
	public void setValorHora(float[] valorHora) {
		this.valorHora = valorHora;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	
	//Sal�rio por m�s
	public double salarioMes() {
		return valorHora[valorHora.length-1] * horasTrabalhadas[horasTrabalhadas.length-1];
	}
	
	//Sal�rio de um determinado m�s
	public double salarioMes(int mes) {
		return valorHora[mes-1] * horasTrabalhadas[mes-1];
	}
	
	//Soma total de todos os sal�rios
	public double valTotalSal() {
		double s = 0;
		for (int i=0; i<mesesTrab(); i++) {
			s = s + salarioMes(i);
		}
		return s;
	}
	
	//M�dia de todos os sal�rios
	public double mediaSal() {
		return valTotalSal() / mesesTrab();
	}
	
	//N maiores sal�rios
	public double maioresSal(int n) {
		return 
	}
	
	//N menores sal�rios
	public menoresSal() {
		
	}
	
	//N�mero de meses trabalhados
	public int mesesTrab() {
		return horasTrabalhadas.length;
	}
	
	//Anos e meses trabalhados
	public anosMesesTrab() {
		mesesTrab() / 12
	}
	
	//Previs�o de ano e idade de aposentadoria
	public anoAposentadoria() {
		
	}

}
