package com.destination.assignment;

import java.util.Scanner;

public class AdditionOfAllElementInArray {
	public static int [] takeInput() {
		System.out.println("Enter the size of Array");
		int n = new Scanner(System.in).nextInt();
		int arr[]=new int [n];
		System.out.println("Enter the element in the array");
		for(int i=0;i<n;i++) {
			arr[i] = new Scanner(System.in).nextInt();
		}
		return arr;
	}
	public static void printOneDArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void addtionOfArray(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("Total Sum = "+ sum);
	}
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int arr[] = takeInput();
	printOneDArray(arr);
	addtionOfArray(arr);
}
}
