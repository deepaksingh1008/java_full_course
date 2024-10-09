package com.destination.oct4;

import java.util.Scanner;

class ArrayOperation{
	String arr[][][];
	int college;
	int cls;
	int stu;
	Scanner scanner = new Scanner(System.in);
	
	void createArray(int n) {
		college = n;
		
		arr = new String [college][][];
		System.out.println("Array is created");
		
	}
	void addData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside collage = "+(i+1));
			 System.out.println("Enter the no of class");
			 cls = scanner.nextInt();
			 arr[i] = new String[cls][];
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter the no of student class = "+(j+1));
				stu = scanner.nextInt();
				arr[i][j]=new String [stu];
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the name of student "+(k+1));
					arr[i][j][k]=scanner.next();
				}
			}
		}
		System.out.println("Data inserted in array");
	}
	void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Collage "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Class no = "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println(" Student "+(k+1)+"name ="+arr[i][j][k]);
				}
			}
		}
	}
}

public class ThreeDArray {

	public static void main(String[] args) {
		ArrayOperation obj1 = new ArrayOperation();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of collage");
		int n = scanner.nextInt();
		
		obj1.createArray(n);
		obj1.addData();
		obj1.display();

	}

}
