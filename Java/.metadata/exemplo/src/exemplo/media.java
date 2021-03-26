package exemplo;

import java.util.Scanner;

public class media {
	
	public static void main(String[] args) {
		
		double p1, p2, p3, n1,n2,n3;
		double media;

		  p1 = 2;
		  p2 = 3;
		  p3 = 5;

		  Scanner leia = new Scanner (System.in);
		  
		  System.out.print("digite sua nota 1: ");
		  n1 = leia.nextDouble();

		  System.out.print("digite sua nota 2: ");
		  n2 = leia.nextDouble();

		  System.out.print("digite sua nota 3: ");
		  n3 = leia.nextDouble();

		  media =  (((p1*n1)+(p2*n2)+(p3*n3))/(p1+p2+p3));

		  System.out.print("Sua média ponderada é: "+ media);

		
	}

}
