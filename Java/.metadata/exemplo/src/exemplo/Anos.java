package exemplo;

import java.util.Scanner;



public class Anos {
	
	public static void main(String[] args) {
		

		   int ano, mes, dia;
		   int diasAtuais;
		   int diasVida;
		   
		   Scanner leia = new Scanner (System.in);

		   System.out.println("Em qual dia você nasceu? ");
		   dia = leia.nextInt();
		   
		   System.out.println("Em qual mes você nasceu? " );
		   mes = leia.nextInt();

		   System.out.println("Qual o ano do seu nascimento? ");
	       ano = leia.nextInt();
	       

	        diasAtuais = (( mes*12*30)+(dia*30)+ ano);
	        diasVida = ((ano*12*30)+(mes*30)+dia);
	        
	        System.out.println("oi, você viveu "+ (diasAtuais-diasVida) + " dias");
	        


		
	}
}
