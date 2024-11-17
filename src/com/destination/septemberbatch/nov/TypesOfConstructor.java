package com.destination.septemberbatch.nov;

class Dog{
	String name;
	String color;
	String breed;
	int cost;
	int age;
	public Dog() {
		super();
		System.out.println("hi from zero parameterized");
	}
	public Dog(String name) {
		this("rockey","black");
		System.out.println("hi from 1st parametrized");
		this.name = name;
	}
	public Dog(String name,String color) {
		this("hima","brown","GR");
		System.out.println("hi from second Parameterized");
		this.name = name;
		this.color = color;
	}
	
	public Dog(String name,String color,String breed) {
		 this("Raju","Pink","PR",4000);
		 System.out.println("hi from third parameterized constructor");
		 this.name = name;
		 this.color = color;
		 this.breed = breed;
	}
	
	public Dog(String name,String color,String breed,int cost) {
		 this("Raju","green","GR",4000,6);
		 System.out.println("hi from fourth parameterized constructor");
		 this.name = name;
		 this.color = color;
		 this.breed = breed;
		 this.cost=cost;
	}
	
	public Dog(String name,String color,String breed,int cost,int age) {
		super();
		 System.out.println("hi from fifth parameterized constructor");
		 this.name = name;
		 this.color = color;
		 this.breed = breed;
		 this.cost=cost;
		 this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public String getBreed() {
		return breed;
	}
	public int getCost() {
		return cost;
	}
	public int getAge() {
		return age;
	}
	
	
}

public class TypesOfConstructor {
 public static void main(String[] args) {
	Dog d1 = new Dog();
	System.out.println(d1.getName());
	System.out.println(d1.getColor());
	System.out.println(d1.getBreed());
	System.out.println(d1.getCost());
	System.out.println(d1.getAge());
	System.out.println("=====================================");
	Dog d2 = new Dog("Ramu");
	System.out.println(d2.getName());
	System.out.println(d2.getColor());
	System.out.println(d2.getBreed());
	System.out.println(d2.getCost());
	System.out.println(d2.getAge());
	
}
}
