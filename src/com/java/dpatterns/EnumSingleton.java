package com.java.dpatterns;

public class EnumSingleton {

	public static void main(String[] args) {
         Abc obj =  Abc.INSTANCE23;
         obj.i = 10;
         obj.show();
         
         Abc obj2 = Abc.INSTANCE23;
         obj2.i = 20;
         
         obj.show();
	}
}

enum Abc{
	INSTANCE23;
	int i;
	public void show() {
		System.out.println(i);
	}
}
