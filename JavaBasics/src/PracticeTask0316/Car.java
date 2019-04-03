package PracticeTask0316;

public class Car {

	String make, model, color;
	int door, wheels;
	
	public static void main(String[] args) {
		
		//ClassName variableName= new ClassName();
		//First Car
		Car car1=new Car();
		car1.make="Honda";
		car1.model="Civic";
		car1.color="Black";
		car1.door=4;
		car1.wheels=4;
		
		System.out.println("Car "+car1.make+" has "+car1.wheels+" wheels.");
		//define behavior
		car1.drive();
		car1.reverse();
		car1.stop();
		
		//Second Car
		Car car2=new Car();
		car2.make="Mitsubishi";
		car2.model="Evo";
		car2.color="Yellow";
		car2.door=4;
		car2.wheels=4;
		
		System.out.println("My car is a "+car2.color+ " "+car2.model);
		car2.drive();
		car2.reverse();
		car2.stop();
	}
    void drive() {
    	System.out.println("Car can drive");
    }
    void reverse() {
    	System.out.println("Car can reverse");
    }
    void stop() {
    	System.out.println("Car can brake");
    }
}
