package com.destination.string.oct16;

import java.util.Scanner;

public class SumAndProductOfGivenString {
    public static String Reverse(String s){
		String ans="";
		for(int i=s.length()-1;i>=0;i--) {
			ans = ans+s.charAt(i);
		}
		return ans;
    	
    	
	}
    public static String sumTwoString(String s1,String s2) {
    	int i=0;
    	int j=0;
    	int carry=0;
    	String ans="";
    	while(i<s1.length() && j<s2.length()) {
    		int a = Integer.parseInt(String.valueOf(s1.charAt(i)));
    		int b = Integer.parseInt(String.valueOf(s2.charAt(j)));
    		int sum = a+b+carry;
    		ans = ans + (sum%10);
    		carry = sum/10;
    		i++;
    		j++;
    	}
    	
    	while(i<s1.length()) {
    		int sum = carry+Integer.parseInt(String.valueOf(s1.charAt(i)));
    		int n = sum%10;
    		ans = ans + n;
    		carry = sum/10;
    		i++;
    	}
    	while(j<s2.length()) {
    		int sum = carry+Integer.parseInt(String.valueOf(s2.charAt(j)));
    		int n = sum/10;
    		ans = ans + n;
    		carry = sum%10;
    		j++;
    	}
    	while(carry>0) {
    		ans = ans + carry%10;
    		carry = carry/10;
    	}
    	String ans1 = Reverse(ans);
    	return ans1;
		
	}
   public static String multiplyTwoString(String s1,String s2) {
	   int arr[] = new int [s1.length()+s2.length()];
	   String ans="";
	   int k=0;
	   int len = 0;
	   for(int i=0;i<s2.length();i++) {
		   int l=k;
		   int carry = 0;
		   int num = Integer.parseInt(String.valueOf(s2.charAt(i)));
		 
		   for(int j=0;j<s1.length();j++) {
			   int num1 = Integer.parseInt(String.valueOf(s1.charAt(j)));
			   int mul = num1*num;
			   int result = mul + carry + arr[l];
			   arr[l] = result % 10;
			   carry = result/10;
			   l++;
		   }
		   
		   if(carry>0) {
			   while(carry>0) {
				   arr[l]=carry%10;
				   carry = carry/10;
				   l++;
			   }
		   }
		   if(len<l) {
			   len = l;
		   }
		  k++; 
	   }
	   
	   for(int i=0;i<len;i++) {
		   ans = ans + Integer.toString(arr[i]);
	   }
	   
	   return Reverse(ans);
	
}
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number 1: ");
	String s1 = sc.next();
	System.out.println("Enter the second number");
	String s2 = sc.next();
	String num1 = "";
	String num2 = "";
	if(s1.length()>=s2.length()) {
		num1=s1;
		num2=s2;
	}
	if(s2.length()>s1.length()) {
		num1 = s2;
		num2 = s1;
	}
	
	String str1 = Reverse(num1);
	String str2 = Reverse(num2);
	
	String ans1 = sumTwoString(str1,str2);
	System.out.println("Total Sum is : "+ans1);
	
   String ans2 = multiplyTwoString(str1,str2);
   System.out.println("Product is : "+ ans2);
	
	
	
}
}
