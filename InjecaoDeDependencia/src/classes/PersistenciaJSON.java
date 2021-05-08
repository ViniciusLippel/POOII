package classes;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.*;


public class PersistenciaJSON implements Persistencia {

	public PersistenciaJSON() {
		// TODO Auto-generated constructor stub
	}
	
	public void escrever(String[] val) {
		try {
		      FileWriter myWriter = new FileWriter("dados_alunos/json/"+val[1]+".json");
		      myWriter.write(
		    		  "\"aluno\": [{"
		    		  + "\n\t\"nome\": "+val[0]
    				  + "\n\t\"matricula\": "+val[1]
					  + "\n\t\"cpf\": "+val[2]
					  + "\n\t\"dtNasc\": "+val[3]
					  + "\n\t\"email\": "+val[4]
					  + "\n}]"
		    				  );
		      myWriter.close();
		      System.out.println("Arquivo criado com sucesso.");
		      
		    } catch (IOException e) {
		      System.out.println("Erro ao criar arquivo.");
		      e.printStackTrace();
		    }
	}
	
	public String[] ler(String matricula) throws Exception {
	    @SuppressWarnings("deprecation")
		JsonElement jelement = new JsonParser().parse(matricula+".json");
	    JsonObject  jobject = jelement.getAsJsonObject();
	    JsonArray jarray = jobject.getAsJsonArray("aluno");
	    jobject = jarray.get(0).getAsJsonObject();
	    String result = jobject.get("nome").getAsString();
	    System.out.println(result);
	    return null;
	}
}
