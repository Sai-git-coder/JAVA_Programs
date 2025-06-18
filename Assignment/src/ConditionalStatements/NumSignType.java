package ConditionalStatements;

import java.util.Scanner;

public class NumSignType {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    
		int number = scanner.nextInt();
		
		if(number > 0) {
			if(number % 2 ==0) {
				System.out.println("Positive Even");
			}
			else {
				System.out.println("Positive Odd");
			}
		}
		if(number < 0) {
			if(number % 2 ==0) {
				System.out.println("Negative Even");
			}
			else {
				System.out.println("Negative Odd");
			}
		}
		
		scanner.close();
	}

}
