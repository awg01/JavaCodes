package com.java.dpatterns;

public class SingletonThreadDemo {

	public static void main(String[] args) {
		Thread a = new Thread(new Runnable() {
			public void run() {
				ThreadDemo t1 = ThreadDemo.getInstance();		
			}
		});
		
		Thread b = new Thread(new Runnable() {
			public void run() {
				ThreadDemo t2 = ThreadDemo.getInstance();		
			}
		});
		
		a.start();
		b.start();
	}

}

class ThreadDemo{
	public static ThreadDemo instance = null;
	private ThreadDemo() {
		System.out.println("Instance created");
	}
	
	public static ThreadDemo getInstance() {
		if(instance == null) {
			synchronized(ThreadDemo.class) {
				if(instance == null) {
					instance = new ThreadDemo();
				}
			}
		}
		return instance;
	}
}
