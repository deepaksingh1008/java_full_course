package com.destination.oops;

public class Question1 {
 public static void main(String[] args) {
	 Book b = new Book("Game Of Throne", 2421);
	   Human s=new Human();
	   System.out.println(s.h.getName());
	   System.out.println(s.h.getYear());
	   s.hasBook(b);
}
}




class Heart{
	 String name;
	 int year;
	public Heart(String name, int year) {
		super();
		this.name = name;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	
	 
}

class Book{
	String name;
	int price;
	public Book(String name, int price) {
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
class Brain{
	  String type;
	  int weight;
}

class Human {
	 Heart h = new Heart("Deepak Singh", 22);
   void hasBook(Book b) {
   	System.out.println(b.getName());
   	System.out.println(b.getPrice());
   }
   

}



