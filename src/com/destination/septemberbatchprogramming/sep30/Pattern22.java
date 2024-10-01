package com.destination.septemberbatchprogramming.sep30;

import java.util.Scanner;

public class Pattern22 {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i%2==0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println("");
		}
}
}
