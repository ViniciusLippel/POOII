package e1;
public class Main {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa(1,"Pessoa Genérica");
		PessoaCSV p_csv = new PessoaCSV();
		p_csv.gravarCSV(p);
		
		
		
	}

}