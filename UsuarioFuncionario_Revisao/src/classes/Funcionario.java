package classes;
import java.time.LocalDate;
import java.time.Period;


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

	public double[] getValorHora() {
		return valorHora;
	}
	public void setValorHora(double[] valorHora) {
		this.valorHora = valorHora;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	
	//Salário por mês
	public double salarioMes() {
		return valorHora[valorHora.length-1] * horasTrabalhadas[horasTrabalhadas.length-1];
	}
	
	//Salário de um determinado mês
	public double salarioMes(int mes) {
		return valorHora[mes-1] * horasTrabalhadas[mes-1];
	}
	
	//Soma total de todos os salários
	public double valTotalSal() {
		double s = 0;
		for (int i=0; i<mesesTrab(); i++) {
			s = s + salarioMes(i);
		}
		return s;
	}
	
	//Média de todos os salários
	public double mediaSal() {
		return valTotalSal() / mesesTrab();
	}
	
	//N maiores salários
	public double[] maioresSal(int n) {
		double[] maiores = new double[n];
		for (int i=0; i<n; i++) {
			maiores[i] = 0;
		}
		
		for (int i=0; i<mesesTrab(); i++) {
			if(n > 1) {
				if (salarioMes(i) > maiores[n-1]) {
					int pos = n-1;
					for (int x=n-2; x>=0; x--) {
						if (salarioMes(i) > maiores[x]) {
							pos = x;
						}
					}
					for (int x=n-2; x>pos; x--) {
						maiores[x+1] = maiores[x];
					}
					maiores[pos] = salarioMes(i);
				}
			}
			else {
				if (salarioMes(i) > maiores[0])
					maiores[0] = salarioMes(i);
			}		
		} 
		return maiores;
	}
	
	//N menores salários
	public double[] menoresSal(int n) {
		double[] menores = new double[n];
		for (int i=0; i<n; i++) {
			menores[i] = maioresSal(1)[0];
		}
		
		for (int i=0; i<mesesTrab(); i++) {
			if(n > 1) {
				if (salarioMes(i) < menores[n-1]) {
					int pos = n-1;
					for (int x=n-2; x>=0; x--) {
						if (salarioMes(i) < menores[x]) {
							pos = x;
						}
					}
					for (int x=n-2; x>pos; x--) {
						menores[x+1] = menores[x];
					}
					menores[pos] = salarioMes(i);
				}
			}
			else {
				if (salarioMes(i) < menores[0])
					menores[0] = salarioMes(i);
			}		
		}
		return menores;
	}
	
	//Número de meses trabalhados
	public int mesesTrab() {
		return horasTrabalhadas.length;
	}
	
	//Anos e meses trabalhados
	public int[] anosMesesTrab() {
		int[] anosMeses = new int[2];
		anosMeses[0] = (int) Math.ceil(mesesTrab() / 12);
		anosMeses[1] = mesesTrab() % 12;
		return anosMeses;
	}
	
	
	//Previsão de ano e idade de aposentadoria
	public int anoAposentadoria() {
		int anosC = anosMesesTrab()[0];
		Period dtIdade = (Period.between(dataNasc, LocalDate.now()));
		
		if (dtIdade.getYears() < 65) {
			if (anosC < 35) {
				int anosRestantes = 65 - dtIdade.getYears();
				if (anosC + anosRestantes < 35) {
					anosRestantes = anosRestantes + (35 - (anosC + anosRestantes));
					return anosRestantes;
				}
				return anosRestantes;	
			}
			else{
				return 65 - dtIdade.getYears();
			}
		}
		
		else if (anosC < 35) 
			return 35 - anosC;
		
		return 0;
	}

}
