package classes;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Usuario {
	private String usuario;
	private String senha;
	
	//Construtor vazio pois os dados serão setados no cadastro
	public Usuario() {
	}
	
	//Getters & Setters
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = this.encriptarSenha(senha);
	}
	
	//Encriptar Senha
	public String encriptarSenha(String senha) {
		
		String senhaSha1 = "";
		
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-1");
	        digest.reset();
	        digest.update(senha.getBytes("utf8"));
	        senhaSha1 = String.format("%040x", new BigInteger(1, digest.digest()));
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return senhaSha1;
	}
	
	//Cadastro
	public boolean Cadastrar(String usuario, String senha) {
		if (senha != usuario) {
			setUsuario(usuario);
			setSenha(senha);
			return true;
		}
		return false;
	}
	
	//Validação de Login
	public boolean validarLogin(String usuario, String senha) {
		if (usuario == this.usuario && this.encriptarSenha(senha) == this.senha)
			return true;
		return false;
	}
}
