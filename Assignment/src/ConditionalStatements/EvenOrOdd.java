package ConditionalStatements;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int Input = scanner.nextInt();
	
		if(Input%2 == 0) {
			System.out.println("It is a Even Number");
			Input = Input+1;
		}
		else {
			System.out.println("It is an Odd number");
		}
		
		scanner.close();
	}

}
