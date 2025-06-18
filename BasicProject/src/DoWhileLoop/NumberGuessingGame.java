package DoWhileLoop;

import java.util.Scanner;

// Class for Number Guessing Game
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 7; // The secret number
        int guessedNumber;
        
        // Do-while loop to keep asking until the correct number is guessed
        do {
            System.out.print("Guess the secret number: ");
            guessedNumber = scanner.nextInt();
            
            if (guessedNumber != secretNumber) {
                System.out.println("Incorrect guess, try again!");
            }
        } while (guessedNumber != secretNumber);
        
        // Display success message when guessed correctly
        System.out.println("Congratulations! You guessed the correct number.");
        
        // Close scanner
        scanner.close();
    }
}
