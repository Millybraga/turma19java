package lista1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String [] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero1;
		int numero2;
		int numero3;
		int maiorNumero;
		
		System.out.printf("Escreva o primeiro n�mero inteiro: ");
		numero1 = leia.nextInt();
				
		System.out.printf("Escreva o segundo n�mero inteiro: ");
		numero2 = leia.nextInt();
						
		System.out.printf("Escreva o terceiro n�mero inteiro: ");
		numero3 = leia.nextInt();
		
		
		if (numero1>= numero2 && numero1 >= numero3) {
		System.out.printf("O maior n�mero �: %d", numero1);
		
		}
		else if (numero2>= numero3 && numero2 >= numero1) {
		System.out.printf("O maior n�mero �: %d", numero2);
		}
		
		else {
			System.out.printf("O maior n�mero �: %d", numero3);

		}
				
	}
	
}

