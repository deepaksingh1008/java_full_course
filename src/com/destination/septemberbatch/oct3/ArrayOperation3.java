package com.destination.septemberbatch.oct3;

import java.util.Scanner;

class ArrayOperation{
	int arr[][];
	int cls;
	Scanner sc = new Scanner(System.in);
	
	void createArray(int n) {
		cls = n;
		arr = new int[n][];
		System.out.println("Collectiong student count for each class");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the student count in class"+(i+1));
			int stu = sc.nextInt();
			arr[i]=new int[stu]; 
		}
		System.out.println("Array created successfully");
		System.out.println("=============");
	}
	void addData() {
		System.out.println("collecting array data: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the no student in class "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter the mark of student no :"+(j+1));
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("mark collected successfully");
		System.out.println("=============");
	}
	void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("No of student in class"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Marks of student no :" + (j+1)+"=" + arr[i][j]);
			}
		}
	}

	
}
public class ArrayOperation3 {
   public static void main(String[] args) {
	ArrayOperation obj1 = new ArrayOperation();
	int n;
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the no of class :");
	n=scanner.nextInt();
	obj1.createArray(n);
	obj1.addData();
	obj1.display();
	
	
}
}
