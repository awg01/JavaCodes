package com.java.oops;

public class Employee {
    //blank final variable
	public final String PAN_NUMBER;
	
	public Employee(String pan) {
		PAN_NUMBER = pan;
	}
	
	public static void main(String[] args) {
       Employee e = new Employee("not123pan");
       System.out.println(e.PAN_NUMBER);
	}
}
