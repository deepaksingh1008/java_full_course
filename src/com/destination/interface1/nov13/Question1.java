package com.destination.interface1.nov13;

import java.util.Scanner;





interface shapes{
	 void collectData();
	 void calculate();
	 void display();
}


class circle implements shapes {
	private double radius;
	final private double pi = 3.14768;
	private double area;
	public void collectData() {
		System.out.println("Enter the radius of circlre");
		radius = new Scanner(System.in).nextInt();
	}
	
	public void calculate() {
		 area = pi*radius*radius;
	}
	public void display() {
		System.out.println("Area Of Circle is :"+area);
	}
}


class Square implements shapes {
	private double side;
	double area;
	
	
	public void collectData() {
		System.out.println("Enter the side of square");
		side = new Scanner(System.in).nextInt();
	}
	
	public void calculate() {
		area = side*side;
	}
	public void display() {
		System.out.println("Area Of square is :"+area);
	}
}



class Rectangle implements shapes {
	private double l,b;
	double area;
	
	public void collectData() {
		System.out.println("Enter the length and breath of reactanle");
		l = new Scanner(System.in).nextInt();
		b = new Scanner(System.in).nextInt();
	}
	
	public void calculate() {
		area = l*b;
	}
	public void display() {
		System.out.println("Area Of Rectangle is :"+area);
	}
}


class Geometry {
	void useShape(shapes s) {
		s.collectData();
		s.calculate();
		s.display();
	}
}


public class Question1 {

	public static void main(String[] args) {
		
		shapes circle = new circle();
		shapes square = new Square();
		shapes rectangle = new Rectangle();
		Geometry g = new Geometry();
		g.useShape(square);
		g.useShape(circle);
		g.useShape(rectangle);
	}

}
