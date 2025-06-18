package WhileLoop;

import java.util.Scanner;

// Class for Password Login System
public class PasswordLoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "java123";
        String enteredPassword;
        
        // Keep asking for the correct password until the user enters the correct one
        while (true) {
            System.out.print("Enter password: ");
            enteredPassword = scanner.nextLine();
            
            // Check if the entered password matches the correct password
            if (enteredPassword.equals(correctPassword)) {
                System.out.println("Login Successful");
                break;  // Exit the loop once the correct password is entered
            } else {
                System.out.println("Incorrect password, try again.");
            }
        }
        
        // Close scanner
        scanner.close();
    }
}
