package com.destination.assignment;

public class FindDublicate {
	
   
	public static void main(String[] args) {
		int arr[]= {23,47,47,50,56,50,48,23,48};
	       for(int i=0;i<arr.length;i++){
	           for(int j=i+1;j<arr.length;j++){
	               if(arr[i]==arr[j])
	               {
	                System.out.print(arr[i] + " ");
	                break;
	            }
	       }
	       }
	       
	       

	}

}
