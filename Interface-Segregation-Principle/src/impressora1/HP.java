package impressora1;

public class HP implements IImpressora{
	
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
	
	public boolean ImprimirFrenteVerso(String contudo) {
		System.out.println("Erro");
		return false;
	}
	
}



//Mostrar Depois
	/*public boolean ImprimirFrenteVerso(String contudo) {
		System.out.println("Erro");
		return false;
	}*/
