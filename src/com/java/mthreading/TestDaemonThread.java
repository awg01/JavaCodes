package com.java.mthreading;

class TestDaemonThread extends Thread{  
	public void run(){  
		System.out.println("Name: "+Thread.currentThread().getName());  
		System.out.println("Daemon: "+Thread.currentThread().isDaemon());  
	}  

	public static void main(String[] args){  
		TestDaemonThread t1=new TestDaemonThread();  
		TestDaemonThread t2=new TestDaemonThread();  
		t1.start();  
		//If you want to make a user thread as Daemon, 
		//it must not be started otherwise it will throw IllegalThreadStateException.
//		t1.setDaemon(true);//will throw exception here
		t1.isDaemon();
		t2.start();  
	}  
}  