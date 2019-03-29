package com.practice;

public class NestedLoop {
	public static void main(String[] args) {

		//outer loop takes control of outer loop
		
		
		for (int i = 0; i < 3; i++) {
			System.out.println("------I am outer loop------" +i);

			for (int y = 0; y < 3; y++) {
				System.out.println("I am outer loop" +y);
			}
		}

	}
}
