package ConditionalStatements;

import java.util.Scanner;

public class BankLoanIntrestCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float principal = scanner.nextFloat();
		float rate =scanner.nextFloat();
		float time = scanner.nextFloat();
		
		float simpleIntrest = (principal* rate*time)/100;
		
		System.out.println(simpleIntrest);
		
		scanner.close();
				

	}

}
