package ForLoop;

import java.util.Scanner;

//Class for Multiplication Table
public class MultiplicationTable {
 public static void main(String[] args) {
     // Scanner to read user input
     Scanner scanner = new Scanner(System.in);

     // Ask the user for the number
     System.out.print("Enter a number for multiplication table: ");
     int number = scanner.nextInt();

     // Loop to display the multiplication table
     System.out.println("Multiplication Table of " + number + ":");
     for (int i = 1; i <= 10; i++) {
         System.out.println(number + " x " + i + " = " + (number * i));
     }

     // Close the scanner
     scanner.close();
 }
}
