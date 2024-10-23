package com.destination.assignment;

public class RemoveDuplicateFromArray {
	public static boolean check(int arr1[],int i){
        for(int j=0;j<arr1.length;j++){
            if(arr1[j]==i+1){
                return true;
            }
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {24,47,50,56,50,48};
	       int n = arr.length;
	       int arr1[] = new int [n];
	       int ans[] = new int [n];
	       int l=0;
	       int k=0;
	       for(int i=0;i<arr.length;i++){
	           boolean flag = check(arr1,i);
	           boolean flag2 = true;
	           if(flag){
	               continue;
	           }
	           for(int j=0;j<arr.length;j++){
	               if(i!=j && arr[i]==arr[j])
	               {
	                arr1[k++]=i+1;
	                arr1[k++]=j+1;
	                flag2=false;
	                break;
	            }
	       }
	           if(flag2) {
	        	   ans[l++]=arr[i];
	        	   
	           }
	       }
	       System.out.println("Element which are not duplicate");
	       for(int i=0;i<l;i++) {
	    	   System.out.print(ans[i]+ " ");
	       }
	       

	}

}
