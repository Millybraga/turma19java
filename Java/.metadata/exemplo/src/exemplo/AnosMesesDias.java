package exemplo;

import java.util.Scanner;

public class AnosMesesDias {
	
	public static void main(String[] args) {
		

	int ano, mes, dia, dias;
    
	Scanner leia = new Scanner (System.in);
	
	
	System.out.println("Digite quantos dias você viveu: ");
	dia = leia.nextInt();

     ano = dia/365;
     mes = dia%365/30;
     
    System.out.println("Olá, você viveu " + ano +" anos, "+ mes+ " meses e "+ dia+" dias");

	}
}
