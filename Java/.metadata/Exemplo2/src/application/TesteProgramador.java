package application;

import java.util.Locale;
import java.util.Scanner;

import entity.Funcionario;
import entity.terceiro;

public class TesteProgramador {
	
	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Funcionario func1 = new Funcionario("32232", " FRED ",25,10.00);
		terceiro terc1 = new terceiro("32242", "BOB", 25, 10.00,5);

		System.out.println("Matrícula: "+func1.getMatricula()+ " funcionario: " + func1.getNome()+" salario R$: "+func1.valorSalario());
		System.out.println("Matrícula: "+terc1.getMatricula()+ " terceiro: " +terc1.getNome()+ " salario R$: "+terc1.valorSalario());

		
		
		
		
	}

}
