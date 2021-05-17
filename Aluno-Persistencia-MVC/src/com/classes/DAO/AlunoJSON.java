package com.classes.DAO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;

import com.classes.DTO.Aluno;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class AlunoJSON implements PersistenciaAluno {

	//Gravar
	public boolean gravar(Aluno aluno) {

		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer;
		
		try {
			
			writer = new FileWriter("dados_alunos/json/"+aluno.getMatricula()+".json");
			writer.write(gson.toJson(aluno));
			writer.close();
			System.out.println("Arquivo "+aluno.getMatricula()+".json criado com sucesso.");
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
	        	
	        	Gson gson = new Gson();
	    		Aluno aluno = new Aluno();
	    		
	            BufferedReader br = new BufferedReader(new FileReader("dados_alunos/json/"+matricula+".json"));
	            aluno = gson.fromJson(br, Aluno.class);
	            
	            return aluno;
	 
	        } catch (IOException e) {
	        	
	        	System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
	            
	            return null;
	        }
		
	}
}
