package com.destination.string.oct16;

public class ObjectBasedStringComp {
  public static void main(String[] args) {
	String s1 = new String("rama");
	String s2 = new String("rama");
	if(s1.length() == s2.length()) {
		if(s1.equals(s2) == true) {
			System.out.println(s1.compareToIgnoreCase(s2));
			System.out.println("String are equal");
		}
		else {
			System.out.println(s1.compareToIgnoreCase(s2));
			System.out.println("String are not equal");
		}
		System.out.println("-----------------------");
		if(s1==s2) {
			System.out.println("references are equal");
		}
		else {
			System.out.println("References not are equal");
		}
	}
}
}
