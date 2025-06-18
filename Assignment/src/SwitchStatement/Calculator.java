package SwitchStatement;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float num1 = scanner.nextFloat();
		float num2 = scanner.nextFloat();
		char operator = scanner.next().charAt(0);
		float result;
		
		switch(operator) {
		case '+':
			result = num1 + num2;
			System.out.println(result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println(result);
			break;
		case '/':
			result = num1 / num2;
			System.out.println(result);
			break;
		default:
			System.out.println("Invalid operator");	
		}
		
		scanner.close();
	}

}
