package exemplo;

import java.util.Scanner;

public class HoraMinSegundo {

	public static void main(String[] args) {
		
		int tempoSeg;
		int horas; 
		int minutos;
		int segundos;
		
		Scanner leia = new Scanner (System.in);

		System.out.print("Informe a quantidade de segundos do evento: ");
		
	       tempoSeg = leia.nextInt();

	       // 60 min e 60 seg : reduzir a hora em segundo entao 60x60 = 3.600 seg é 1 hora
	       
	       horas = tempoSeg / (60*60);
	       minutos = tempoSeg%(60*60)/60;
	       segundos = tempoSeg%(60*60)%60;

	       System.out.println("Quantidade de horas do evento: " + horas + "\nQuantidade de minutos: "+ minutos +"\nQuantidade de segundos: "+ segundos);
	       
		
		
	}
	
}
