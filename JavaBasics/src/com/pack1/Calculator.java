package com.pack1;

public class Calculator {
	
	static int minValue(int x, int y, int z) {
		
		int min = Integer.MAX_VALUE;
		
		for (int y: x) {
			if (y<min) {
				min=y;
				
			}
		}
	return min;
	}

	
static int maxValue(int [] x) {
		
		int max = Integer.MIN_VALUE;
		
		for (int j: x) {
			if (j>max) {
				max=j;
				
			}
		}
	return max;


}

static int averageValue(int x, int y, int z) {
	
return (x+y+z)/3;
}
}
