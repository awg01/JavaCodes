package com.java.oops;

interface IA{
	void show();
}

class CA implements IA{
	@Override
	public void show() {
		System.out.println("Show");
	}
}

public class LambdaDemo {

	public static void main(String[] args) {
		IA obj = new CA();
		obj.show();
	}

}
