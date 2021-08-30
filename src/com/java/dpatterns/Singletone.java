/*
 * https://agiletribe.wordpress.com/2013/10/08/dont-abuse-singleton-pattern/
 */

package com.java.dpatterns;

public class Singletone {

	public static void main(String[] args) {
		SingletonDemo s = SingletonDemo.getInstance();
		SingletonDemo s2 = SingletonDemo.getInstance();
		s.show();
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		
		Abcdef s1 = new Abcdef();
		Abcdef s22 = new Abcdef();
		
		System.out.println(s1.hashCode());
		System.out.println(s22.hashCode());
	}

}

class Abcdef{
	
}

class SingletonDemo{
	private SingletonDemo() {
	}
	
	public static SingletonDemo instance = null;
	
	public static void show() {
		System.out.println("Show called");
	}
	
	public static SingletonDemo getInstance() {
		if(instance == null) {
			instance = new SingletonDemo();
		}
		
		return instance;
	}
}