package lista1poo;

public class objetoAviao {
	
	public static void main(String[] args)
	{
	
		classeAviao Aviao = new classeAviao();
		
		Aviao.cor = "Branco";
		Aviao.modelo = "Airbus";	
		Aviao.velocidadeAtual = 0;
		Aviao.velocidadeMaxima = 80;
		
		Aviao.voando();
				
		Aviao.acelera(40);

		System.out.println(Aviao.velocidadeAtual);
		
		
		
		
		
		
		
	}

}
