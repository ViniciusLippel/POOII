package a1;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PessoaFisica extends Pessoa{

	private String cpf;

	public PessoaFisica(int codigo, String nome, String cpf) {
		super(codigo, nome);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void gravarCSV() {
		FileWriter arq;
		PrintWriter gravarArq;
		try {
			arq = new FileWriter("pessoaFisica.csv");
			gravarArq = new PrintWriter(arq);
			gravarArq.printf("%d;%s;%s\n", getCodigo(), getNome(), getCpf());
			arq.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaFisica [cpf=");
		builder.append(cpf);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}