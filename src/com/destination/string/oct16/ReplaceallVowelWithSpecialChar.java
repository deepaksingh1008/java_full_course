package com.destination.string.oct16;

import java.util.Scanner;

public class ReplaceallVowelWithSpecialChar {
	public static boolean checkVowel(char ch) {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			return true;
		}
		return false;
			
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
         String s = scanner.next();
         char arr[] = {'@','#','$','%','&','*','!','?'};
         String ans = "";
          int n = arr.length;
         for(int i=0;i<s.length();i++) {
         int randomNumber = (int)(Math.random() * n);
          if(checkVowel(s.charAt(i))) {
        	   char ch = arr[randomNumber];
        	   ans = ans + ch;
          }
          else {
        	  ans = ans + s.charAt(i);
          }
         }
         System.out.println(ans);

         
	}

}
