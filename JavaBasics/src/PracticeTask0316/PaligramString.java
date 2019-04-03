package PracticeTask0316;

public class PaligramString {
public static void main(String[] args) {
	
	// Write a java program to find whether a String is palindrome or not?
	//(mom,dad,madam)

    Scanner scan=new Scanner (System.in);
    System.out.println("Please enter any word to check if its a palidrome!");
    String word= scan.nextLinde();
    
    String reverse="";
    
    for (int i=word.length()-1; i>=0; i--) {
    	reverse+=word.charAt(i);
    }
    
    if (word.equalsIgnoreCase(reverse)) {
    	System.out.println("the word is a palidrome");
    }else {
    	System.out.println("The word is not a palidrome");
    }
}
}
