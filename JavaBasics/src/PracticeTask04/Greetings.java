package PracticeTask04;

public class Greetings {

	public static void main(String[] arg) {

		Greetings obj = new Greetings();
		obj.hello();
		// how to find largest number
		obj.findLargest();
		obj.findLargest2(120, 90);
		obj.helloToInstructor();
		obj.helloToInstructor2("Sal");
	}

	void hello() {//method signature
		System.out.println("Hello");//method body
	}

	void helloToInstructor() {
		System.out.println("Hello Asel");
	}

	void helloToInstructor2(String name) {
		System.out.println("Hello "+name);
	}
	void findLargest() {//method with 2 parameters
		int a = 10;
		int b = 20;

		if (a > b) {
			System.out.println("A is lrger than B");
		} else {
			System.out.println("B is larger than A");
		}
	}

	void findLargest2(int a, int b) {

		if (a > b) {
			System.out.println("A is lrger than B");
		} else {
			System.out.println("B is larger than A");
		}
	}
}
