package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entity.Funcionario;
import entity.terceiro;

public class CadUsuario {
	
	public static void main(String [] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>(); //interface

		System.out.println("CADASTRO FUNCIONARIOS - PAGAMENTOS");
		System.out.println("Quantidade de funcionarios que serão cadastrados");
		int qtde = leia.nextInt();
		
		for (int x=1; x<= qtde; x++) {
			System.out.printf("Funcionario %d\n",x);
			System.out.println("digite 1 - funcionario/ 2 -terceiro: ");
			char tipo = leia.next().charAt(0);
			System.out.println("digite a matricula: ");
			String matricula = leia.next();
			System.out.println("digite o nome: ");
			String nome = leia.next();
			System.out.println("digite as horas de trabalho: ");
			int horasTrabalhadas = leia.nextInt();
			System.out.println("digite o valor por hora de trabalho: ");
			double valorHora = leia.nextDouble();
			if (tipo == '2') {
				System.out.println("digite o valor adicional: ");
				double adicional = leia.nextDouble();
			terceiro colaborador = new terceiro(matricula, nome, horasTrabalhadas, valorHora,adicional); 
			lista.add(new terceiro(matricula, nome, horasTrabalhadas, valorHora,adicional)); 
			
			}else {
				lista.add(new Funcionario(matricula, nome, horasTrabalhadas, valorHora));

			
			}
			
		}
		
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTOS");
		
		//FOR EACH
		for (Funcionario func: lista) {
			System.out.println(func.getNome()+" Salario R$" + func.valorSalario());
		}
		System.out.println("FIM DE PROGRAMA");
	}

}
