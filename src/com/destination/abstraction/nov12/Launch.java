package com.destination.abstraction.nov12;

abstract class plane{
	abstract void takeoff();
	abstract void fly();
	abstract void land();
}

class CargoPlane extends plane {
	
	void fly() {
		 System.out.println("Cargo Plane fly at low heights");
	}
	void takeoff() {
	   System.out.println("Cargo is takeoffs");
	}
	void land() {
		 System.out.println("Cargo plane is land");
	}
}

class PassengerPlane extends plane {
	void fly() {
		 System.out.println("Passenger Plane fly at low heights");
	}
	void takeoff() {
	   System.out.println("Passenger is takeoffs");
	}
	void land() {
		 System.out.println("Passenger plane is land");
	}
	
}

class FighterPlane extends plane {
	void fly() {
		 System.out.println("Fighter Plane fly at low heights");
	}
	void takeoff() {
	   System.out.println("Fighter is takeoffs");
	}
	void land() {
		 System.out.println("Fighter plane is land");
	}
}




public class Launch {

	
	public static void main(String[] args) {
		CargoPlane c = new CargoPlane();
		PassengerPlane p = new PassengerPlane();
		FighterPlane f = new FighterPlane();
		c.fly();
		c.land();
	     c.takeoff();
	     p.fly();
	     p.land();
	     p.takeoff();
	     f.fly();
	     f.land();
	     f.takeoff();
	}
}
