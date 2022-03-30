package com.java.oops;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationDemo{

	public static void serialize(Object obj, String filePath) {
		
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.flush();
			oos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static Object deSerialize(String filePath) {
        Object obj =null;
		try {
			FileInputStream fis = new FileInputStream(filePath);
			ObjectInputStream ois = new ObjectInputStream(fis);
			obj = (Student)ois.readObject();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
	public static void main(String[] args) {
		List<String> hobbyList = new ArrayList();
		hobbyList.add("speaking");
		hobbyList.add("walking");
		Student s = new Student(1, "akash", hobbyList); 
        serialize(s, "student.txt"); 
        
        Student student2 = (Student) deSerialize("student.txt");
        System.out.println("roll "+student2.getRoll());
        System.out.println("name "+student2.getName());
	}

}
