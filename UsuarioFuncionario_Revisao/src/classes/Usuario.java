package classes;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Usuario {
	private String usuario;
	private String senha;
	
	//Construtor
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
	
	public boolean setSenha(String senha) {
		if(senha != this.usuario) {
			this.senha = this.encriptarSenha(senha);
			return true;
		}
		return false;
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
	
	//Cadastrar
	public boolean cadUsuario(String usuario, String senha) {
		setUsuario(usuario);
		return setSenha(senha);

	}
	
	//Validar Login
	public boolean validarLogin(String usuario, String senha) {
		if (usuario == this.usuario && this.encriptarSenha(senha) == this.senha)
			return true;
		return false;
	}
}
