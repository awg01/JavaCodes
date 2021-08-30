package com.java.oops;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableStudent {
    private final int roll;
	private final String name;
	private final List<String> hobbies;
	
	public ImmutableStudent(int roll, String name, List<String> hobbies) {
		this.roll = roll;
		this.name = name;
		List<String> newHobbies = new ArrayList();
		for(String h : hobbies) {
			newHobbies.add(h);
		}
		
		this.hobbies = newHobbies;
	}

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public List<String> getHobbies() {
		List<String> newHobbies = new ArrayList();

		for(String h : hobbies) {
			newHobbies.add(h);
		}
		
		
		return newHobbies;
	}
}
