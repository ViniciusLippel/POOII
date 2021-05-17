package com.classes.main;
import java.time.LocalDate;

import com.classes.BO.AlunoBO;
import com.classes.DAO.PersistenciaCSV;
import com.classes.DAO.PersistenciaJSON;
import com.classes.DAO.PersistenciaXML;
import com.classes.DTO.Aluno;



public class Main {

	public static void main(String[] args) throws Exception {
		
		//Instanciando alunos
		Aluno michael = new Aluno("Michael Scott", "2020321123", "098.765.432-10", LocalDate.of(1965, 03, 15), "michael_s@email.com");
		Aluno jim = new Aluno("Jim Halpert", "2020123020", "444.555.666-77", LocalDate.of(1978, 10, 01), "jim_h@email.com");
		Aluno pam = new Aluno("Pam Beesly", "2020456789", "232.323.232-32", LocalDate.of(1979, 03, 25), "pam_b@email.com");
		Aluno dwight = new Aluno("Dwight Schrute", "2020002200", "444.555.666-77", LocalDate.of(1970, 01, 20), "dwight_s@email.com");
		
		//Instanciando persistencias
		PersistenciaXML pxml = new PersistenciaXML();
		PersistenciaJSON pjson = new PersistenciaJSON();
		PersistenciaCSV pcsv = new PersistenciaCSV();
		
		
		//Armazenando dados nos diferentes formatos
		System.out.println("Gravando dados dos alunos...\n");
		
		AlunoBO p0 = new AlunoBO(michael, pxml);
		p0.gravar();
		
		AlunoBO p1 = new AlunoBO(jim, pjson);
		p1.gravar();
		
		AlunoBO p2 = new AlunoBO(pam, pcsv);
		p2.gravar();
		
		AlunoBO p3 = new AlunoBO(dwight, pjson);
		p3.gravar();
		
		
		//Obtendo dados dos alunos através dos respectivos arquivos
		System.out.println("\nBuscando dados dos alunos...\n");
		
		Aluno a0 = p0.ler("2020321123");
		System.out.println(a0.getNome()+", "+a0.getMatricula()+", "+a0.getCpf()+", "+a0.getDtNasc().toString()+", "+a0.getEmail());
		
		Aluno a1 = p1.ler("2020123020");
		System.out.println(a1.getNome()+", "+a1.getMatricula()+", "+a1.getCpf()+", "+a1.getDtNasc().toString()+", "+a1.getEmail());
		
		Aluno a2 = p2.ler("2020456789");
		System.out.println(a2.getNome()+", "+a2.getMatricula()+", "+a2.getCpf()+", "+a2.getDtNasc().toString()+", "+a2.getEmail());
		
		Aluno a3 = p3.ler("2020002200");
		System.out.println(a3.getNome()+", "+a3.getMatricula()+", "+a3.getCpf()+", "+a3.getDtNasc().toString()+", "+a3.getEmail());
	}

}
