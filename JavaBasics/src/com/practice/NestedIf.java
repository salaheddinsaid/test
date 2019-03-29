package com.practice;

public class NestedIf {
	public static void main(String[] args) {

double gpa=4.0;
double expected=3.5;

boolean hasDiploma=true;

if(hasDiploma) {
	System.out.println("Congratulations!");
    if (gpa>expected) {
	System.out.println("You are hired");
    }else {
	System.out.println("Unfortynatley we cannot hire you.");}
	
}else {
	System.out.println("Please get your degree");
}


	}
}
