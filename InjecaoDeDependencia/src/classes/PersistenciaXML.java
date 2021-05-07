package classes;

public class PersistenciaXML implements Persistencia{

	public PersistenciaXML() {
		// TODO Auto-generated constructor stub
	}
	
	public void escrever(String[] val) {
		System.out.println("Escrevendo "+val[0]+" em XML");
	}
	
	public String ler() {
		return "";
	}
}
