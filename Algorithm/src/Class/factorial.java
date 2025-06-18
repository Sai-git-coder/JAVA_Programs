package Class;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Step 1: Input number
		System.out.println("Enter a floating-point number:");
		double number =scanner.nextDouble();
		
		// Step 2: Extract integer part
		int integerPart = (int)number;
		
		//Step 3: Calculate Fractional part
		
		double fractionalPart = number - integerPart;
		
		//Step 4: Display results
		System.out.println("Integer Part" + integerPart);
		System.out.println("Fractional Part: "+ fractionalPart);
		
		scanner.close();
	}

}

// Pseudocode
// 1. Start
// 2. Input number
// 3. integerPart = floor(number)
// 4. fractionalPart = number - integerPart
// 5. Print integerPart
// 6.Print fractionalPart
// 7.End
