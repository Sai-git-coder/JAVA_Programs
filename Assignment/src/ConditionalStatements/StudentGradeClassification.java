package ConditionalStatements;

import java.util.Scanner;

public class StudentGradeClassification {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int StudentScore = scanner.nextInt();
		
		if(StudentScore > 90) {
			System.out.println("Excellent");
		}
		if(StudentScore > 70 && StudentScore < 89) {
			if(StudentScore >= 80) {
				System.out.println("Very Good");
			}
			else {
				System.out.println("Good");
			}
		}
		if(StudentScore < 70) {
			System.out.println("Needs Improvement");
		}
		
		scanner.close();
	}

}
