package a2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PessoaFisicaCSV {
	
	public void gravarCSV(PessoaFisica pf) {
		FileWriter arq;
		PrintWriter gravarArq;
		try {
			arq = new FileWriter("pessoaFisica.csv");
			gravarArq = new PrintWriter(arq);
			gravarArq.printf("%d;%s;%s\n", pf.getCodigo(), pf.getNome(), pf.getCpf());
			arq.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
