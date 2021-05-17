package com.classes.main;

import com.classes.BO.AlunoBO;
import com.classes.DAO.AlunoCSV;
import com.classes.DAO.AlunoJSON;
import com.classes.DAO.AlunoSQL;
import com.classes.DAO.AlunoXML;

public class MainExclusao {

	public static void main(String[] args) throws Exception {
		//Teste de exclusão XML
		AlunoXML pxml = new AlunoXML();
		AlunoJSON pjson = new AlunoJSON();
		AlunoCSV pcsv = new AlunoCSV();
		AlunoSQL psql = new AlunoSQL();
		
		AlunoBO alunoBO;
		
		alunoBO = new AlunoBO(pxml);
		alunoBO.excluir("2020321123");
		
		alunoBO = new AlunoBO(pjson);
		alunoBO.excluir("2020123020");
		
		alunoBO = new AlunoBO(pcsv);
		alunoBO.excluir("2020456789");
		
		alunoBO = new AlunoBO(psql);
		alunoBO.excluir("2020002200");
	}

}
