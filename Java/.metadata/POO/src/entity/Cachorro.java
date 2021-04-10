package entity;

public class Cachorro extends Animal {
	
	private String corre ;


	public Cachorro(String nome, int idade, String emitiSom, String correr) {
		super(nome, idade, emitiSom);
		this.corre = correr;
	}

	public String getCorrer() {
		return corre;
	}

	public void setCorrer(String correr) {
		this.corre = correr;
	}

	@Override
	
	public String Som() {
		return "Emiti o som: "+getEmitiSom();
	}
	
	//finish
	

}
