package com.classes.DAO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;

import com.classes.DTO.Aluno;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;

public class AlunoJSON implements PersistenciaAluno {

	//Gravar
	public boolean gravar(Aluno aluno) {

		Gson gson = new GsonBuilder().create();
		FileWriter writer;
		
		try {
			
			writer = new FileWriter("dados_alunos/json/"+aluno.getMatricula()+".json");
			writer.write(gson.toJson(aluno.toArrayList()));
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
	    		ArrayList<String> valores = new ArrayList<String>();
	    		
	            BufferedReader br = new BufferedReader(new FileReader("dados_alunos/json/"+matricula+".json"));
	            valores = gson.fromJson(br, ArrayList.class);
	            aluno.toAluno(valores);
	            
	            return aluno;
	 
	        } catch (IOException e) {
	        	
	        	System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
	            
	            return null;
	        }
		
	}
	
	public boolean excluir(String matricula) {
		File file = new File("dados_alunos/json/"+matricula+".json");
		 if (file.delete()) { 
		      System.out.println("Arquivo " + file.getName()+" deletado");
		      return true;
	    } else {
	      System.out.println("Falha ao deletar arquivo");
	      return false;
	    } 
	}
}
