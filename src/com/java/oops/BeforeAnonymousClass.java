package com.java.oops;

class A{
	public void show() {
		System.out.println("a1");
	}
}

class B extends A{
	@Override
	public void show() {
		System.out.println("a2");
	}
}

public class BeforeAnonymousClass {

	public static void main(String[] args) {
		A a = new A();
		a.show();
		
		//extra overhead
		B b = new B();
		b.show();
	}

}
