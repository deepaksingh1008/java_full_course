package com.destination.assignment;

public class SortingArray {
  public static void sortInAccOrder(int arr[]) {
	  System.out.println("Sorting Array in assending order");
	  for(int i=0;i<arr.length;i++) {
   	   for(int j=0;j<arr.length-i-1;j++) {
   		   if(arr[j]>arr[j+1]) {
   			   int temp = arr[j];
   			    arr[j]=arr[j+1];
   			    arr[j+1]=temp;
   		   }
   	   }
      }
	
}
  public static void sortInDescOrder(int arr[]) {
	  System.out.println("Sorting Array in dessending order");
	  for(int i=0;i<arr.length;i++) {
   	   for(int j=0;j<arr.length-i-1;j++) {
   		   if(arr[j]<arr[j+1]) {
   			   int temp = arr[j];
   			    arr[j]=arr[j+1];
   			    arr[j+1]=temp;
   		   }
   	   }
      }
	
}
	public static void main(String[] args) {
       int arr[] = AdditionOfAllElementInArray.takeInput();
       System.out.println("Before sorting the array");
       AdditionOfAllElementInArray.printOneDArray(arr);
        sortInAccOrder(arr);
        AdditionOfAllElementInArray.printOneDArray(arr);
        sortInDescOrder(arr);
        AdditionOfAllElementInArray.printOneDArray(arr);
      

	}

}
