package classes;
import java.math.BigInteger;
import java.security.MessageDigest;


public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario novoUsuario = new Usuario();
		novoUsuario.Cadastrar("usuario", "senha");

		System.out.println(novoUsuario.getSenha());

	}
}
