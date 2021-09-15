package com.java.oops;

public class Cloning {

	public static void main(String[] args) throws CloneNotSupportedException {
        Child obj = new Child();
        obj.i = 5;
        obj.j=6;
     
        Child  obj1 = (Child) obj.clone();
        obj1.j = 10;
        
        System.out.println("obj1 "+obj1); //5 10
        System.out.println("obj "+obj);   //5 6
	}
}

class Child implements Cloneable{
	int i;
	int j;
	
	@Override
	public String toString() {
		return "Children [i=" + i + ", j=" + j + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

