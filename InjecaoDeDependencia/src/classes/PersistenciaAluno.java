package classes;

public class PersistenciaAluno {
	
	private Aluno aluno;
	private Persistencia persistencia;
	
	public PersistenciaAluno(Aluno aluno, Persistencia persistencia) {
		this.aluno = aluno;
		this.persistencia = persistencia;
	}
	
	public void gerarArquivo() {
		//Aqui transformamos os dados do aluno em String para passar para a persistencia (?)
		persistencia.escrever(atributosParaVetor());
	}
	
	public String[] ler(String matricula) throws Exception {
		return persistencia.ler(matricula);
	}
	
	public String[] atributosParaVetor() {
		
		String[] v = {
				aluno.getNome(), 
				aluno.getMatricula(),
				aluno.getCpf(),
				aluno.getDtNasc().toString(),
				aluno.getEmail()
		};
		
		return v;
	}

}
