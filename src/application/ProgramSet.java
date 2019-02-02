package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class ProgramSet {
	public static void main(String[] args) {
		
		//Set<String> set = new HashSet<>(); // nao mantem a ordem
		//Set<String> set = new TreeSet<>();
		Set<String> set = new LinkedHashSet<>(); // mantemm a ordem
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		System.out.println(set.contains("Notebook"));
		//set.remove("Tablet");
		//set.removeIf(x -> x.length() >= 3); // remove o notebook e o tablet (remove x tal que tenha o tamanho maior ouigual a 3)
		//set.removeIf(x -> x.charAt(0) == 'T'); // remove a tv e o notebook
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}
