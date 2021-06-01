package a2;
public class Main {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa(1,"Pessoa Genérica");
		PessoaCSV p_csv = new PessoaCSV();
		p_csv.gravarCSV(p);
		
		PessoaFisica pf = new PessoaFisica(2,"Rodrigo","000.111.222-33");
		PessoaFisicaCSV pf_csv = new PessoaFisicaCSV();
		pf_csv.gravarCSV(pf);
		
		PessoaJuridica pj = new PessoaJuridica(3,"Minha Empresa","00.111.222/0001-99");
		PessoaJuridicaCSV pj_csv = new PessoaJuridicaCSV();
		pj_csv.gravarCSV(pj);
		
	}

}