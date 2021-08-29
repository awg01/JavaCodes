package com.java.mthreading;

//create a class that extends Thread class and override run method
public class ThreadExample2{

	public static class MyThread extends Thread{
		public void run() {
			System.out.println("MyThread running");
			System.out.println("MyThread finished");
		}
	}
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
	}

}
