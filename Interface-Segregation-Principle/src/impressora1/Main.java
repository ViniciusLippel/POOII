package impressora1;

public class Main {

	public static void main(String[] args) {
		
		String conteudo = "arquivo.pdf";
		
		//HP
		HP hp = new HP();
		hp.Escanear(conteudo);
		hp.ImprimirFrenteVerso(conteudo); //Erro de execução
		
		//Epson
		Epson ep = new Epson();
		ep.ImprimirFrenteVerso(conteudo);
		ep.RealizarFax(conteudo); //Erro de execução
		
	}

}
