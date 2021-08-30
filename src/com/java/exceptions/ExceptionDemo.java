package com.java.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo {
    public static void main(String[] args) throws IOException{
		BufferedReader br = null;
		
		try {
			int i=0;
			br = new BufferedReader(new InputStreamReader(System.in));
			i = Integer.parseInt(br.readLine());
			System.out.println(i/2);
		}catch(Exception e) {
			System.out.println("IO Exception occured");
		}
		finally {
			br.close();
		}
	}
}
