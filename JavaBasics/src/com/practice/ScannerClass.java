package com.practice;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
//Ask user fir the name and print Good morning__
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name.");

		String name = input.nextLine();
		System.out.println("Good morning " + name);
	
	}
}
