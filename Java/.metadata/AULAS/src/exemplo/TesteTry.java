package exemplo;

import java.util.Scanner;

public class TesteTry {
	
	public static void main(String [] args) {

		Scanner leia = new Scanner (System.in);
		
		int nota=0;
		String nomes[]= new String[3];
		int aux = 0;
		String situacao = "";
		
		System.out.println("Digite a posi��o da pessoa no vetor de [0-2]");
		aux = leia.nextInt();
		System.out.println("Digite o nome da pessoa: ");
		nomes[aux] = leia.next();
		System.out.println("Digite a nota: ");
		nota = leia.nextInt();
		if(nota<=5) {
			situacao = "ainda n�o, estude mais";
		}
		else {
			situacao = "parab�ns";
		}
		System.out.printf("oi, %s, sua situa��o � %s\n",nomes[aux],situacao);
		System.out.printf("FIM DE PROGRAMA");

		
	}

}
