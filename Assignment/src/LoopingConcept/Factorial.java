package LoopingConcept;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		int num = Scanner.nextInt();
		long factorial = 1;
		
		for(int i=1;i<=num;i++) {
			factorial *=i;
		}
		
		System.out.println(factorial);
		
		Scanner.close();

	}

}
