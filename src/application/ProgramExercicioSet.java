package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class ProgramExercicioSet {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			Set<Integer> a = new HashSet<>(); //criando conjunto
			Set<Integer> b = new HashSet<>(); //criando conjunto
			Set<Integer> c = new HashSet<>(); //criando conjunto
			
			System.out.print("How many students for course A? ");
			int n = sc.nextInt();
			for (int i = 0; i<n; i++) {
				int	number = sc.nextInt();
				a.add(number);
			}
			
			System.out.print("How many students for course B? ");
			n = sc.nextInt();
			for (int i = 0; i<n; i++) {
				int	number = sc.nextInt();
				b.add(number);
			}
			
			System.out.print("How many students for course C? ");
			n = sc.nextInt();
			for (int i = 0; i<n; i++) {
				int	number = sc.nextInt();
				c.add(number);
			}
			
			Set<Integer> total = new HashSet<>(a);
			total.addAll(b);
			total.addAll(c);
			
			System.out.println("Total de estudantes: " + total.size());
			
	}
}
