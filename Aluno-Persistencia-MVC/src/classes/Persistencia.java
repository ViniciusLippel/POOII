package classes;

public interface Persistencia {
	
	public void gravar(String[] val);
	
	public String[] ler(String matricula);
}
