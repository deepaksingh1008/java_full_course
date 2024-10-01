package com.destination.septemberbatchprogramming.sep30;

import java.util.Scanner;

public class Pattern23 {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int count=1;
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {

			  if(count<10) {
				  System.out.print("0"+count+" ");
			  }
			  else {
				  System.out.print(count + " ");
			  }
			  count++;
			}
			System.out.println("");
		}
}
}
