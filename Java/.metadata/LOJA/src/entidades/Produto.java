package entidades;

public class Produto {
	
	//atributos
	
	 private String descricao;
	 private  String codigo;
	 private double valorUnitario;
	 private int qtdeEstoque;
	
	 //construtores
	 
	public Produto(String descricao, String codigo, double valorUnitario) {
		super();
		this.descricao = descricao;
		this.codigo = codigo;
		this.valorUnitario = valorUnitario;
    } 
	
	 //encapsulamentos - getter and setters

	public String getDescricao() {  //get: mostra (traz a informação, busca)
		return descricao;
	}

	public void setDescricao(String descricao) { //set altera (modifica)
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	/*public void setCodigo(String codigo) { //tira o set do codigo para não ser alterado
		this.codigo = codigo;
		
	}
	*/

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getQtdeEstoque() {
		return qtdeEstoque;
	}

	/*public void setQtdeEstoque(int qtdeEstoque) { // tiramos o set do estoque para não ser alterado
		this.qtdeEstoque = qtdeEstoque;
	}
	*/
	 
	 //metodos
	
	 public void incluirEstoque(int valoraSerIncluido) {
		 
		 this.qtdeEstoque = this.qtdeEstoque + valoraSerIncluido; //this para lembrar que o que o acompanha é um atributo da classe, usado para diferenciar se existe duas variaveis com o mesmo nome (nesse caso, colocamos apenas pra se certificar de que ele vai ler como atributo mesmo) 
		 
	 }
	 public void tirarEstoque(int valoraSerExcluido) {
		 if (qtdeEstoque >= valoraSerExcluido) {
			 this.qtdeEstoque = this.qtdeEstoque - valoraSerExcluido; 

		 } else {
			 System.out.print("Estoque indisponível!");
		 }
		 
		 
		
	 }
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
