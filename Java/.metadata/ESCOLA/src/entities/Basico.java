package entities;

public class Basico extends Estudante{
	
	//atributos
	private int diaAniversario;
	
	//construtores
	public Basico(int matricula, String cpf, int diaAniversario) {
		super(matricula, cpf);
		this.diaAniversario = diaAniversario;
	}
	
	//encapsulamento
	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	public void bonusAniversario(int diaAtual) {
		if(diaAniversario == diaAtual) {
			
			super.incluirPontos(super.getPontos()*10);
		}
	}
	
	
	
	

}
