package LoopingConcept;

import java.util.Scanner;

public class UniqueDivisors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();//n is Student ID
		int count = 0;
		
		for(int i=1;i<=n;i++) {//i is the divisor
			if(n % i == 0) {
				count++;
			}
		}
		
		System.out.println(count);
		
		scanner.close();

	}

}
