package PracticeTask0316;

public class ArrayPractice {
public static void main(String[] args) {
	
	//Create an array of cars and store 6 elements into it. Using
	String[] cars = new String[7];
	
	cars [1] = "R34";
	cars [2] = "Supra";
	cars [3] = "EVO";
	cars [4] = "STI";
	cars [5] = "350z";
	cars [6] = "Si";
	
	
	for (int i=0; i<cars.length; i++) {
		System.out.println(cars[i]);
	}
	
	for (String mycars : cars) {
		System.out.println(mycars);
	}


    /*Create an array of countries
     * while retrieveing all values from an array print capital for each country.
     */

     String [] array = {"USA", "Russia", "turkey", "Spain"};
     
     for (int i =0; i<array.length; i++) {
    	 
    	 if(array [i].equals("USA")) {
    		 System.out.println("Washington DC");
    	 }else if (array[i].equals("Russia")) {
    		 System.out.println("Moscow");
    	 }else if (array [i].equals("Turkey")) {
    		 System.out.println("Ankara");
    	 }else if (array [i].equals ("Spain")) {
    		 System.out.println("Madrid");
    	 }
     }
     
     String [] countries = {"USA", "Afghanistan", "Kazakhstan"}
     
     switch (sountries)






}
}
