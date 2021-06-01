package a1;
public class Main {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa(1,"Pessoa Genérica");
		p.gravarCSV();
		
		PessoaFisica pf = new PessoaFisica(2,"Rodrigo","000.111.222-33");
		pf.gravarCSV();
		
		PessoaJuridica pj = new PessoaJuridica(3,"Minha Empresa","00.111.222/0001-99");
		pj.gravarCSV();
		
	}

}