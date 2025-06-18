package ConditionalStatements;

import java.util.Scanner;

	public class AgeCheck {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			int Input1 = scanner.nextInt();
			int Input2 = scanner.nextInt();
			int Input3 = scanner.nextInt();
			
			if(Input1 < 13) {
				System.out.println("Child");
			}
			if(Input2 > 13 && Input2 < 19) {
				System.out.println("Teen");
			}
			if(Input3 >= 20) {
				System.out.println("Adult");
			}
			scanner.close();
		}

	}