package entity;

public class ExercCollection {
	
	 private String descricao;
	 private double valorUnitario;
	 private int qtdeEstoque;
	 
	public ExercCollection(String descricao, double valorUnitario, int qtdeEstoque) {
		super();
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
		this.qtdeEstoque = qtdeEstoque;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getQtdeEstoque() {
		return qtdeEstoque;
	}

	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}
	
	 
	 
}
