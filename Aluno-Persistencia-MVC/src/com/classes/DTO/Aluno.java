package com.classes.DTO;
import java.time.LocalDate;
import java.util.ArrayList;


public class Aluno extends Pessoa {
	
	private String matricula;
	private String cpf;
	private LocalDate dtNasc;
	private String email;
	
	
	public Aluno() {
	}

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [");
		builder.append(super.toString());
		builder.append(", matricula=");
		builder.append(matricula);
		builder.append(", cpf=");
		builder.append(cpf);
		builder.append(", dtNasc=");
		builder.append(dtNasc);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}
	
	public ArrayList<String> toArrayList() {
		ArrayList<String> valores = new ArrayList<String>();
		valores.add(this.getNome());
		valores.add(this.getMatricula());
		valores.add(this.getCpf());
		valores.add(this.getDtNasc().toString());
		valores.add(this.getEmail());
		
		return valores;
	}
	
	public void toAluno(ArrayList<String> valores) {
		this.setNome(valores.get(0));
		this.setMatricula(valores.get(1));
		this.setCpf(valores.get(2));
		this.setDtNasc(LocalDate.parse(valores.get(3)));
		this.setEmail(valores.get(4));
	}
	
}
