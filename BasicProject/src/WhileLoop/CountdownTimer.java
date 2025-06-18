package WhileLoop;

import java.util.Scanner;

// Class for Countdown Timer
public class CountdownTimer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the starting number
        System.out.print("Enter a number to start the countdown: ");
        int number = scanner.nextInt();
        
        // Use a while loop to countdown to 0
        while (number >= 0) {
            System.out.print(number + " ");
            number--;  // Decrease the number by 1
        }
        
        System.out.println();  // Move to the next line after countdown
        
        // Close the scanner
        scanner.close();
    }
}
