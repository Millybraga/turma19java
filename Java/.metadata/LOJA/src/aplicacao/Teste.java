package aplicacao;

import java.util.Locale;

import entidades.Doce;
import entidades.Produto;
import entidades.Revista;
import entidades.Roupa;

public class Teste {
	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		//teste de usuario
		
		Produto prod1 = new Produto("CAMISA "," XL001 ", 100.25);
		Revista prod2 = new Revista("Caras", "6782", 25.50,"ABRIL");
		Roupa prod3 = new Roupa("CALÇA", "3S292", 90.00,"ZARA");
		Doce prod4 = new Doce("CHOCOLATE", "RSA20",10.00,"CACAU SHOW");
		
		prod2.incluirEstoque(10);
		prod3.incluirEstoque(1000);
		prod4.incluirEstoque(8);
		
		System.out.println(prod1.getDescricao()+"R$"+ prod1.getValorUnitario()+ " Estoque " +prod1.getQtdeEstoque());
		prod1.setValorUnitario(80); //set altera
		prod1.incluirEstoque(20);
		
		System.out.println(prod1.getDescricao()+" R$ "+prod1.getValorUnitario()+" estoque "+prod1.getQtdeEstoque()+" custo total "+(10*prod1.getValorUnitario()));
		prod1.tirarEstoque(10);
		System.out.println(prod1.getDescricao()+" R$ "+prod1.getValorUnitario()+" estoque "+prod1.getQtdeEstoque());

		
	}
}
