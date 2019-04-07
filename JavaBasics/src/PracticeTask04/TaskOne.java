package PracticeTask04;

public class TaskOne {

	public static void main(String[] args) {

		TaskOne obj = new TaskOne();

		obj.LargestNumber(2342, 21432);
		obj.LargestNumber1(a, b);

	}

	void LargestNumber(int a, int b) {

		if (a > b) {
			System.out.println("A is larger than B");
		} else {
			System.out.println("B is larger than A");
		}
	}

	void LargestNumber1(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
}
