package classes;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PersistenciaJSON implements Persistencia {

	public PersistenciaJSON() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void gravar(String[] val) {

		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer;
		
		try {
			
			writer = new FileWriter("dados_alunos/json/"+val[1]+".json");
			writer.write(gson.toJson(val));
			writer.close();
			System.out.println("Arquivo criado com sucesso.");
			
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("Erro ao criar arquivo.");
			
		}
	}
	
	
	public String[] ler(String matricula) throws Exception {
		
		Gson gson = new Gson();
		String[] dados = new String[5];
		
	        try {
	 
	            BufferedReader br = new BufferedReader(new FileReader("dados_alunos/json/"+matricula+".json"));
	            dados = gson.fromJson(br, String[].class);
	            
	            return dados;
	 
	        } catch (IOException e) {
	        	
	        	System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
	            
	            return null;
	        }
		
	}
}
