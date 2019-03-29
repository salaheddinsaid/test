package com.practice;

import java.util.Scanner;

public class MortgageRates {
	public static void main(String[] args) {
		// Create a Java program and store variables to store mortgage rate and mortgage
		// price.
		// First program should check if rate is higher than 4.5 user will not buy a
		// house, otherwise user will consider buying.
		// Once user decides to buy a house, if price of the house is larger than 200000
		// than user will take a loan, otherwise user will pay cash
	double mortRate=3.0;
	int mortPrice=199999;
	
	if(mortRate>=4.5) {
		System.out.println("User will not buy a house.");
	}else {
		System.out.println("User will buy the house.");
	if (mortPrice>=200000) {
		System.out.println("User will take a loan.");
	}else {
		System.out.println("User will buy cash.");
	}
	}
	}
}
