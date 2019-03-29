package com.practice;

public class LogicalOperator {
public static void main(String[] args) {
	
	int num=50;
	
	if (num>=1 && num<=10) {
		System.out.println("The number is small");
	}else if(num>=11 && num<=100) {
			System.out.println("Number is medium");
		}else if (num>=101 && num<=1000) {
			System.out.println("Number is large");
		}
		
	else

	{
		System.out.println("Invalid");
	}
}

}
