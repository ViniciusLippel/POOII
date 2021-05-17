package com.classes.DAO;

public interface Persistencia {
	
	public void gravar(String[] val);
	
	public String[] ler(String matricula);
}
