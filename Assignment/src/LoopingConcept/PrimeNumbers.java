package LoopingConcept;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		
		for(int i=num1+1;i <num2;i++) {
			if(isPrime(i)) {
				System.out.println(i + " ");
				
			}
		}
		
		sc.close();
	}
	
	public static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }
} 


