package PracticeTask0316;

public class ReplPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//69
//		Validate if the string ends with "u" prints the Boolean value accordingly
//		Validate if the string ends with "world" prints the Boolean value accordingly
//		Validate if the string ends with "are" prints the Boolean value accordingly
//		Validate if the string ends with "you" prints the Boolean value accordingly
	
		String s1="hello how are you"; 
		
		boolean endsWith= s1.endsWith("u");
		System.out.println(endsWith);
	
		
		//70
		

//(the output should be one per line)
//Print out the position of the first occurrence of "c"
//Print out the position of the first occurrence of " "
//Print out the position of the first occurrence of the variable target1
//Print out the position of the first occurrence of the variable target2
		
		  String str = "abracadabra alakazam";
		    String target1 = "dab";
		    String target2 = "ABRA";
		    
		    System.out.println(str.indexOf('c'));
		    System.out.println(str.indexOf(' '));
		    System.out.println(str.indexOf(target1));
		    System.out.println(str.indexOf(target2));
	
		    Scanner sc = new Scanner(System.in); 
		    System.out.println("Enter any programming language");
		     String language = sc.nextLine(); 
		    
		    if (language.equals ("Java")){
		      System.out.println(language+ " is a programming language");
		    }else if (language.equals ("C")){
		      System.out.println(language+ " is a programming language");
		    }else if (language.equals ("C")){
		      System.out.println(language+ " is a programming language");
		  }else{
		    System.out.println("Doesn't match any programming language");
		  }
	
	}

}
