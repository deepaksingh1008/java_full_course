package com.destination.septemberbatch.sep26;

import java.util.Scanner;

public class Pattern19 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the size: ");
	 int n = sc.nextInt();
	 for(int i=1;i<=n;i++) {
		 for(int j=n*2;j>0;j--) 
		 {
			 if(j<=n-i+1) {
				 System.out.print("*");
			 }
			 else {
				 System.out.print("-");
			 }
			 
		 }
		 
		 System.out.println("");
	 }
}
}
