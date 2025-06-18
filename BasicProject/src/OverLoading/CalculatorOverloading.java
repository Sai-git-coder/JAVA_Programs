package OverLoading;

import java.util.Scanner;

//Calculator class with method overloading
class Calculator {

 // Method to add two integers
 public int add(int a, int b) {
     return a + b;
 }

 // Method to add two decimal numbers (doubles)
 public double add(double a, double b) {
     return a + b;
 }

 // Method to add three integers
 public int add(int a, int b, int c) {
     return a + b + c;
 }
}

//Main class
public class CalculatorOverloading {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Calculator calc = new Calculator();

     // Test the add() method for two integers
     System.out.print("Enter first integer: ");
     int num1 = scanner.nextInt();
     System.out.print("Enter second integer: ");
     int num2 = scanner.nextInt();
     System.out.println("Sum of two integers: " + calc.add(num1, num2));

     // Test the add() method for two decimal numbers
     System.out.print("Enter first decimal number: ");
     double num3 = scanner.nextDouble();
     System.out.print("Enter second decimal number: ");
     double num4 = scanner.nextDouble();
     System.out.println("Sum of two decimals: " + calc.add(num3, num4));

     // Test the add() method for three integers
     System.out.print("Enter third integer: ");
     int num5 = scanner.nextInt();
     System.out.println("Sum of three integers: " + calc.add(num1, num2, num5));

     scanner.close();
 }
}

