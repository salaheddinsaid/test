package com.practice;

import java.util.Scanner;

public class CareerSalary {
	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter numbers of worked years and annual
		 * salary. If user worked for more or equals to 5 years than user is eligible
		 * for the bonus, otherwise he is not. Once user is eligible and salary is
		 * larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 */
		int yearsWorked;
		int salary;
		Scanner myScan = new Scanner(System.in);
		System.out.println("please enter number of years worked.");

		yearsWorked = myScan.nextInt();

		if (yearsWorked >= 5) {
			System.out.println("User is eligable for a bonus!");
			System.out.println("Please enter salary.");
			salary = myScan.nextInt();
			if (salary >= 50000) {
				System.out.println("$5000 bonus!");
			} else {
				System.out.println("$3000 bonus!");
			}
		} else {
			System.out.println("No bonus sorry.");
		}
	}
}
