package com.destination.septemberbatch.sep26;

import java.util.Scanner;

public class Pattern15 {
 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the size : ");
	int n = scanner.nextInt();
	
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			if(i>2 && i<n) {
			  if(j==1 || j==i) {
				  System.out.print("# ");
			  }
			  else {
				  System.out.print("- ");
			  }
			}
			else {
				System.out.print("# ");
			}
			
		}
		System.out.println("");
	}
}
}
