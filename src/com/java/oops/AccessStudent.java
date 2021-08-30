package com.java.oops;

import java.util.ArrayList;
import java.util.List;

public class AccessStudent {

	public static void main(String[] args) {
		List<String> hobbyList = new ArrayList();
		hobbyList.add("Swimming");
		
        Student s = new Student(1, "Akash", hobbyList);
        
        //modifying list object reference
        hobbyList.add("Writing");
        
        System.out.println("Before modifying "+s.getHobbies().toString());
        
        List<String> newHobbies = new ArrayList();
        newHobbies.add("Coding");
        newHobbies.add("Reading");
        
        //modifying using setter
        s.setHobbies(newHobbies);
        System.out.println("After modifying "+s.getHobbies().toString());
        
        //modiying using getter
        List<String> newHobbies2 = s.getHobbies();
        newHobbies2.add("Cricket");
        
        System.out.println("Hobbies after getter "+s.getHobbies().toString());
        
        List<String> hobbies = new ArrayList();
        hobbies.add("hobby1");
        hobbies.add("hobby2");
        ImmutableStudent is = new ImmutableStudent(2, "student2", hobbies);
        System.out.println(is.getHobbies().toString());
	}

}
