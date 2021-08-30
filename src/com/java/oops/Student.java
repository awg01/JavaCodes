package com.java.oops;

import java.util.List;

public class Student {
    private int roll;
	private String name;
	private List<String> hobbies;
	
	public Student(int roll, String name, List<String> hobbies) {
		super();
		this.roll = roll;
		this.name = name;
		this.hobbies = hobbies;
	}

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
}
