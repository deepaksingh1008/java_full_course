package com.destination.septemberbatchprogramming.sep30;

import java.util.Scanner;

public class Pattern26 {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int count=1;
		int count2;
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			count = i;
			count2=i;
			for(int j=1;j<=n;j++) {

			  if((j==1 || j==n)) {
				  System.out.print("1 ");
			  }
			  else if(j==(n/2)+1) {
				  System.out.print(count+ " ");
			  }
			  else {
				  System.out.print("2 ");
			  }
			  
			}
			count++;
			System.out.println("");
		}
}
}
