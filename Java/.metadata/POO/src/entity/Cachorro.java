package entity;

public class Cachorro extends Animal {
	
	private String correr ;


	public Cachorro(String nome, int idade, String emitiSom, String correr) {
		super(nome, idade, emitiSom);
		this.correr = correr;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

	
	
	

}
