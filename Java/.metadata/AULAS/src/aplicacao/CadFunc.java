package aplicacao;

import java.util.Scanner;

import classes.Pessoa;

public class CadFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);// instanciar um teclado
		
		Pessoa func1 = new Pessoa();// instanciar uma pessoa
		Pessoa func2 = new Pessoa();
		int idade1=0, idade2=0;
		
		System.out.println("Digite o nome do funcionario 1: ");
		func1.nome = leia.next();
		System.out.println("Digite o nome do funcionario 2: ");
		func2.nome = leia.next();
		System.out.println("Digite o ano de nascimento do funcionario 1");
		func1.anoNascimento = leia.nextInt();
		System.out.println("Digite o ano de nascimento do funcionario 2");
		func2.anoNascimento = leia.nextInt();
		System.out.println("Func1 você é 1 - feminino,2- masculino, 3- outros ");
		func1.genero = leia.next().charAt(0);
		System.out.println("Func1 você é 1 - feminino,2- masculino, 3- outros ");
		func2.genero = leia.next().charAt(0);
		
		
		System.out.printf("idade pessoa 1 - %d anos\n", func1.calcularIdade());
		System.out.printf("idade pessoa 2 - %d anos\n",func2.calcularIdade());
		
		if(func1.calcularIdade() < func2.calcularIdade()) {
			
			System.out.printf("O %s %s é a pessoa mais velha.", func2.tratamento(), func2.nome);
			
		}
		else {
			System.out.printf("O %s %s é a pessoa mais velha.", func1.tratamento(), func1.nome);

		}

		
		
		
	}

}
