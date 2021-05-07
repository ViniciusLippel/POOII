package classes;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Aluno a = new Aluno("Vinicius", "2019002219", "064.537.079-77", LocalDate.of(2000, 11, 3), "viniciusmlippel@gmail.com");
		PersistenciaXML pxml = new PersistenciaXML();
		
		PersistenciaAluno pa = new PersistenciaAluno(a, pxml);
		
		//pa.gerarArquivo();
		String[] vinicius = pa.ler("2019002219");
		System.out.println(vinicius[4]);
	}

}
