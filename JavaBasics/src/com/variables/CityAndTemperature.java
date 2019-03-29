package com.variables;

import java.util.Scanner;

public class CityAndTemperature {
public static void main(String[] args) {
     String cityName;
     int temp;

	Scanner myScanner=new Scanner(System.in);
	System.out.println("Please enter your city");
	
	cityName=myScanner.nextLine();
	
	System.out.println("Please enter temperature in Farenheit");
	
	temp=myScanner.nextInt();
	//Formula F to C (f-32)*5/9
	
	int convertedtemp=(temp-32)*5/9;
	 System.out.println("the temperature in the city "+cityName+ " is " +convertedtemp+ " degrees Celcius");
     
}
}
