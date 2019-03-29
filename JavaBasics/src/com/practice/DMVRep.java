package com.practice;

import java.util.Scanner;

public class DMVRep {
public static void main(String[] args) {
	int age;
	Scanner myScanner=new Scanner (System.in);
	
	System.out.println("How old you is hoe?");

	age=myScanner.nextInt();
	
	if (age>=18) {
		System.out.println("Goo head with yo old a**!");
	}else {
		System.out.println("Nah fam can't fade!");
	}
			
			
    }
}
