package com.destination.abstraction.nov12;

import java.util.Scanner;

abstract class Shapes {
	double area;
	
	abstract void collectData();
	abstract void calculate();
	void display() {
		System.out.println("Area = "+ area);
		System.out.println("==========================");
	}
}

class Circle extends Shapes {
	private double radius;
	final private double pi = 3.14768;
	
	void collectData() {
		System.out.println("Enter the radius of circlre");
		radius = new Scanner(System.in).nextInt();
	}
	
	void calculate() {
		area = pi*radius*radius;
	}
}


class Square extends Shapes {
	private double side;
	
	
	void collectData() {
		System.out.println("Enter the side of square");
		side = new Scanner(System.in).nextInt();
	}
	
	void calculate() {
		area = side*side;
	}
}

class Rectangle extends Shapes {
	private double l,b;
	
	
	void collectData() {
		System.out.println("Enter the length and breath of reactanle");
		l = new Scanner(System.in).nextInt();
		b = new Scanner(System.in).nextInt();
	}
	
	void calculate() {
		area = l*b;
	}
}


class Geometry {
	void useShape(Shapes s) {
		s.collectData();
		s.calculate();
		s.display();
	}
}

public class Question1 {
	
	public static void main(String[] args) {
		Shapes circle = new Circle();
		Shapes square = new Square();
		Shapes rectangle = new Rectangle();
		Geometry g = new Geometry();
		g.useShape(circle);
		g.useShape(square);
		g.useShape(rectangle);
	}

}
