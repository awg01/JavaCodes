package com.java.oops;

interface Abc{
	public void show();
}

class Implementor implements Abc{
	@Override
	public void show() {
		System.out.println("anything");
	}
}

public class BeforeAnonymousInterface {

	public static void main(String[] args) {
		Implementor obj = new Implementor();
		obj.show();
	}

}
