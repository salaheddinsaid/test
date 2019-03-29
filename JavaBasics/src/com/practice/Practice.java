package com.practice;

public class Practice {
	public static void main(String[] args) {

		int x = 10;
		int y = 20;

		String a = "Hello";
		String b = "Bye";

		System.out.println(a + b + (x + y));

		//declare price and if price is higher than expected price --> I will not buy
		
		double shoePrice= 25.99;
		double allowedPrice= 34;
		
		if (shoePrice<=allowedPrice) {
			System.out.println("I will buy the shoes");
				
			} else {
				System.out.println("I will not buy the shoes");
			}
	
	}

}
