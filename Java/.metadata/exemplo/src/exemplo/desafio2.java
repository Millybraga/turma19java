package exemplo;
import java.util.Scanner;

public class desafio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int a=0, b=0;
		
		System.out.println("Escreva um valor para A: ");
		a = leia.nextInt();
		System.out.println("Escreva um valor para B: ");
		b = leia.nextInt();
		
		System.out.println("O valor de A, agora é: " +b);
		System.out.println("O valor de B, agora é: "+a);

	}

}
