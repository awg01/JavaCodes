package com.java.oops;


public class EnumSwitchDemo {
	enum Color{
		RED, GREEN, BLUE;
	}

	Color c;


	public EnumSwitchDemo(Color c) {
		this.c = c;	
	}

	public void switchOnColorList() {

		switch(c) {
		case RED: 
			System.out.println("RED COLOR");
			break;
		case GREEN: 
			System.out.println("GREEN COLOR");
			break;
		case BLUE: 
			System.out.println("BLUE COLOR");
			break;
		default:
			System.out.println("NO COLOR");
			break;
		}
	}

	public static void main(String[] args) {
		EnumSwitchDemo ed = new EnumSwitchDemo(Color.valueOf("RED"));
		ed.switchOnColorList();
	}

}
