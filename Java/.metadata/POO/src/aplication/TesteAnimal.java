package aplication;

import entity.Cachorro;
import entity.Cavalo;
import entity.Preguica;

public class TesteAnimal {
	

	public static void main(String[] args) {

	
	Cachorro animal1 = new Cachorro("Billy\n",5,"au au","\ncorre");	
	Cavalo animal2 = new Cavalo("\nFred\n", 3,"pocótó","\ncorre");
	Preguica animal3 = new Preguica("\nPit\n", 4,"shh", "\ndeve subir em arvores");

	
	System.out.println(animal1.getNome()+ animal1.getIdade()+ " anos de idade "+ "\nSom: "+animal1.getEmitiSom()+ animal1.getCorrer());
	System.out.println(animal2.getNome()+ animal2.getIdade()+ " anos de idade "+"\nSom: "+ animal2.getEmitiSom()+animal2.getCorrer());	
	System.out.println(animal3.getNome()+ animal3.getIdade()+ " anos de idade "+"\nSom: "+ animal3.getEmitiSom()+animal3.getSobeArvores());

	
	}	
}
//fim
