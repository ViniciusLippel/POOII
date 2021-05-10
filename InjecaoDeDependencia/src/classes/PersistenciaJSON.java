package classes;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import org.json.*;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

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
			System.out.println("Arquivo gerado");
			
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("Erro ao gerar arquivo");
			
		}
	}
	
	
	public String[] ler(String matricula) throws Exception {
		
		Gson gson = new Gson();
		String[] a = new String[5];
		
	        try {
	 
	            BufferedReader br = new BufferedReader(new FileReader("dados_alunos/json/"+matricula+".json"));
	            a = gson.fromJson(br, String[].class);
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
		return a;
	}
}
