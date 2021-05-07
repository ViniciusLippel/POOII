package classes;

import javax.xml.parsers.ParserConfigurationException;

public interface Persistencia {
	
	public void escrever(String[] val);
	
	public String[] ler(String matricula) throws Exception;
}
