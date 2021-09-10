package com.java.string;

public class StringBuilderDemo {
	public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("abcd");
       System.out.println(sb.capacity());
       System.out.println(sb.append(123));
       System.out.println(sb.length());
       System.out.println( sb.insert(8, "hello")); //exception
	}
}
