package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramTiposCuringa {
	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(5, 20, 15, 20);
		printList(myInts);
		
		List<String> myStr = Arrays.asList("jaqueline", "junior", "Giulia");
		printList(myStr);
		
		//List<?> e o supertipo de qualquer tipo de lista
		  //List<Object> myObjs = new ArrayList<Object>();
		/*List<?> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers;
		Object obj;
		Integer x =  10;
		obj = x;*/
	}
	
	public static void printList(List<?> list) {
		//list.add(3); => erro pois o compilador nao sabe dizer qual o tipo primitivo do 3, logo nao posso add
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
