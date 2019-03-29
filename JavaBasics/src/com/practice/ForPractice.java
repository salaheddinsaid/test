package com.practice;

public class ForPractice {

	public static void main(String[] args) {
		
		int sum= 0;
				
		for (int i=1; i <=100; i++) {
			if(sum % 2 == 0) {
			 sum = sum+i;	
			}
		}
		
		System.out.println(sum);
		
		
	// I want to print number from 1 to 20 but skip those that are divisble by 3
		
		for (int a = 1; a <= 20; a++) {
			
			if(a%3==0) {
				continue;
			}
		System.out.println(a);
		}
		
	
	
	}
}
