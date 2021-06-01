package e2;

public class PessoaPersist{
	
	private IPessoaPersist persist;
	
	public PessoaPersist(IPessoaPersist persist) {
		this.persist = persist;
	}
	
	public void gravar(Pessoa p) {
		persist.gravar(p);
	}

}
