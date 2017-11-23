package statemets;

import java.util.Scanner;

public class uppgift4 {

	public static void main(String[] args) {

		Scanner userScanner = new Scanner(System.in);

		System.out.println("Hur många höns barn fanns det: ");

		int userNumber = userScanner.nextInt();

		if (userNumber < 1) {
			System.out.println("Fanns inge hönns barn så jag köpte inte mjölk");

		}

	}

}
