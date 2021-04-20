package entity;

public class Revista extends ProdutoAbstrata {

	public Revista(String descricao, String codigo, double valorUnitario) {
		super(descricao, codigo, valorUnitario);
		// TODO Auto-generated constructor stub
	}

	private String editora;

	//Encapsulamento - Getters and setters
	
	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
}