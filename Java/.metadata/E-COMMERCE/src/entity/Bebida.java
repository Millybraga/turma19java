package entity;

public class Bebida extends ProdutoAbstrata {

	private String fabricante;

	public Bebida(String descricao, String codigo, double valorUnitario, int qtdeEstoque, String fabricante) {
		super(descricao, codigo, valorUnitario, qtdeEstoque);
		this.fabricante = fabricante;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	
	
	
	
	
	
	
	
	
	
}
