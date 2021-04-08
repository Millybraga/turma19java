package entity;

public class Cavalo extends Animal {
	
	private String correr;

	
	public Cavalo(String nome, int idade, String emitiSom, String correr) {
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
	
	
	


