package classes;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;


public class Funcionario extends Usuario {
	
	private String nome;
	private String email;
	private ArrayList<Integer> horasTrabalhadas;
	private ArrayList<Double> valorHora;
	private LocalDate dataNasc;
	
	//Construtor
	public Funcionario() {
		super();
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

	public ArrayList<Integer> getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(ArrayList<Integer> horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public ArrayList<Double> getValorHora() {
		return valorHora;
	}
	public void setValorHora(ArrayList<Double> valorHora) {
		this.valorHora = valorHora;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	//Cadastro Funcionario
	public boolean cadFuncionario(String usuario, String senha, String nome, String email, LocalDate dataNasc) {
		if (this.cadUsuario(usuario, senha)) {
			this.setNome(nome);
			this.setEmail(email);
			this.setDataNasc(dataNasc);
			this.horasTrabalhadas = new ArrayList<Integer>();
			this.valorHora = new ArrayList<Double>();
			return true;
		}
		return false;
	}
	
	//Adicionar horas trabalhadas
	public void addHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas.add(horasTrabalhadas);
	}
	
	//Adicionar valor/hora
	public void addValorHora(double valorHora) {
		this.valorHora.add(valorHora);
	}
	
	//Adicionar horas trabalhadas + valor/hora
	public void addHorasValor(int horasTrabalhadas, double valorHora) {
		this.addHorasTrabalhadas(horasTrabalhadas);
		this.addValorHora(valorHora);
	}
	
	//Salário do último mês
	public double salarioMes() {
		return valorHora.get(valorHora.size()-1) * horasTrabalhadas.get(horasTrabalhadas.size()-1);
	}
	
	//Salário de um determinado mês
	public double salarioMes(int mes) {
		return valorHora.get(mes-1) * horasTrabalhadas.get(mes-1);
	}
	
	//Soma total de todos os salários
	public double valTotalSal() {
		double s = 0;
		for (int i=1; i<=mesesTrab(); i++) {
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
		
		for (int i=1; i<=mesesTrab(); i++) {
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
		
		for (int i=1; i<=mesesTrab(); i++) {
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
		return horasTrabalhadas.size();
	}
	
	//Anos e meses trabalhados
	public int[] anosMesesTrab() {
		int[] anosMeses = new int[2];
		anosMeses[0] = (int) Math.ceil(mesesTrab() / 12);
		anosMeses[1] = mesesTrab() % 12;
		return anosMeses;
	}
	
	public int idade() {
		return LocalDate.now().getYear() - dataNasc.getYear();
	}
	
	//Previsão de ano e idade de aposentadoria
	public int[] anoAposentadoria() {
		int anosC = anosMesesTrab()[0];
		int anosRestantes;
		int[] anoIdade = new int[2];
		
		if (this.idade() < 65) {
			anosRestantes = 65 - this.idade();
			if (anosC + anosRestantes < 35) {
				anosRestantes = anosRestantes + (35 - (anosC + anosRestantes));	
			}
			anoIdade[0] = this.idade() + anosRestantes;
			anoIdade[1] = LocalDate.now().getYear() + anosRestantes;
			return anoIdade;	
		}
		
		else if (anosC < 35) {
			anosRestantes = 35 - anosC;
			anoIdade[0] = this.idade() + anosRestantes;
			anoIdade[1] = LocalDate.now().getYear() + anosRestantes;
			return anoIdade;
		}
		
		anoIdade[0] = 0;
		anoIdade[1] = LocalDate.now().getYear();
		return anoIdade;
	}

}
