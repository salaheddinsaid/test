package PracticeTask04;

public class ReverseTaskAnswer {

	public static void main(String[] args) {
		
	AccessModifiers obj = new AccessModifiers();
	String reversed=obj.reverseString("Hello");
	System.out.println(reversed);
	
	protected String reverseString(String str) {
		
		String reversed="";
		
		for (int i = str.length() - 1; i > 0; i--) {
			
			reversed = reversed + str.charAt(i);

		}
	     return reversed;
	}

}
}