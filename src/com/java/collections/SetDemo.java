package com.java.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo {

	//generic method
	public static <T> void showWorking(Set<T> obj) {
		
		obj.add((T) "mi");
		obj.add((T)"srh");
		obj.add((T)"rcb");
		obj.add((T)"csk");
		obj.add((T)"kkr");
		
		System.out.println(obj.toString());
	}
	
	public static void main(String[] args) {
		//order of elements is not preserved
		//it uses hashtable
		Set<String> hashSet = new HashSet<>();	
		hashSet.add(null);
		showWorking(hashSet);
		
		//order of elements is preserved
		//it uses hashtable and linked list to preserve order
		Set<String> lHashSet = new LinkedHashSet<>();	
		lHashSet.add(null);
		showWorking(lHashSet);
		
		//it uses binary search tree
		//sorting is provided
		Set<String> treeSet = new TreeSet<>();
		//does not allow null values
		//		treeSet.add(null);
		showWorking(treeSet);
		
		SortedSet<String> sortedSet = new TreeSet<>();
        //does not allow null values   
		//		sortedSet.add(null); 
		showWorking(sortedSet);
	}

}
