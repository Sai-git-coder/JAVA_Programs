package ConditionalStatements;

import java.util.Scanner;

public class LeapYearCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int year = scanner.nextInt();
		
		if(year % 4 == 0) {
			
			if(year % 100 == 0) {
				
				if(year % 400 == 0) {
				System.out.println("Leap Year");
			}
			else {
				System.out.println("Not a Leap Year");
			}
			}
		
		else {
			System.out.println("Not a Leap Year");
		}
		}
		else {
			System.out.println("Not a Leap Year");
		}
	scanner.close();
		
		}
	}
	
