package PracticeTask0316;

public class PhoneTask {
	
	String brand, color;
	double screen; 
	boolean camera;
	
	public static void main(String[] args) {
		
		
		PhoneTask phone1= new PhoneTask();
		phone1.brand="Apple";
		phone1.color="Grey";
		phone1.screen=6.3;
		phone1.camera=true;
		
		System.out.println("The iPhone is an "+phone1.brand+ " phone with a "+phone1.screen+ "in screen");
		
		PhoneTask phone2= new PhoneTask();
		phone2.brand= "Samsung";
		phone2.color="Black";
		phone2.screen=6.5;
		phone2.camera=true;
		
		System.out.println("The Galaxy S10+ is a " +phone2.brand+ " with a " +phone2.camera + " 180 degree camera.");
		
		PhoneTask phone3= new PhoneTask();
		phone3.brand= "Nokia";
		phone3.color="Black";
		phone3.screen=3.5;
		phone3.camera=false;
	 
	}

}
