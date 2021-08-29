package com.java.oops;

interface Abcd{
	void show();
}

public class AfterAnonymousInterface {

	public static void main(String[] args) {
		Abcd obj = new Abcd() {
			public void show() {
				System.out.println("anything");
			}
		};
		
		obj.show();
	}
}
