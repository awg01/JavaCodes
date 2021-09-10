package com.java.string;

public class StringDemo1 {
   public static void main(String[] args) {
	 String s = "abcd";
	 String s2 = s;
	 
	 s = s.concat("Hello");
	 System.out.println(s);
	 System.out.println(s2);
	 
	 String s3 = "Hello";
	 s3.concat("acd");
	 System.out.println(s3);
	 
	 String s4 = s3;
	 String s5 = "Hello";
	 
	 if( s3==s4 && s4==s5 ) {
		 System.out.println( "true" );
	 }
	 
	 String s6 = "abcd";
	 String s7 = new String("abcd");
	 
	 String s8[] = new String[5];
	 System.out.println(s8.length); //not length()
	 
	 String s9 = "big surprise";
	 System.out.println(s9.toString());
   }
}
