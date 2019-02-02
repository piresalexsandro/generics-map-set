package application;

import java.util.HashSet;
import java.util.Set;

import entities.ProductEquals;

public class ProgramTestIgualdade {

	public static void main(String[] args) {

		Set<ProductEquals> set = new HashSet<>();
		
		set.add(new ProductEquals("TV", 900.0));
		set.add(new ProductEquals("Notebook", 1200.0)); // instancias diferentes por isso da erro
		set.add(new ProductEquals("Tablet", 400.0));
		
		// instancias diferentes por isso da falso 
		//isto se resolve com a implementação dos metodos HASCODE e EQUALS
		ProductEquals prod = new ProductEquals("Notebook", 1200.0); 
		
		System.out.println(set.contains(prod));

	}

}
