package com.classes.DAO;

import com.classes.DTO.Aluno;

public interface PersistenciaAluno {
	
	public boolean gravar(Aluno aluno);
	
	public String[] ler(String matricula);
}
