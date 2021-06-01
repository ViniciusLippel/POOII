package impressora2;

public class MainErro {

	public static void main(String[] args) {
		
		String conteudo = "arquivo.pdf";
		
		//HP
		HP hp = new HP();
		hp.Escanear(conteudo);
		hp.ImprimirFrenteVerso(conteudo); //Erro de compilação
		
		//Epson
		Epson ep = new Epson();
		ep.ImprimirFrenteVerso(conteudo);
		ep.RealizarFax(conteudo); //Erro de compilação
		
	}
}
