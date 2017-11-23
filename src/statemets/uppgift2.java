package statemets;

import java.util.Scanner;

public class uppgift2 {

	public static void main(String[] args) {

		Scanner userScanner = new Scanner(System.in);
		System.out.println("Enter your age: ");

		int userNumber = userScanner.nextInt();
		if (userNumber > 17) {
			System.out.println("You are eligible to vote");
		} else {
			System.out.println("Your are not eligible to vote");
		}
	}

}
