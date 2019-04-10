package PracticeTask04;

public class GradesCorrect {
public static void main(String[] args) {
	
	
	GradesCorrect obj = new GradesCorrect();
	obj.getGrade(91);
	System.out.println("My grade at Syntax is " +getGrade);
}
   char getGrade(int score) {
	char grade;
	if (score > 90) {
		grade = 'A';
	}else if (score > 80) {
		grade = 'B';
	}else if (score > 70) {
		grade = 'C';
	}else if (score > 60) {
		grade = 'D';
	}else {
		grade = 'F';
	}
     return grade;
   }
}
