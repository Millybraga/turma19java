package exemplo;

import java.util.Scanner;

public class Custo {
	
	public static void main(String [] args) {
		
	
	
	double impostoEstado = 0.28, custoF = 0.48;
	double distribuidor, imposto;
	double valorInicio;
	
	Scanner leia = new Scanner (System.in);

		System.out.println("Informe o valor inicial: ");
	valorInicio = leia.nextInt();
    
	double total = valorInicio + (valorInicio * impostoEstado) + (valorInicio * custoF);
        System.out.println("O valor total a ser pago é de: "+ total);
	
	}
}
