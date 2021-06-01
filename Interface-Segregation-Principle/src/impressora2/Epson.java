package impressora2;

public class Epson implements IImprimirEscanear, IImprimirFrenteVerso {
	
	public boolean Imprimir(String conteudo) {
		System.out.println("Imprimindo "+conteudo);
		return true;
	}
	
	public boolean Escanear(String conteudo) {
		System.out.println("Escaneando "+conteudo);
		return true;
	}
	
	public boolean RealizarFotocopia(String conteudo) {
		System.out.println("Realizando fotocópia de "+conteudo);
		return true;
	}
	
	public boolean ImprimirFrenteVerso(String conteudo) {
		System.out.println("Imprimindo frente e verso de "+conteudo);
		return true;
	}
}
