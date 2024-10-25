package com.destination.functionoverloading;

class Calculator {
	int add(int a, int b) {
		return a + b;
	}

	float add(int a, float b) {
		return a + b;
	}

	float add(float a, int b) {
		return a + b;
	}

	double add(double a, double b) {
		return a + b;
	}

}
//remove unwanted space ctrl+shift+f

//creating object ctrl+2+l

//ctrl+space; call con


public class FunctionOverLoading {

	public static void main(String[] args) {
//		Calculator calculator2 = new Calculator();
		Calculator calculator = new Calculator();

		System.out.println(calculator.add(10, 200));
		System.out.println(calculator.add(10, 15.4f));
		System.out.println(calculator.add(15.4f, 20));
		System.out.println(calculator.add(123.432, 123.32));

	}

}
