package entity;

public class Animal {

	
	//atributos
    private String nome;
	private int idade;
	private String emitiSom;

	public Animal(String nome, int idade, String emitiSom) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.emitiSom = emitiSom;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmitiSom() {
		return emitiSom;
	}

	public void setEmitiSom(String emitiSom) {
		this.emitiSom = emitiSom;
	}

	public String Som() {
		return "Emiti o som: ";
	}
	
	
	//fim
	

	
	
		
		
	}
	
