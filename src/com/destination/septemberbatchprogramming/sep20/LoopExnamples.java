package com.destination.septemberbatchprogramming.sep20;

class Loops{
	 void ForLoop(int n,String s) {
		 System.out.println("For loop");
		 for(int i=1;i<=n;i++) {
			 System.out.println(s);
		 }
	 }
	 void WhileLoop(int n,String s) {
		 System.out.println("while Loop");
		 int i=1;
		 while(i<=n) {
			 System.out.println(s);
			 i++;
		 }
	 }
	 void DoWhileLoop(int n,String s) {
		 System.out.println("do while Loop");
		 int i=1;
		 do {
			System.out.println(s);
			i++;
		} while (i<=n);
	 }
}

public class LoopExnamples {

	public static void main(String[] args) {
		
	Loops obj1 = new Loops();
	obj1.ForLoop(10, "Hello for Loop");
	obj1.WhileLoop(10, "Hello for While Loop");
	obj1.DoWhileLoop(10, "Hello for do while Loop");
		
	}

}
