package lista1poo;

public class classeAviao {
	
	//atributos
	
	public String cor;
	public String modelo;
	public double velocidadeAtual;
	public double velocidadeMaxima;

	//metodos
	
	void voando() {
		System.out.println("O avi�o est� voando!");
	}
    void acelera(double quantidade) 
    {
		double velocidadeNova =  this.velocidadeAtual+quantidade;
		this.velocidadeAtual = velocidadeNova;
		
		System.out.print("E sua velocidade atual �: ");
		
	}
	 int marcha() 
	 {	
	 
		 if (this.velocidadeAtual < 0) {
    	 return -1; //desligado, n�o passa nenhuma marcha
		 }
		 if(this.velocidadeAtual>=0 && this.velocidadeAtual < 50) {
    	 return 1; //primeira marcha
		 }
		 if(this.velocidadeAtual>=50 && this.velocidadeAtual < 70) {
	    	 return 2;
		 }
	     return 3;
		 }
		
	}
     
     
     
	 
	
 



