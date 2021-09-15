package com.java.oops;

public class ShallowCopy {

	public static void main(String[] args) {
        Children obj = new Children();
        obj.i = 5;
        obj.j=6;
     
        Children obj1 = obj;
        obj1.j=8;
        
        System.out.println("obj1 "+obj1); //5 8
        System.out.println("obj "+obj);   //5 8 shallow copy
	}
}

class Children{
	int i;
	int j;
	
	@Override
	public String toString() {
		return "Children [i=" + i + ", j=" + j + "]";
	}
}

