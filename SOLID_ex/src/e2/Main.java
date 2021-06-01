package e2;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa(1,"Pessoa Genérica");
		
		PessoaCSV p_csv = new PessoaCSV();
		PessoaPersist persist = new PessoaPersist(p_csv);
		persist.gravar(p);
		
		PessoaJSON p_json = new PessoaJSON();
		persist = new PessoaPersist(p_json);
		persist.gravar(p);
		 
			
	}

}