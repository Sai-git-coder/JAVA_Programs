package Class;
import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input size of array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        // Step 2: Input array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Step 3: Find maximum number
        int max = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Step 4: Output maximum number
        System.out.println("Maximum number in the array is: " + max);
        
        scanner.close();
    }
}


// Pseudocode
// 1. Start
// 2. Input size of array
// 3. Input array elements
// 4. Set max = first element of array
// 5. For each element in the array
// 6. If element > max
// 7. Set max = element
// 8. End For
// 9. Print max
// 10.End

