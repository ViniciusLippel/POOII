package com.classes.DAO;

import com.classes.DTO.Aluno;

public interface PersistenciaAluno {
	
	public boolean gravar(Aluno aluno);
	
	public Aluno ler(String matricula);
	
	public boolean excluir(String matricula);
}
