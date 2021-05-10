package classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class PersistenciaCSV implements Persistencia {

	
	public PersistenciaCSV() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void gravar(String[] val) {
		
		try {
			
			FileWriter arq = new FileWriter("dados_alunos/csv/"+val[1]+".csv");
			PrintWriter gravarArq = new PrintWriter(arq);
			gravarArq.printf("%s;%s;%s;%s;%s\n", val[0], val[1], val[2], val[3], val[4]);
			arq.close();
			
			System.out.println("Arquivo criado com sucesso.");
			
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("Erro ao criar arquivo.");
			
		}	
	}
	
	
	public String[] ler(String matricula) {
		
		try {
			
			FileReader arq1 = new FileReader("dados_alunos/csv/"+matricula+".csv");
			BufferedReader lerArq = new BufferedReader(arq1);
			String linha = lerArq.readLine();
			String[] leitura = linha.split(";");
			arq1.close();
			
			return leitura;
			
		} catch (IOException e) {
			
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
			
			return null;
			
		}
	}
}
