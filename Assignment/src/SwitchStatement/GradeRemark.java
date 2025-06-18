package SwitchStatement;

import java.util.Scanner;

public class GradeRemark {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		char grade = scanner.next().toUpperCase().charAt(0);
		
		switch(grade) {
		
		case 'A':
			System.out.println("Exellent");
			break;
		case 'B':
			System.out.println("Very Good");
			break;
		case 'C':
			System.out.println("Good");
			break;
		case 'D':
			System.out.println("Needs ImprovementF");
			break;
		case 'F':
			System.out.println("Fail");
			break;
		default:
			System.out.println("Invalid grade");
		}
		scanner.close();
	}

}
