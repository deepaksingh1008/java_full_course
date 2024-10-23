package com.destination.assignment;

public class HighestValueInArray {
	public static void findHigestVaule(int arr[]) {
		if(arr.length<=0) {
			System.out.println("Array is empty");
			return;
		}
		int maxi = arr[0];
	  for(int i=1;i<arr.length;i++) {
		  if(maxi<arr[i]) {
			  maxi=arr[i];
		  }
	  }
	  System.out.println("Maximum Element in array = "+ maxi);
	}
  public static void main(String[] args) {
	int arr[] = AdditionOfAllElementInArray.takeInput();
	AdditionOfAllElementInArray.printOneDArray(arr);
	findHigestVaule(arr);
	
	
}
}
