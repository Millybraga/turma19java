package lista1poo;

public class objetoPatinete {
	
	public static void main(String[] args)
	{
	
	classePatinete patinete = new classePatinete();
	
	patinete.cor = "rosa";
	System.out.print("O patinete é e " +patinete.cor);

	patinete.tamanho = "36";
	System.out.println(" seu tamanho é: "+patinete.tamanho+ "!");

	patinete.sendoUsado();
	System.out.println();


	
	}

}
