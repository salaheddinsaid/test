package PracticeTask0316;

public class PrimeNumber {
	public static void main(String[] args) {

		// Write a java program to check whether a given number is prime or not?
		// 7. Write a java program to check whether a given number is prime or not?
		// boolean isPrime = true;
		
		int number = 0;
        Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your number");
		number = scan.nextInt();

		for (int i = 2; i <= number / 2; i++) {
			if (number % i != 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {

			System.out.println("Your number is a prime number");

		} else {

			System.out.println("Your number is not a prime number");
		}
		scan.close();
	}
}
