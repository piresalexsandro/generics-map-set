package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> { // nao precisa ser T
	
	private List<T> list =  new ArrayList<>();
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public T first(){
		if (list.isEmpty()){
			throw new IllegalStateException("List is empty");
		}
		return list.get(0); //primeiro elemento
	}
	
	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}
}
