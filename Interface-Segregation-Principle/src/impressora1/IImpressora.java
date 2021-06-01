package impressora1;

public interface IImpressora {
	
	boolean Imprimir(String conteudo);
	boolean Escanear(String conteudo);
	boolean RealizarFax(String conteudo);
	boolean RealizarFotocopia(String conteudo);
	boolean ImprimirFrenteVerso (String conteudo);
	
}


//Mostrar Depois
//boolean ImprimirFrenteVerso (String conteudo);