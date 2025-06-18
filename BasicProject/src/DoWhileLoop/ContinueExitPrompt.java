package DoWhileLoop;

import java.util.Scanner;

// Class for Continue or Exit Prompt
public class ContinueExitPrompt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        
        // Do-while loop to ask the user if they want to continue
        do {
            System.out.print("Do you want to continue? (yes/no): ");
            userInput = scanner.nextLine().toLowerCase();
            
            if (userInput.equals("yes")) {
                System.out.println("You chose to continue.");
            } else if (userInput.equals("no")) {
                System.out.println("You chose to exit.");
            } else {
                System.out.println("Invalid input, please enter 'yes' or 'no'.");
            }
        } while (!userInput.equals("no"));
        
        // Close scanner
        scanner.close();
    }
}
