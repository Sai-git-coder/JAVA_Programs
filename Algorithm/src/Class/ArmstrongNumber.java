package Class;

//import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153; // You can change this value for other inputs
        int originalNumber = number;
        int result = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            result += Math.pow(digit, 3);
            originalNumber /= 10;
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
