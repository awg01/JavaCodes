package com.java.oops;

//Java program to demonstrate that enums can have constructor
//and concrete methods.

//An enum (Note enum keyword inplace of class keyword)
enum Color {
	RED, GREEN, BLUE;

	// enum constructor called separately for each
	// constant
	private Color() {
		System.out.println("Constructor called for : " + this.toString());
	}

	public void colorInfo() {
		System.out.println("Universal Color");
	}
}

public class EnumDemo {

	public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);
        c1.colorInfo();
	}

}
