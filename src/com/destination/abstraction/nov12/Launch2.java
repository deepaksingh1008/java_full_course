package com.destination.abstraction.nov12;


abstract class Plane1 {
	void takeoff() {
		System.out.println("Plane took off");
	}
	abstract void fly();
	void land() {
		System.out.println("Plane has landed");
	}
}
public class Launch2 {

	public static void main(String[] args) {
		
//		Plane1 p1 = new Plane1(); //cannot create the object of abstract class directly
		Plane1 P2; //Reference of the abstract class can be created directly
		
		Plane1 p3 = new Plane1() {
			
			@Override
			void fly() {
				System.out.println("Plane flys");
				
			}
		};
		System.out.println(p3);
		p3.takeoff();
		p3.fly();
		p3.land();
	}
}
