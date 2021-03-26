package exemplo;

public class Exemplo1 {

	public static void main(String[] args) {
		
		// variaveis
		
		int valor1=0;
		int valor2=0;
		int soma=0;
		
		//entrada
		
		valor1=10;
		valor2=20;
		
		//processamento
		
		soma=valor1+valor2;
		
		//saída
		
		System.out.println("o valor 1 é "+valor1);
		System.out.println("o valor 2 é "+valor2);
		System.out.println("a soma é: "+soma);
		
	}
	
	//função para pular linha
	
	public static void linha() {
		System.out.println();
		
	}
}
