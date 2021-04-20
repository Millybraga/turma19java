package entity;

public class Doce extends ProdutoAbstrata {

		private String fabricante;

		public Doce(String descricao, String codigo, double valorUnitario, String fabricante) {
			super(descricao, codigo, valorUnitario);
			this.fabricante = fabricante;
		}

		//Encapsulamento - Getters and setters
		public String getFabricante() {
			return fabricante;
		}

		public void setFabricante(String fabricante) {
			this.fabricante = fabricante;
		}
		
	}

