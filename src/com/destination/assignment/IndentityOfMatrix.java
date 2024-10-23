package com.destination.assignment;

import java.util.Scanner;

public class IndentityOfMatrix {
	public static boolean  IndetityOfMatix(int mat1[][],int n,int m) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(i==j && mat1[i][j]!=1) {
					return false;
				}
				if(i!=j && mat1[i][j]!=0) {
					return false;
				}
			}
		}
		return true;
		
	}
	public static void printArray(int mat[][],int n,int m) {
		
      for(int i=0;i<n;i++) {
    	  for(int j=0;j<m;j++) {
    		  System.out.print(mat[i][j]+" ");
    	  }
    	  System.out.println();
      }
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n,m;
		System.out.println("Enter the number of row and col");
		n=sc.nextInt();
		m=sc.nextInt();
		int mat1[][] = new int [n][m];
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.println("Enter the value in matrix");
				int data1 = sc.nextInt();
				mat1[i][j]=data1;
				
				
			}
		}
		boolean result =  IndetityOfMatix(mat1,n,m);
		printArray(mat1, n, m);
		if(result) {
			System.out.println("Matrix is identity");
		}
		else {
			System.out.println("Matrix is not identity");
		}
	}

}
