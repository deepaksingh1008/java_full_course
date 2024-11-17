package com.destination.septemberbatch.nov;

class Parent {
	
	 public Parent() {
		System.out.println("This is the parent class");
	}
	
}

class Child extends Parent {
	public Child() {
		super();
		System.out.println("This is child class contructor");
	}
}



public class SuperContructor {
      
	public static void main(String[] args) {
//		 Parent p1 = new Parent();
		 Child c1 = new Child();
	}
}
