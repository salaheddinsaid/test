package PracticeTask0316;

public class Class11 {
	public static void main(String[] args) {

		// let's create an array of names that will hold 5 elements and retrieve values

		String[] names = new String[7];

		names[0] = "Asel";
		names[1] = "Awet";
		names[2] = "Arif";
		names[3] = "Weqas";
		names[4] = "Dzmitri";
		names[5] = "Shiva";
		names[6] = "Sandesh";
		// names [5]="shiva"; will get a runtime exception when trying to access it

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		// 2. Create an array using array literal

		String[] studentNames = { "Jason", "Ruhullah", "Jerry", "Sal" };
        
		System.out.println("------For loop------");
		for (int i = 0; i <= studentNames.length - 1; i++) {
			System.out.println(studentNames[i]);
		}

		// retrieve values using: advanced for loop, for each loop, enhanced for loop
        
		System.out.println("-----Advance for loop-----");
		for (String student : studentNames) {
			System.out.println(student);
		}

	}
}
