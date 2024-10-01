package com.destination.augustbatch.sep25;

import java.util.Scanner;

public class Pattern13 {
   public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int n = scanner.nextInt();
	
	int temp = n * (n+1)/2;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(temp+" ");
			temp--;
		}
		System.out.println();
	}
}
}
