package lista1;

	import java.util.Scanner;

	public class Exercicio4 {

		public static void main(String [] args) {
				
				Scanner leia = new Scanner (System.in);
				
				double numero=0;
				double raiz, quadrado;
				
				System.out.printf("Escreva um n�mero: ");
				numero = leia.nextInt();
				
				if(numero  ==0){
					System.out.printf("Zero � um numero neutro!");
					}
				else if (numero% 2 ==0){
					raiz = Math.sqrt(numero);
					System.out.printf("o numero � par e ");
					System.out.println("A raiz �:" + raiz);
					
					}
				else if(numero %2 != 0){
					quadrado = Math.pow(numero, 2);
					System.out.printf("N�mero � impar e ");
					System.out.println("O quadrado �: "+ quadrado);
					}

					
					 
					 

		
		}
	}

