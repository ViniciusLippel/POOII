package com.classes.DAO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

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
	public Aluno ler(String matricula) {
		
		try {
			
			FileReader arq1 = new FileReader("dados_alunos/csv/"+matricula+".csv");
			BufferedReader lerArq = new BufferedReader(arq1);
			String linha = lerArq.readLine();
			String[] leitura = linha.split(";");
			
			Aluno aluno = new Aluno();
			aluno.setNome(leitura[0]);
			aluno.setMatricula(leitura[1]);
			aluno.setCpf(leitura[2]);
			aluno.setDtNasc(LocalDate.parse(leitura[3]));
			aluno.setEmail(leitura[4]);
			arq1.close();
			
			return aluno;
			
		} catch (IOException e) {
			
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
			
			return null;
			
		}
	}
	
	public boolean excluir(String matricula) {
		File file = new File("dados_alunos/csv/"+matricula+".csv");
		 if (file.delete()) { 
		      System.out.println("Arquivo " + file.getName()+" deletado");
		      return true;
	    } else {
	      System.out.println("Falha ao deletar arquivo");
	      return false;
	    } 
	}
}
