package com.destination.septemberbatchprogramming.sep27;

public class PrintAlphabet {
	     public static void printA(int row,int col) {
			for(int i=1;i<=row;i++) {
				for(int j=1;j<=col;j++) {
					if(i==1 || i==(row/2)+1) {
						System.out.print("*");
					}
					else if(j==1 || j==col){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println("  ");
	
			}
		}
         public static void main(String[] args) {
			
        	 int row = 8;
        	 int col = 8;
        	 printA(row,col);
        	 printA(row,col);
        	 
		}
}
