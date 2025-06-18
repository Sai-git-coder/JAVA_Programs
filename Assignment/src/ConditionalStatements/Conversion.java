package ConditionalStatements;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		double celsius = scanner.nextFloat();
		
		double fahrenheit = 1.8*celsius +32;
		
		System.out.println(fahrenheit);
		
		scanner.close();

	}

}
