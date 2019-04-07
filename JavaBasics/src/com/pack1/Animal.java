package com.pack1;

public class Animal {

//	String breed;
//	static String name;
//	int weight, age;
//	
	
	String breed = "Husky";
	static String name = "Trick";
	int weight = 100;
	int age= 10;
	
	
	void canBark() {
		System.out.println(breed+ " can bark");
	}
	void isWild() {
		System.out.println(breed+ " is wild");
	}
	
	boolean canBark2() {
		return true;
	}
	boolean isWild2() {
		return false;
		
	}
}
