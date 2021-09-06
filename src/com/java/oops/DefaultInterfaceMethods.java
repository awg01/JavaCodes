package com.java.oops;

interface Phone{
	void call();
	default void message() {
		System.out.println("sent");
	}
	static void phoneInfo() {
		System.out.println("phone info");
	}
}


class AndroidPhone implements Phone{
	@Override
	public void call() {
		System.out.println("calling");
	}
}

public class DefaultInterfaceMethods {

	public static void main(String[] args) {
         Phone p = new AndroidPhone();
         p.call();
         p.message();
         Phone.phoneInfo();
	}

}
