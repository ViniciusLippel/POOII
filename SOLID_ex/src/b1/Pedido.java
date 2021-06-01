package b1;

public class Pedido {
	
	private int codigo;
	private String destino;
	private double total;
	
	public Pedido(int codigo, String destino, double total) {
		super();
		this.codigo = codigo;
		this.destino = destino;
		this.total = total;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public double calculaFrete(TipoFrete tf) {
		double frete = 0;
		switch (tf) {
		case RODO:
			frete = total * 0.01;
			break;
		case AEREO:
			frete = total * 0.02;
			break;
		case NAVIO:
			frete = total * 0.03;
			break;
		case MISTO:
			frete = total * 0.04;
			break;	
		}
		return frete;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido [codigo=");
		builder.append(codigo);
		builder.append(", destino=");
		builder.append(destino);
		builder.append(", total=");
		builder.append(total);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
