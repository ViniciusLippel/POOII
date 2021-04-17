package classes;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.time.LocalDate;
import java.util.Arrays;


public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario f1 = new Funcionario();
		f1.cadFuncionario("vinilippel", "senha123", "Vin�cius Marzall Lippel",
				"viniciusmlippel@gmail.com", LocalDate.of(2000, 11, 3));
		f1.addHorasValor(154, 20.5);
		f1.addHorasValor(165, 20.5);
		f1.addHorasValor(145, 22);
		f1.addHorasValor(172, 22.5);
		f1.addHorasValor(137, 22.5);
		
		//1
		System.out.println("1 - Senha em SHA1: " + f1.getSenha());
		
		
		//2
		System.out.println("\n2 - Cadastrando senha igual a usu�rio...");
		Funcionario f2 = new Funcionario();
		if (f2.cadFuncionario("usuario", "usuario", null, null, null))
			System.out.println("Cadstro realizado com sucesso!");
		else
			System.out.println("N�o foi poss�vel realizar o cadastro.");
		
		
		//3
		System.out.println("\n3 - Sal�rio do segundo m�s: R$" + f1.salarioMes(2));
		
		
		//4
		System.out.println("\n4 - Valor total de todos os sal�rios: " + "R$" + f1.valTotalSal());
		
		
		//5
		System.out.println("\n5 - M�dia salarial: " + "R$" + f1.mediaSal());
		
		
		//6
		System.out.println("\n6 - Dois maiores sal�rios: ");
		double[] maioresSal = f1.maioresSal(2);
		System.out.println(Arrays.toString(maioresSal));
		
		
		//7
		System.out.println("\n7 - Tr�s menores sal�rios: ");
		double[] menoresSal = f1.menoresSal(3);
		System.out.println(Arrays.toString(menoresSal));
		
		
		//8
		System.out.println("\n8 - M�ses trabalhados: " + f1.mesesTrab());
		
		
		//9
		System.out.println("\n9 - Previs�o de aposentadoria: ");
		System.out.println("Ano: "  + f1.anoAposentadoria()[1]);
		System.out.println("Idade: " + f1.anoAposentadoria()[0]);
	}
}
