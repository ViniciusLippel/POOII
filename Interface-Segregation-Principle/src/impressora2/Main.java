package impressora2;

public class Main {

	public static void main(String[] args) {
		
		String conteudo = "arquivo.pdf";
		
		//HP
		HP hp = new HP();
		hp.Escanear(conteudo);
		hp.Imprimir(conteudo);
		
		//Epson
		Epson ep = new Epson();
		ep.ImprimirFrenteVerso(conteudo);
		ep.RealizarFotocopia(conteudo);
		
	}

}
