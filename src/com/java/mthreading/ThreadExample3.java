package com.java.mthreading;

public class ThreadExample3 {

	public static class MyRunnable implements Runnable{
		@Override
		public void run() {
			System.out.println("MyRunnable running");
			System.out.println("MyRunnable finished");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new MyRunnable());
		t.start();
	}

}
