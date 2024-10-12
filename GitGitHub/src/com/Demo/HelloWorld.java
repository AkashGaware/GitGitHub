package com.Demo;

import java.util.Scanner;

public class HelloWorld {

static	void greet(String name)
	{
		System.out.println("\n\t\tHello "+name);
	}
	public static void main(String[] args) {
	Scanner	sc = new Scanner(System.in);
	System.out.println("Enter Name to Greet!!");
	String name = sc.nextLine();
		HelloWorld.greet(name);
	}

}
