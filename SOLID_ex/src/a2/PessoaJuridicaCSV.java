package a2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PessoaJuridicaCSV {
	
	public void gravarCSV(PessoaJuridica pj) {
		FileWriter arq;
		PrintWriter gravarArq;
		try {
			arq = new FileWriter("pessoaJuridica.csv");
			gravarArq = new PrintWriter(arq);
			gravarArq.printf("%d;%s;%s\n", pj.getCodigo(), pj.getNome(), pj.getCnpj());
			arq.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
