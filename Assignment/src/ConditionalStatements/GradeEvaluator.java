package ConditionalStatements;

import java.util.Scanner;

public class GradeEvaluator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int Input = scanner.nextInt();
	
		if(Input > 40) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		scanner.close();
	}

}

