package com.destination.septemberbatchprogramming.sep27;

import java.util.Scanner;

public class UniversalPattern {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the no of row:");
	int n = scanner.nextInt();
	System.out.println("Enter the no of col");
	int m = scanner.nextInt();
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			if(i==0 || i==n-1 || j==0 || j==n-1 || i==n/2 || j==n/2 || i==j || i+j==n-1 || i+j==n/2 || j-i==(n/2) || i-j==n/2 || i+j==(n-1+(n/2))) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println("");
	}
}
}
