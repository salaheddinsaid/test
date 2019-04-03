package PracticeTask0316;

public class ReverseString {
public static void main(String[] args) {
	
	//Write a java program to reverse string?
	//Reverse a string word by word?
	
	String sentence = "The master is speaking";
	String reverse="";
	for (int i=sentence.length()-1;i>=0; i--) {
		reverse= reverse+sentence.charAt(i);
	}
    
	String [] words=reverse.split(" ");
	for (int i=words.length-1; i>=0; i--) {
		System.out.print(words[i]+ " ");
	}
}
}
