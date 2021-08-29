package com.java.mthreading;

public class ThreadExample4 {

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			public void run() {
				System.out.println("Running ");
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
