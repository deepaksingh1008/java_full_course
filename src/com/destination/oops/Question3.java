package com.destination.oops;

class Car {
	int price;
	String name;
	public Car(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	
}

class Phone{
	 String name;
	 int price;
	public Phone(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
}

class Student extends Human {
	Car car  = new Car(11828, "Swift");
	void hasMobile(Phone m) {
		  System.out.println(m.getName());
		  System.out.println(m.getPrice());
	}
	 
}


public class Question3 { 
	public static void main(String[] args) {
		
			Phone m = new Phone("Samsumg", 14400);
			Book b= new Book("got", 1200);
			Student student = new Student();
			System.out.println(student.car.getName());
			System.out.println(student.car.getPrice());
			student.hasMobile(m);
			System.out.println(student.h.getName());
			System.out.println(student.h.getYear());
			student.hasBook(b);
			
			
		
	}
}
