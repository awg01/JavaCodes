package com.java.oops;

//Types of interfaces
/*
 *  marker interface
 *  single abstract method interface - functional interface - lambda expression
 *  normal interface
 */

interface DemoInterface{
	void show();
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		DemoInterface f = () -> System.out.println("Functional interface demo");
		f.show();
	}
}
