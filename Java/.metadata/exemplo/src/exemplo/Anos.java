package exemplo;

import java.util.Scanner;



public class Anos {
	
	public static void main(String[] args) {
		

		   int ano, mes, dia;
		   int diasAtuais;
		   String nome;
		   
		   
		   Scanner leia = new Scanner (System.in);

		   
		   System.out.print("Leia nome: ");
		   nome = leia.next();
		   
		   System.out.println("Dias :") ;
		   dia = leia.nextInt();
		   
		   System.out.println("Meses :" );
		   mes = leia.nextInt();

		   System.out.println("Anos: ");
	       ano = leia.nextInt();
	       

	        //diasAtuais = ((diasVida*12*30)+(dia*30)+ ano);
	        diasAtuais = (ano*365)+(mes*30)+dia ;
	        
	        
	        
	        System.out.printf("Oi %s, vc digitou anos: %d, meses: %d e dias: %d, ou seja %d dias na terra!!",nome,ano,mes,dia,diasAtuais);
	        
	        // %s = é o String, pra aparecer na tela: igual fazíamos no portugol fechando parenteses e escrevendo a variável. 
	        //%d = o d siginifica que é pra ler inteiro e no fim tem que escrever a ordem que quer que apareça o valor das variaveis


		
	}
}
