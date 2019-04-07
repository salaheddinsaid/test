package com.pack1;

public class Application {

	public static void main(String[] args) {

		X person1 = new X(); // Calling back on class X

		person1.coding();
		
		System.out.println(person1.eyeColour);

		X person2 = new X();

		person2.eyeColour = "Black";

		System.out.println(person2.eyeColour);
	}

}
