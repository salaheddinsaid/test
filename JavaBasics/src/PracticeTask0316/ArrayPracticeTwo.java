package PracticeTask0316;

public class ArrayPracticeTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String[][] cars = { { "American:", "Comaro", "Mustang", "Corvette" }, { "Ferrari:", "458" },
				{ "German:", "M2", "M3", "M4" } };

		for (int i = 0; i < cars.length; i++) {

			for (int j = 0; j < cars[i].length; j++) {
				System.out.print(cars[i][j] + " ");
			}
			System.out.println();
		}
	
	
	
	}

}
