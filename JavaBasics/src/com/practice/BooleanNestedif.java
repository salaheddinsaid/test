package com.practice;

public class BooleanNestedif {
public static void main(String [] args) {
	
	boolean creditCard=false;
	int balance = 900;
	
	if(creditCard) {
		System.out.println("Let's chceck your balance");
	if(balance>1000) {
		System.out.println("You must pay off you credit card");
	}else {
	System.out.println("You are good");	
    }
	}else {
		System.out.println("You good fam");
	}
	
	
	
	
	
}
}
