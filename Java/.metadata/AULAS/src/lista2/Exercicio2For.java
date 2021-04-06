package lista2;

import java.util.Scanner;

public class Exercicio2For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);

		int numeros[] = new int [10];
		int par = 0, impar =0;
		
		for(int x=0; x<numeros.length;x++) {
			System.out.println("Digite o numero: ");
			numeros[x] = leia.nextInt();
			
			if (numeros[x] % 2 ==0) {
				par++;
				
			}
			else if (numeros[x] % 2 != 0) {
				impar++;
				
			}
		}
		System.out.println("A quantidades de numeros pares: "+ par);
		System.out.println("A quantidades de numeros impares: "+ impar);


	}

}
