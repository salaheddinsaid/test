package PracticeTask0316;

public class MultiDimensionalArray {
	public static void main(String[] args) {

		// creating 2d array;

		int[][] d = new int[4][4];// 4*4= 16 elements
		d[0][0] = 12;
		d[0][1] = 13;
		d[0][2] = 14;
		d[0][3] = 15;

		d[1][0] = 1;
		d[2][1] = 2;
		d[3][2] = 3;
		d[4][3] = 4;

		d[2][0] = 5;
		d[2][1] = 10;
		d[2][2] = 15;
		d[2][3] = 20;

		d[3][0] = 100;
		d[3][1] = 200;
		d[3][2] = 300;
		d[3][3] = 400;

		System.out.println(d[1][2]);
		
	
	String [] [] c = {
			{"Mr", "Mrs", "Ms", "Miss"},
			{"Smith", "Jordan", "Jackson", "Obama"},
			
	};
	
	System.out.println(c[0] [0] );
	
	}
}