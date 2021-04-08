package entidades;

public class Roupa extends Produto {
	
	//atributos
	 private String marca;
	 
	//construtores
	
	public Roupa(String descricao, String codigo, double valorUnitario, String marca) {
		super(descricao, codigo, valorUnitario);
		this.marca = marca;
	}
	
	//encapsulamentos
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}	 
	
	
	//metodos
	//esse n�o necessita de estoque pois o metodo estoque j� est� na classe produto

}
