package a1;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PessoaJuridica extends Pessoa{
	
	private String cnpj;

	public PessoaJuridica(int codigo, String nome, String cnpj) {
		super(codigo, nome);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void gravarCSV() {
		FileWriter arq;
		PrintWriter gravarArq;
		try {
			arq = new FileWriter("pessoaJuridica.csv");
			gravarArq = new PrintWriter(arq);
			gravarArq.printf("%d;%s;%s\n", getCodigo(), getNome(), getCnpj());
			arq.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaJuridica [cnpj=");
		builder.append(cnpj);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}	
}