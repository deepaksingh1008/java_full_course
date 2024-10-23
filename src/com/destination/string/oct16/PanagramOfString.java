package com.destination.string.oct16;

import java.util.Scanner;

public class PanagramOfString {
public static void main(String[] args) {
	int arr[] = new int [26];
	System.out.println("Enter the String");
	String s = new Scanner(System.in).next();
	for(int i=0;i<s.length();i++) {
		arr[s.charAt(i)-'a']++;
	}
	
	for(int i=0;i<26;i++) {
		if(arr[i]==0) {
			System.out.println("String is not panagram");
			return;
		}
	}
	System.out.println("String is panagram");

}
}
