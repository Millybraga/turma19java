package lista1;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String [] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int contador= 0;
		int numero1, numero2, numero3;
		 
			
		System.out.printf("Digite um número: ");
		numero1 = leia.nextInt();
		
		System.out.printf("Digite outro número: ");
		numero2 = leia.nextInt();
		
		System.out.printf("Digite um último número: ");
		numero3 = leia.nextInt();
		
		System.out.printf("Aqui está a ordem crescente dos valores inseridos: \n");
		
		if (numero1 < numero2) {
		
			if (numero2 < numero3) {
			
			System.out.println(numero1+ "\n"+numero2+"\n"+numero3);
			
			}
			else if (numero1 < numero3) {
				System.out.println(numero1+ "\n"+numero3+"\n"+numero2);

			}
			else {
				System.out.println(numero3+ "\n"+numero1+"\n"+numero2);

			}
		}
			else if (numero2 < numero3) {
				if(numero1 < numero3) {
					System.out.println(numero2+ "\n"+numero1+"\n"+numero3);
				}
				else {
					System.out.println(numero2+ "\n"+numero3+"\n"+numero1);

				}
			}
			else {
				System.out.println(numero3+ "\n"+numero2+"\n"+numero1);

			}
			
	}	
}



