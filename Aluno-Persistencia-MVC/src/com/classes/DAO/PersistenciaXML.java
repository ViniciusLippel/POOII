package com.classes.DAO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;

public class PersistenciaXML implements Persistencia{
	
	//Gravar
	public void gravar(String[] val) {
		
		try {
		      FileWriter myWriter = new FileWriter("dados_alunos/xml/"+val[1]+".xml");
		      myWriter.write(
		    		  "<aluno>\n"
			    		  + "\t<nome>"+val[0]+"</nome>\n"
			    		  + "\t<matricula>"+val[1]+"</matricula>\n"
			    		  + "\t<cpf>"+val[2]+"</cpf>\n"
			    		  + "\t<dtNasc>"+val[3]+"</dtNasc>\n"
			    		  + "\t<email>"+val[4]+"</email>\n"
    		  		+ "</aluno>\n"
		    				  );
		      myWriter.close();
		      System.out.println("Arquivo "+val[1]+".xml criado com sucesso.");
		      
		    } catch (IOException e) {
		      System.out.println("Erro ao criar arquivo.");
		      e.printStackTrace();
		    }
	}
	
	//Ler
	public String[] ler(String matricula) {
		
		try {

			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			 
			Document document = builder.parse(new File("dados_alunos/xml/"+matricula+".xml"));
			 
			document.getDocumentElement().normalize();
			 
			ArrayList<String> dadosL = new ArrayList<String>();
			
		    dadosL.add(document.getElementsByTagName("nome").item(0).getTextContent());
		    dadosL.add(document.getElementsByTagName("matricula").item(0).getTextContent());
		    dadosL.add(document.getElementsByTagName("cpf").item(0).getTextContent());
		    dadosL.add(document.getElementsByTagName("dtNasc").item(0).getTextContent());
		    dadosL.add(document.getElementsByTagName("email").item(0).getTextContent());
		    
		    String[] dadosV = dadosL.toArray(new String[dadosL.size()]); 
		    
			return dadosV;
			
		} catch (IOException e){
			
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
			return null;
			
		} catch (SAXException e) {
			
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
			return null;
			
			
		} catch (ParserConfigurationException e) {
			
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
			return null;
			
		}
	}
}
