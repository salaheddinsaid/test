package com.practice;

import java.util.Scanner;

public class DetermineLoanAmount {
public static void main(String[] args) {
	int loan;
	
	Scanner myScanner=new Scanner(System.in);
	
	System.out.println("Please enter loan amount");
	
	loan=myScanner.nextInt();
	
	if (loan>200000) {
		System.out.println("Reject");
	}else {
		System.out.println("Approve");
	}
	
}
}
