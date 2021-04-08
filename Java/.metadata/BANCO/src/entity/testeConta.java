package entity;

import java.util.Locale;
import java.util.Scanner;

public class testeConta {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US); 
		Scanner leia = new Scanner(System.in);
		
		Conta contaJoao = new Conta();
		
		System.out.println("Digite numero da conta: ");
		contaJoao.numero = leia.nextInt();
		System.out.println("Digite o cpf: ");
		contaJoao.cpf = leia.next();
		System.out.printf("Operação em crédito ou debito? 1 - cred. 2- deb");
		
		char opcao = leia.next().charAt(0);
		double valor = 0;
		if (opcao == '1') {
			contaJoao.credito(valor);
		}
		else if (opcao == '2') {
		contaJoao.debito(valor);
		}
		
		System.out.printf("Nome : %s \n ", contaJoao.cpf);
		System.out.printf("Numero %d : \n", contaJoao.numero);
		System.out.printf("Saldo : %.2f \n", contaJoao.numero);
		
		
		
		

	}

}
