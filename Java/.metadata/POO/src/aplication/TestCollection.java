package aplication;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Scanner;

import entity.ExercCollection;

public class TestCollection {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Collection<String> lista = new ArrayList<>();
		
		lista.add("Livro");
		lista.add("Shampoo");
		lista.add("Bolsas");

		System.out.println(lista);
		
		lista.remove("Bolsas");
		System.out.println(lista);
		
		for(String itens : lista) {
			System.out.println("Produto: "+itens);
		}
		
		
		
		
		
		
		
		
	}	
}
