package com.java.oops;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 5, 3);
		
		//Internal loop
		System.out.println("Normal for loop");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Enhanced for loop");
		for(int item : list) {
			System.out.println(item);
		}
		
		//External loop
		System.out.println("loop using forEach");
		list.forEach(item -> System.out.println(item));
	}

}
