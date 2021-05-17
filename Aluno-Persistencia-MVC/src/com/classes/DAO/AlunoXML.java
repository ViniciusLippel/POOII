package com.classes.DAO;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import com.classes.DTO.Aluno;

import javax.xml.parsers.*;
import java.io.*;

public class AlunoXML implements PersistenciaAluno{
	
	//Gravar
	public boolean gravar(Aluno aluno) {
		
		try {
		      FileWriter myWriter = new FileWriter("dados_alunos/xml/"+aluno.getMatricula()+".xml");
		      myWriter.write(
		    		  "<aluno>\n"
			    		  + "\t<nome>"+aluno.getNome()+"</nome>\n"
			    		  + "\t<matricula>"+aluno.getMatricula()+"</matricula>\n"
			    		  + "\t<cpf>"+aluno.getCpf()+"</cpf>\n"
			    		  + "\t<dtNasc>"+aluno.getDtNasc().toString()+"</dtNasc>\n"
			    		  + "\t<email>"+aluno.getEmail()+"</email>\n"
    		  		+ "</aluno>\n"
		    				  );
		      myWriter.close();
		      System.out.println("Arquivo "+aluno.getMatricula()+".xml criado com sucesso.");
		      return true;
		      
		    } catch (IOException e) {
		      System.out.println("Erro ao criar arquivo.");
		      e.printStackTrace();
		      return false;
		    }
	}
	
	//Ler
	public Aluno ler(String matricula) {
		
		
		
		try {

			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			 
			Document document = builder.parse(new File("dados_alunos/xml/"+matricula+".xml"));
			 
			document.getDocumentElement().normalize();
			
			Aluno aluno = new Aluno();
		    aluno.setNome(document.getElementsByTagName("nome").item(0).getTextContent());
		    aluno.setMatricula(document.getElementsByTagName("matricula").item(0).getTextContent());
		    aluno.setCpf(document.getElementsByTagName("cpf").item(0).getTextContent());
		    aluno.setDtNasc(LocalDate.parse(document.getElementsByTagName("dtNasc").item(0).getTextContent()));
		    aluno.setEmail(document.getElementsByTagName("email").item(0).getTextContent());
		    
			return aluno;
			
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
