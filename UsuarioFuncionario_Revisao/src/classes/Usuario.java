package classes;

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
		this.senha = senha;
	}
	
	//Cadastro
	public boolean Cadastro(String usuario, String senha) {
		if (senha != usuario) {
			setUsuario(usuario);
			setSenha(senha);
			return true;
		}
		return false;
	}
	
	//Login (forma temporaria)
	public boolean Login(String usuario, String senha) {
		if (usuario == this.usuario && senha == this.senha)
			return true;
		return false;
	}
}
