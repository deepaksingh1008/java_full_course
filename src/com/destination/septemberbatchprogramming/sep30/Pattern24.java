package com.destination.septemberbatchprogramming.sep30;

import java.util.Scanner;

public class Pattern24 {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		char ch = 'A';
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println("");
		}
}
}