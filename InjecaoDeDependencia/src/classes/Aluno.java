package classes;
import java.time.LocalDate;


public class Aluno extends Pessoa {
	
	private String matricula;
	private String cpf;
	private LocalDate dtNasc;
	private String email;
	
	public Aluno(String nome, String matricula, String cpf, LocalDate dtNasc, String email) {
		super(nome);
		this.matricula = matricula;
		this.cpf = cpf;
		this.dtNasc = dtNasc;
		this.email = email;
	}

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public LocalDate getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(LocalDate dtNasc) {
		this.dtNasc = dtNasc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
