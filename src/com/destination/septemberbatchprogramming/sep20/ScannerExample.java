package com.destination.septemberbatchprogramming.sep20;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the byte value");
		byte b = sc.nextByte();
		System.out.println("byte value is :"+b);
		System.out.println("enter the short value");
		short s = sc.nextShort();
		System.out.println("shortvalue is :"+s);
		
		System.out.println("enter the integer value");
		int i = sc.nextInt();
		System.out.println("integer value is :"+i);
		
		System.out.println("enter the long value");
		long l = sc.nextLong();
		System.out.println("long value is :"+l);
		
		System.out.println("enter the float value");
		float f = sc.nextFloat();
		System.out.println("float value is :"+f);
		
		System.out.println("enter the double value");
		double d = sc.nextDouble();
		System.out.println("double value is :"+d);
		System.out.println("enter the STRING value");
		String deepak = sc.nextLine();
		System.out.println("String value is :"+deepak);
	}

}
