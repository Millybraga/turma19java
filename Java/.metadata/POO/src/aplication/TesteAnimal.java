package aplication;

import entity.Cachorro;
import entity.Cavalo;
import entity.Preguica;

public class TesteAnimal {
	

	public static void main(String[] args) {

	
	Cachorro animal1 = new Cachorro("Billy\n",5,"au au","\ncorre");	
	Cavalo animal2 = new Cavalo("\nFred\n", 3,"poc?t?","\ncorre");
	Preguica animal3 = new Preguica("\nPit\n", 4,"shh", "\ndeve subir em arvores");

	System.out.println(animal1.getNome()+ animal1.getIdade()+ " anos de idade\n"+ animal1.Som() + animal1.getCorrer());
	System.out.println(animal2.getNome()+ animal2.getIdade()+ " anos de idade\n"+ animal2.Som()+animal2.getCorrer());	
	System.out.println(animal3.getNome()+ animal3.getIdade()+ " anos de idade\n"+ animal3.Som()+animal3.getSobeArvores());

	
	}	
}




