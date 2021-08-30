package com.java.exceptions;

public class UDException {

	public static void main(String[] args) {
      int i=10;
      
      try {
    	  if(i<11) {
        	  throw new MyException("Age is less than 11");
          }
      }catch(MyException e) {
    	  System.out.println(e);
      }
	}
}

class MyException extends Exception{
	public MyException(String msg) {
		super(msg);
	}
}
