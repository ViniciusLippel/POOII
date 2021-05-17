package com.classes.main;
import java.time.LocalDate;

import com.classes.BO.AlunoBO;
import com.classes.DAO.*;
import com.classes.DTO.Aluno;


public class Main {

	public static void main(String[] args) throws Exception {
		
		//Instanciando persistencias
		AlunoXML pxml = new AlunoXML();
		AlunoJSON pjson = new AlunoJSON();
		AlunoCSV pcsv = new AlunoCSV();
		
		//Instanciando alunos e gravando dados nos diferentes formatos
		System.out.println("Gravando dados dos alunos...\n");
		
		Aluno aluno;
		AlunoBO alunoBO;
		
		aluno = new Aluno("Michael Scott", "2020321123", "098.765.432-10", LocalDate.of(1965, 03, 15), "michael_s@email.com");
		alunoBO = new AlunoBO(aluno, pxml);
		alunoBO.gravar();
		
		aluno = new Aluno("Jim Halpert", "2020123020", "444.555.666-77", LocalDate.of(1978, 10, 01), "jim_h@email.com");
		alunoBO = new AlunoBO(aluno, pjson);
		alunoBO.gravar();
		
		aluno = new Aluno("Pam Beesly", "2020456789", "232.323.232-32", LocalDate.of(1979, 03, 25), "pam_b@email.com");
		alunoBO = new AlunoBO(aluno, pcsv);
		alunoBO.gravar();
		
		aluno = new Aluno("Dwight Schrute", "2020002200", "444.555.666-77", LocalDate.of(1970, 01, 20), "dwight_s@email.com");
		alunoBO = new AlunoBO(aluno, pjson);
		alunoBO.gravar();
		
		
		//Obtendo dados dos alunos através dos respectivos arquivos
		System.out.println("\nBuscando dados dos alunos...\n");
		
		alunoBO = new AlunoBO(pxml);
		aluno = alunoBO.ler("2020321123");
		System.out.println(aluno.toString());
		
		alunoBO = new AlunoBO(pjson);
		aluno = alunoBO.ler("2020123020");
		System.out.println(aluno.toString());
		
		alunoBO = new AlunoBO(pcsv);
		aluno = alunoBO.ler("2020456789");
		System.out.println(aluno.toString());
		
		alunoBO = new AlunoBO(pjson);
		aluno = alunoBO.ler("2020002200");
		System.out.println(aluno.toString());
	}

}
