package com.Demo;

import java.util.Scanner;

public class Calculator {

	static int add(int a,int b) {
		
		return a+b;
	}
	static int sub(int a,int b) {
		
		return a-b;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Addition = "+Calculator.add(a, b));
		System.out.println("Substaction = "+Calculator.sub(a, b));
	}

}
