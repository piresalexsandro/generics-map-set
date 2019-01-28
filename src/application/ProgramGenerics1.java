package application;

import java.util.Scanner;

import services.PrintService;

public class ProgramGenerics1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>(); //pode trocar para String
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int value = sc.nextInt(); //pode trocar para sc.next()
			ps.addValue(value);
		}
		
		ps.print();
		Integer x = ps.first(); //pode trocar para String x = ps.first();
		System.out.println("First: " + x);
		
		sc.close();
	}

}
