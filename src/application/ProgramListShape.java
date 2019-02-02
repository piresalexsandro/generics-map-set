package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class ProgramListShape {

	public static void main(String[] args) {
		
		List<Shape> myShapes = new ArrayList<>(); // lista espcifica de shapes logo recebe qqr figura
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		System.out.println("Total area: " + totalArea(myCircles));
	}
	
	//tipo curinga extendendo Shape ou seja ela pode ser uma lista de shapes ou de qualquer subtipo de shape
	//nao podemos addicionar nenhum tipo de elemento por ser um lista de tipo delimitado
	public static double totalArea(List<? extends Shape> list) { 
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}
