package estudoArray;

import java.util.Locale;
import java.util.Scanner;

public class vetor1 {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);	
	Scanner leia = new Scanner(System.in);
	
	double pontuacao[] = new double[5];
	
	System.out.println("digite a pontuação 1: ");
	pontuacao[1] = leia.nextDouble();
	System.out.println("digite a pontuação 2: ");
	pontuacao[2] = leia.nextDouble();
	System.out.println("digite a pontuação 3: ");
	pontuacao[3] = leia.nextDouble();
	System.out.println("digite a pontuação 4: ");
	pontuacao[4] = leia.nextDouble();
	System.out.println("digite a pontuação 5: ");
	pontuacao[5] = leia.nextDouble();
	
	
	
	for(int x=0; x<5;x++) {
		pontuacao[x] = leia.nextDouble();
		x++;

	}
	
	
		
	}
	
}
