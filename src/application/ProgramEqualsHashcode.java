package application;

import entities.Client;

public class ProgramEqualsHashcode {

	public static void main(String[] args) {
		String name1 = "Maria";
		String name2 = "Alex";
		String s1 = "Teste";
		String s2 = "Teste";
		
		
		//Console.WriteLine(name1.equals(name2));
		System.out.println(name1.equals(name2));
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
			
		System.out.println();
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2); // <= desta forma ele compara a posição de memoria logo nunca sera igual
		System.out.println(s1 == s2); // <= desta forma ele compara a posição de memoria logo nunca sera igual
	}

}
