package PracticeTask0316;

public class Computers {

	String OS, brand;
	boolean mouse, keyboard;
	int screen, ram;

	public static void main(String[] args) {

		// ClassName variableName= new ClassName();
		// First computer
		Computers comp1 = new Computers();
		comp1.OS = "Windows";
		comp1.mouse = true;
		comp1.keyboard = true;
		comp1.screen = 2;
		comp1.ram = 16;
        comp1.brand= "Lenovo";
		
        comp1.watchMovie();
		
        // Second computer
		Computers comp2 = new Computers();
		comp2.OS = "MAC";
		comp2.mouse = true;
		comp2.keyboard = true;
		comp2.screen = 2;
		comp2.ram = 8;
		comp2.brand= "Apple";

	}
	void watchMovie() {
		System.out.println("We can watch movies!");
	}
	void playGames() {
		System.out.println("We can play games!");
	}
	void playMusic() {
		System.out.println("We can play music!");
	}
}
