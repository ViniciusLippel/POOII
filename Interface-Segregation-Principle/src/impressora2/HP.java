package impressora2;

public class HP implements IImprimirEscanear {
	
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
	
}
