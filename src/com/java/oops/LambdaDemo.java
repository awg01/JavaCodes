package com.java.oops;

interface IA{
	void show();
}

//class CA implements IA{
//	@Override
//	public void show() {
//		System.out.println("Show");
//	}
//}

public class LambdaDemo {

	public static void main(String[] args) {
//		1
//		IA obj = new CA();
//		obj.show();
		
//		2 anonymous inner class
//		IA obj = new IA() {
//			@Override
//			public void show() {
//				System.out.println("Show");
//			}
//		};
//		obj.show();
		
//		3 lambda expression
		IA obj = () -> System.out.println("Show");
		obj.show();
	}

}
