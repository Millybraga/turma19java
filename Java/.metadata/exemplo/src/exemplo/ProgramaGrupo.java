package exemplo;

import java.util.Scanner;

public class ProgramaGrupo {
	
	public static void main(String []args) {

		Scanner leia = new Scanner (System.in);
		
		final int ANOATUAL=2021;
		String nome;
		char genero;
		int anoNascimento=0;
		int maiorIdade=0;
		int idade;
		int menorIdade;
		
		for(int i=0;i < 2; i++)

		System.out.printf("Digite o nome da %d pessoa: ", i+1);
		nome = leia.next();
		System.out.printf("%s Digite o ano de nascimento da  pessoa: ", nome);
		anoNascimento = leia.nextInt();
		System.out.printf("%s Digite o genero: F- feminino, M- masculino, O- outros : ", nome);
		genero = leia.next().toUpperCase().charAt(0);
		
		idade = ANOATUAL - anoNascimento;
		
		if (idade > maiorIdade) {
			maiorIdade = idade;
		}
		
		//tem que criar uma variavel nome1 e nome2
		
	}

}
