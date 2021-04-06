package exemplo;

import java.util.Locale;
import java.util.Scanner;

public class desafio {
	
	public static void main(String []args) {
		
		int ultimoAuxilio;
		int bolsaFamilia;
		int chefaFamilia;
		int quantFilhos = 0;
		int filhos = 50;
		double auxilio = 300;
		
		
		Locale.setDefault(Locale.US); 
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Olá, você recebeu o auxílio anterior? Responda: 1 para Sim e 2 para Não");
		ultimoAuxilio = leia.nextInt();	
		
		System.out.println("Você recebeu o bolsa família? 1 para Sim e 2 para Não ");
		bolsaFamilia = leia.nextInt();

		System.out.println("Você é chefa de família? 1 P/ Sim e 2 p/ não ");
		chefaFamilia = leia.nextInt();
						
		System.out.println("Informe quantos filhos tem: ");
		quantFilhos = leia.nextInt();

		if (chefaFamilia == 1 && ultimoAuxilio == 2 && bolsaFamilia == 2) {
			auxilio*= 2;
			quantFilhos *= filhos;
			auxilio += quantFilhos;
			System.out.println("Você receberá:"+ auxilio);		
		}
		
		else if(chefaFamilia == 2 || bolsaFamilia == 2) {
			quantFilhos *= filhos;
			auxilio += quantFilhos;
			System.out.println("Você receberá:"+ auxilio);	
				
		}
		
			else if(ultimoAuxilio == 2) {
				System.out.println("Você não tem direito ao auxilio");	

			}
			else if(bolsaFamilia == 1) {
				System.out.println("Você não tem direito ao auxilio");	

			}
				
				
		}
		
	}


