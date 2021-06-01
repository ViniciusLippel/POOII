package e2;

import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PessoaJSON implements IPessoaPersist{
	
	public void gravar(Pessoa p) {
		
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer;
		try {
			writer = new FileWriter("pessoas.json ");
			writer.write(gson.toJson(p));
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}