package entity;

public class Preguica extends Animal{
	
	private String sobeArvores;

	public Preguica(String nome, int idade, String emitiSom, String sobeArvores) {
		super(nome, idade, emitiSom);
		this.sobeArvores = sobeArvores;
	}

	public String getSobeArvores() {
		return sobeArvores;
	}

	public void setSobeArvores(String sobeArvores) {
		this.sobeArvores = sobeArvores;
	}
	

}
//fim
