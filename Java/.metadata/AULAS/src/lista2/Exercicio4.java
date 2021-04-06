package lista2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		int contador=1;
		int idade=0;
		char sexo=0; //(1-feminino / 2-masculino / 3-Outros)
		char opcao=0; //(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva)
		int pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, outrosCalmos=0;
		int pessoasNervosasMais40=0, pessoasCalmasMenos18=0;
		
		System.out.print("Você deseja participar da pesquisa? S-sim e N-não:");
		char continua = leia.next().toUpperCase().charAt(0);

		while(continua == 'S' && contador <= 150) {
			System.out.print("Informe sua idade: ");
			idade = leia.nextInt();
			System.out.print("Digite 1- feminino / 2-masculino / 3-outros: ");
			sexo = leia.next().charAt(0);
			System.out.print("Digite: \n 1, se a pessoa é calma;\n 2, se a pessoa é nervosa:\n 3, se a pessoa era agressiva:");
			opcao = leia.next().charAt(0);
			if (continua != 3);
			System.out.println("Você deseja participar da pesquisa? S-sim e N-não:");
			continua = leia.next().toUpperCase().charAt(0);
			contador++;
		
	}
		 if(opcao == '1') {
			 pessoasCalmas++;
		}
		 if(sexo == '1' && opcao == '2') {
			 mulheresNervosas++;
		}
		 if (sexo == '2' && opcao =='3') {
			 homensAgressivos++;
	    }
		 if (sexo == '3' && opcao =='1') {
			 outrosCalmos++;
	    }
		 if (opcao=='2'  && idade >= 40) {
			 pessoasNervosasMais40++;
		}
		 if (opcao=='1'  && idade < 18) {
			 pessoasCalmasMenos18++;
			 
			 System.out.println("Pessoas calmas "+ pessoasCalmas);
			 System.out.println("Mulheres nervosas " + mulheresNervosas); 
			 System.out.println("Homens agressisvos "+homensAgressivos); 
			 System.out.println("Outros calmos "+outrosCalmos);
			 System.out.println("Pessos nervosas acima 40 "+pessoasNervosasMais40); 
			 System.out.println("Pessoas calmas < 18 "+pessoasCalmasMenos18);
		 }
		 
		 
	 }
		 
}