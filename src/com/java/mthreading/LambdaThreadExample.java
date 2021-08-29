package com.java.mthreading;

public class LambdaThreadExample {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			System.out.println("Hello");
		};
		
		Thread t = new Thread(runnable);
		t.start();
	}

}
