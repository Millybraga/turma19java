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
		
		System.out.println("Ol�, voc� recebeu o aux�lio anterior? Responda: 1 para Sim e 2 para N�o");
		ultimoAuxilio = leia.nextInt();	
		
		System.out.println("Voc� recebeu o bolsa fam�lia? 1 para Sim e 2 para N�o ");
		bolsaFamilia = leia.nextInt();

		System.out.println("Voc� � chefa de fam�lia? 1 P/ Sim e 2 p/ n�o ");
		chefaFamilia = leia.nextInt();
						
		System.out.println("Informe quantos filhos tem: ");
		quantFilhos = leia.nextInt();

		if (chefaFamilia == 1 && ultimoAuxilio == 2 && bolsaFamilia == 2) {
			auxilio*= 2;
			quantFilhos *= filhos;
			auxilio += quantFilhos;
			System.out.println("Voc� receber�:"+ auxilio);		
		}
		
		else if(chefaFamilia == 2 || bolsaFamilia == 2) {
			quantFilhos *= filhos;
			auxilio += quantFilhos;
			System.out.println("Voc� receber�:"+ auxilio);	
				
		}
		
			else if(ultimoAuxilio == 2) {
				System.out.println("Voc� n�o tem direito ao auxilio");	

			}
			else if(bolsaFamilia == 1) {
				System.out.println("Voc� n�o tem direito ao auxilio");	

			}
				
				
		}
		
	}


