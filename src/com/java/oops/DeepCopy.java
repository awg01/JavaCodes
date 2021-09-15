package com.java.oops;

public class DeepCopy {

	public static void main(String[] args) {
        Childs obj = new Childs();
        obj.i = 5;
        obj.j=6;
     
        Childs obj1 = new Childs();
        obj1.i= obj.i;
        obj1.j= obj.j;        
        
        obj1.j = 10;
        
        System.out.println("obj1 "+obj1); //5 10
        System.out.println("obj "+obj);   //5 6  
	}
}

class Childs{
	int i;
	int j;
	
	@Override
	public String toString() {
		return "Children [i=" + i + ", j=" + j + "]";
	}
}