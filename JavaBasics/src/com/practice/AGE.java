package com.practice;

import java.util.Scanner;

public class AGE {
public static void main(String[] args) {
	
	Scanner myScan;
	int age;
	
	myScan = new Scanner(System.in);
	System.out.println("Please enter your age");
	age=myScan.nextInt();
	
	if(age>1 && age<3) {
		System.out.println("You are a baby");
	}else if(age>=3 && age<5) {
		System.out.println("You are toddler");
	}else if(age>=5 && age<13) {
		System.out.println("You are a kid");
	}
}
}
