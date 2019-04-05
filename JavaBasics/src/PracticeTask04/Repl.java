package PracticeTask04;

public class Repl {


		String Color, Name;
		int ModelYear;

		public static void main(String[] args){
		  
		  Repl car= new Repl();
		  
		  car.Color="Black";
		  car.ModelYear=2019;
		  car.Name="BMW";
		  
		  Repl car1=new Repl();
		  car1.Color= "White";
		  car1.ModelYear= 2018;
		  car1.Name="Toyota";
		  
		  System.out.println("Car color is "+car.Color+ " and car model year is "+car.ModelYear+" and car name is "+car.Name);

		    System.out.println("Car color is "+car1.Color+ " and car model year is "+car1.ModelYear+" and car name is "+car1.Name);

		}
		
	
}
