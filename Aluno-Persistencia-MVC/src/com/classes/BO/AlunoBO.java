package com.classes.BO;

import java.time.LocalDate;

import com.classes.DAO.PersistenciaAluno;
import com.classes.DTO.Aluno;

public class AlunoBO {
	
	private Aluno aluno;
	private PersistenciaAluno persistencia;
	
	public AlunoBO(PersistenciaAluno persistencia) {
		this.persistencia = persistencia;
	}
	
	public AlunoBO(Aluno aluno, PersistenciaAluno persistencia) {
		this.aluno = aluno;
		this.persistencia = persistencia;
	}
	
	//Gravar
	public void gravar() {
		persistencia.gravar(aluno);
	}
	
	//Ler
	public Aluno ler(String matricula) throws Exception {
		return vetorParaObjeto(persistencia.ler(matricula));
	}
	
	//Retornar atributos do aluno em String[]
	public String[] objetoParaVetor() {
		
		String[] v = {
				aluno.getNome(), 
				aluno.getMatricula(),
				aluno.getCpf(),
				aluno.getDtNasc().toString(),
				aluno.getEmail()
		};
		
		return v;
	}
	
	//Retornar aluno a partir de String[]
	public Aluno vetorParaObjeto(String[] v) {
		Aluno a = new Aluno(v[0], v[1], v[2], LocalDate.parse(v[3]), v[4]);
		
		return a;
	}
}
