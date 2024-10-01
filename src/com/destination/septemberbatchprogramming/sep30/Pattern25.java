package com.destination.septemberbatchprogramming.sep30;

import java.util.Scanner;

public class Pattern25 {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int count = 1;
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			Boolean flag=true;
			for(int j=0;j<n;j++) {
				

			  if((i<n/2 && j<(n/2)-i ) || ((i>n/2 && j<i-n/2))) {
				  System.out.print("_ ");
			  }
			  
			  else {
				 if((i<n/2) && j>=(n/2)+1 && flag) {
					 for(int k = 1;k<=count;k++) {
						    if(k<n)
							System.out.print(k+" "); 
						 }
					 flag=false;
					 count =count+2;
				 }
				 else if(i==n/2 && j==0) {
					 count=count-2;
				 }
				 else if((i>n/2) && flag) {
					 for(int k = 1;k<=count;k++) {
						    if(k<n)
							System.out.print(k+" "); 
						 }
					 flag=false;
					 count =count-2;
				 }
				 
			  }
			 
			}
			
			if(i!=n/2) {
				System.out.println("");
			}
		}
}
}
