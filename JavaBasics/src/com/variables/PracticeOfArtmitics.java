package com.variables;

public class PracticeOfArtmitics {
public static void main (String [] args) {
	
	int a=15;
	int b=12;
	
	int sum=a+b;
	int sub=a-b;
	int multi=a*b;
	int div=a/b;
	
	System.out.println(sum);
    System.out.println(sub);
    System.out.println(multi);
    System.out.println(div);
    
    //Practice questions
    
    System.out.println("The sum of 2 numbers " +a+ " and " +b+ " is equal to " +sum+".");
    
    double c=3.9;
    double squar=c*c;
    
    System.out.println("The square of " +c+ " is " +squar+ ".");

    int d=5;
    int e=8;
    int add=d+d+e+e;
    int perm=d*e;
    
    System.out.println("The perimeter of a rectangle with width " +d+ " and height " +e+ " is equal to "+add+ " and area is "+perm+ ".");
}
}
