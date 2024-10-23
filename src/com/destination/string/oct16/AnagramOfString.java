package com.destination.string.oct16;

import java.util.Scanner;

public class AnagramOfString {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int arr[] = new int [26];
    System.out.println("enter the first string ");
    String s1 = sc.next();
    System.out.println("Enter the second String");
    String s2 = sc.next();
    
    for(int i=0;i<s1.length();i++) {
    	arr[s1.charAt(i)-'a']++;
    }
    for(int i=0;i<s2.length();i++) {
    	arr[s2.charAt(i)-'a']--;
    }
    
    for(int i=0;i<26;i++) {
    	if(arr[i]!=0) {
    		System.out.println("String are not anagram");
    		return;
    	}
    }
    
    System.out.println("String are anagram");
    
    
    
    
    

}
}
