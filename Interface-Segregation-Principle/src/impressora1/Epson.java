package impressora1;

public class Epson implements IImpressora {
	
	public boolean Imprimir(String conteudo) {
		System.out.println("Imprimindo "+conteudo);
		return true;
	}
	
	public boolean Escanear(String conteudo) {
		System.out.println("Escaneando "+conteudo);
		return true;
	}
	
	public boolean RealizarFax(String conteudo) {
		System.out.println("Erro");
		return false;
	}
	
	public boolean RealizarFotocopia(String conteudo) {
		System.out.println("Realizando fotocópia de "+conteudo);
		return true;
	}
	
	public boolean ImprimirFrenteVerso(String conteudo) {
		System.out.println("Imprimindo frente e verso de "+conteudo);
		return false;
	}
	
}


