package ConditionalStatements;

import java.util.Scanner;

public class HighestScore {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		
		int highest = n2;
		
		if(n1 > highest) {
			highest =n1;
		}
		if(n3 > highest) {
			highest = n3;
		}
		System.out.println(highest);
		
		scanner.close();
	}

}
