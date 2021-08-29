package com.java.oops;

class C{
	public void show() {
		System.out.println("a1");
	}
}

public class AfterAnonymousClass {

	public static void main(String[] args) {
	  C obj = new C() {
		  public void show() {
				System.out.println("a2");
			}	  
	  };
	  obj.show();	
	}
}
