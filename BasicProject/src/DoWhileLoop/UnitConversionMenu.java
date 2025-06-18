package DoWhileLoop;

import java.util.Scanner;

// Class for Menu for Unit Conversion
public class UnitConversionMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            // Display the menu
            System.out.println("\nUnit Conversion Menu:");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Kilometers to Miles");
            System.out.println("3. Exit");
            System.out.print("Please enter your choice (1/2/3): ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    // Celsius to Fahrenheit
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = (celsius * 9/5) + 32;
                    System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
                    break;
                case 2:
                    // Kilometers to Miles
                    System.out.print("Enter distance in Kilometers: ");
                    double kilometers = scanner.nextDouble();
                    double miles = kilometers * 0.621371;
                    System.out.println(kilometers + " Kilometers is " + miles + " Miles.");
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);  // Continue until user selects "Exit"
        
        // Close the scanner
        scanner.close();
    }
}
