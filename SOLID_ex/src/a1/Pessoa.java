package a1;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Pessoa {
	
	private int codigo;
	private String nome;
	
	public Pessoa(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void gravarCSV() {
		FileWriter arq;
		PrintWriter gravarArq;
		try {
			arq = new FileWriter("pessoa.csv");
			gravarArq = new PrintWriter(arq);
			gravarArq.printf("%d;%s\n", getCodigo(), getNome());
			arq.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [codigo=");
		builder.append(codigo);
		builder.append(", nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
	
	

}
