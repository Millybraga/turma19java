package lista2;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numeros=0;
		int contador=0;

		do {
			System.out.print("Digite um número: ");
			numeros = leia.nextInt();
			
			contador= contador+numeros;
			
					
		} while (numeros != 0);
		
			System.out.print("A soma dos números é: "+ contador);
			
			}
	}

	
	


