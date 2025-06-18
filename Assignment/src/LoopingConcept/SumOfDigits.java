package LoopingConcept;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int sum = 0;

        // Take absolute value to handle negative numbers as well
        n = Math.abs(n);

        while (n > 0) {
            int digit = n % 10;  // Get the last digit
            sum += digit;        // Add it to sum
            n = n / 10;          // Remove last digit
        }

        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
}
