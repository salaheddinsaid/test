package PracticeTask0316;

import java.util.Scanner;

public class PracticeTask {
	public static void main(String[] args) {
		/*
		 * Write a program that reads a range of integers (start and end point), provide
		 * by a user and then from that range points the sum of the even and odd
		 * integers
		 */

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a start number");
		
		int startNumber = input.nextInt();
		
		System.out.println("Enter an end number");
		
		int endNumber = input.nextInt();
		
		int sumEven=0;
		int sumOdd=0;
		
		for (int i=startNumber; i<=endNumber; i++) {
			
			if (i%2==0) {
				
				sumEven+=i;
			}
			
			else {
				
				sumOdd+=i;
			}
		}		
			   System.out.println("The sum even of " +startNumber+ " and  " +endNumber+ " is "+sumEven);
				System.out.println("The odd even of " +startNumber+ " and  " +endNumber+ " is "+sumOdd);
			
				  int z = 0;
				     for (int y = 0; y >= z; ++y, z++) {
				         System.out.print(y + "~");
				         System.out.println(z);
				     }
	}
}