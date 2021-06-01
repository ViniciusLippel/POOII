package a2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PessoaCSV{
	
	public void gravarCSV(Pessoa p) {
		FileWriter arq;
		PrintWriter gravarArq;
		try {
			arq = new FileWriter("pessoa.csv");
			gravarArq = new PrintWriter(arq);
			gravarArq.printf("%d;%s\n", p.getCodigo(), p.getNome());
			arq.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
