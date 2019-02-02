package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ProgramSet2 {

	public static void main(String[] args) {

		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		// union
		Set<Integer> c = new TreeSet<>(a); //copia o conjunto a no conjunto c
		c.addAll(b); // adiciona todo conjunto b no conjunto c descarta as igualdades
		System.out.println(c);
		
		// intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b); // somente o que tem em comum entre d e b
		System.out.println(d);
		
		// difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b); // remove do conjunto e tudo que exitir no conjunto b ou seja ficam so as diferenças
		System.out.println(e);

	}

}
