package com.destination.septemberbatch.nov5;

class Shadow{
	String name;
	String surname;
	String address;
	int age;
	String petname;
	
	void setData(String name,String surname,String address,int age,String petname) {
		   this.name = name;
		   this.surname = surname;
		   this.address = address;
		   this.age = age;
		   this.petname = petname;
		   
		   
	}
	void setData2(String name,String surname,String address,int age,String petname) {
		   name = name;
		   surname = surname;
		   address = address;
		   age = age;
		   petname = petname;
		   
		   
	}
	
	void printData() {
		System.out.println(name);
		System.out.println(surname);
		System.out.println(address);
		System.out.println(age);
		System.out.println(petname);
		
	}

	
}

public class Shadowin {

	public static void main(String[] args) {
		Shadow d1 = new Shadow();
	//	d1.setData2("Deepak", "Singh", "Ghaziabad", 22, "Rockey"); here we get null value and 0 for integer
		d1.setData("Deepak", "Singh", "Ghaziabad", 22, "Rockey");
		d1.printData();

	}

}