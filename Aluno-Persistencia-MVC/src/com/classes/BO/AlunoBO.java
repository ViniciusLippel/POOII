package com.classes.BO;

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
		return persistencia.ler(matricula);
	}
	
}
