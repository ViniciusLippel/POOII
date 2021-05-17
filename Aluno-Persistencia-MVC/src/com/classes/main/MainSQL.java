package com.classes.main;

import java.time.LocalDate;

import com.classes.BO.AlunoBO;
import com.classes.DAO.AlunoSQL;
import com.classes.DTO.Aluno;

public class MainSQL {

	public static void main(String[] args) throws Exception {
		//Teste persistência SQL
		Aluno aluno = new Aluno("Michael Scott", "2020321123", "098.765.432-10", LocalDate.of(1965, 03, 15), "michael_s@email.com");
		AlunoSQL psql = new AlunoSQL();
		AlunoBO abo = new AlunoBO(aluno, psql);
		abo.gravar();
		
		System.out.println(psql.ler("2020321123"));
	}

}
