package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.util.ArrayList;
//import java.util.List;
import java.sql.Date;
import com.classes.DTO.Aluno;
import com.classes.Conexao.Conexao;


public class AlunoSQL implements PersistenciaAluno {

	final String NOMEDATABELA = "aluno";
    public boolean gravar(Aluno aluno) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (matricula, nome, cpf, dtNasc, email) VALUES (?, ?, ?, ?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, aluno.getMatricula());
            ps.setString(2, aluno.getNome());
            ps.setString(3, aluno.getCpf());
            ps.setDate(4, Date.valueOf(aluno.getDtNasc()));
            ps.setString(5, aluno.getEmail());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return false;
        }
    }

	public Aluno ler(String matricula) {
		try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE matricula = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, matricula);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setMatricula(rs.getString(1));
                aluno.setNome(rs.getString(2));
                aluno.setCpf(rs.getString(3));
                aluno.setDtNasc(rs.getDate(4).toLocalDate());
                aluno.setEmail(rs.getString(5));
                ps.close();
                rs.close();
                conn.close();
                return aluno;
            } else {
                ps.close();
                rs.close();
                conn.close();
                return null;
            }
        } catch (Exception e) {
        	System.err.println("Erro: " + e.toString());
            return null;
        }
	}
	
	public boolean excluir(String matricula) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE matricula = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, matricula);
            ps.executeUpdate();
            ps.close();
            conn.close();
            System.out.println("Aluno "+matricula+" deletado do Banco de Dados");
            return true;
        } catch (Exception e) {
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return false;
        }
    }

}
