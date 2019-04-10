package PracticeTask04;

public class Class20 {
	
	public static void main(String[] args) {
		
//		/* Create a method createEmail().
//		 * Based on provided user name, lastName and email type,
//		 * your method should return complete email address;
//		 * johnsnow@gmail.com
//		 * johnsnow@yahoo.com
	
	}	
	Class20 obj=new Class20();
	String email=obj.createEmail("John", "Snow", "gmail");
	System.out.println(email);
		
	email=obj.createEmail("Bob", "Snow", "outlook");
     System.out.println(email);	
     
     
     //return type methodName
    String creatEmail(String name, String lastName, String emailType) {
			
   String email=name+lastName+"@"+emailType+".com";
	
	
