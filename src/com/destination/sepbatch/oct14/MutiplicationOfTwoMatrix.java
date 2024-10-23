


package com.destination.sepbatch.oct14;

import java.util.Scanner;

public class MutiplicationOfTwoMatrix {

	
	public static void  multiplyMatrix(int mat1[][],int mat2[][],int n,int m,int ans[][]) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				for(int k=0;k<m;k++) {
					ans[i][j]+= mat1[i][k]*mat2[k][j];
				}
			}
		}
		
	}
	public static void printArray(int mat[][],int n,int m) {
		System.out.println("after addition");
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
	int mat2[][] = new int [n][m];
	int ans [][] = new int [n][m];
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			System.out.println("Enter the matix 1 "+"row"+i+"col"+j);
			int data1 = sc.nextInt();
			mat1[i][j]=data1;
			System.out.println("Enter the matix 2 "+"row"+i+"col"+j);
			int data2 = sc.nextInt();
			mat2[i][j]=data2;
			
		}
	}
	multiplyMatrix(mat1,mat2,n,m,ans);
	printArray(ans, n, m);
}
}
