package classes;

public class Pessoa {

	//
	public String nome;
	public int anoNascimento;
	public char genero;
	
	//metodo
	
	public int calcularIdade() {
		return 2021 - anoNascimento;
		//sobrecarga
	}
		
	public int calcularIdade1(int anoAtual) {
		return anoAtual - anoNascimento;
	}
				
	
	public String tratamento() {
		 String saida= "";
		if(genero == '1') {
			saida = "sra";
		
		}
		else if(genero == '2') {
			saida = "sr";
		}
		else if(genero == '3') {
			saida = "sre";
			
		return saida;
		}
		return saida;
	}
	
		
	}	
	
