package lista1;

	import java.util.Scanner;

	public class Exercicio3 {
		
			public static void main(String []args) {
			Scanner leia = new Scanner (System.in);
			
			int idade;
			
			
			System.out.println("Informe sua idade: ");
			idade = leia.nextInt();
			
			if (idade >= 10 && idade <= 14) {
				System.out.println("A idade se insere na categoria: INFANTIL.");	

			} 
			else if (idade >=15 && idade <= 17) {
				System.out.println("A idade se insere na categoria: JUVENIL.");
			}
			else if (idade >=18 && idade <= 25){
				System.out.println("A idade se insere na categoria: ADULTO.");
			}
			else {
				System.out.println("Idade fora das categorias da pesquisa.");

			}
			
		
		}


	}



