package WhileLoop;

import java.util.Scanner;

// Class for Sum Until Negative
public class SumUntilNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;
        
        // Keep asking for positive numbers until a negative number is entered
        while (true) {
            System.out.print("Enter a positive number (or a negative number to stop): ");
            number = scanner.nextInt();
            
            if (number < 0) {
                break;  // Exit the loop if a negative number is entered
            }
            
            sum += number;  // Add the number to the sum
        }
        
        // Display the total sum
        System.out.println("Total sum of all positive numbers entered: " + sum);
        
        // Close the scanner
        scanner.close();
    }
}
