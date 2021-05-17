package com.classes.DAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.classes.DTO.Aluno;


public class AlunoCSV implements PersistenciaAluno {
	
	//Gravar
	public boolean gravar(Aluno aluno) {
		
		try {
			
			FileWriter arq = new FileWriter("dados_alunos/csv/"+aluno.getMatricula()+".csv");
			PrintWriter gravarArq = new PrintWriter(arq);
			gravarArq.printf("%s;%s;%s;%s;%s\n", aluno.getNome(), aluno.getMatricula(), aluno.getCpf(), aluno.getDtNasc().toString(), aluno.getEmail());
			arq.close();
			
			System.out.println("Arquivo "+aluno.getMatricula()+".csv criado com sucesso.");
			return true;
			
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("Erro ao criar arquivo.");
			return false;
			
		}	
	}
	
	//Ler
	public String[] ler(String matricula) {
		
		try {
			
			FileReader arq1 = new FileReader("dados_alunos/csv/"+matricula+".csv");
			BufferedReader lerArq = new BufferedReader(arq1);
			String linha = lerArq.readLine();
			String[] leitura = linha.split(";");
			arq1.close();
			
			return leitura;
			
		} catch (IOException e) {
			
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
			
			return null;
			
		}
	}
}
