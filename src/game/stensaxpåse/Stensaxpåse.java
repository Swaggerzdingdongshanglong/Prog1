package game.stensaxpåse;

import java.util.Random;
import java.util.Scanner;

public class Stensaxpåse {

	public static void main(String[] args) {

		Scanner usersGuess = new Scanner(System.in);

		System.out.println("Sten Sax Påse ");

		String usersPick = usersGuess.nextLine().toLowerCase();

		// System.out.println(usersPick);
		Random randomGenerator = new Random();
		int coinFlipValue = randomGenerator.nextInt();

		// System.out.println();

		if (coinFlipValue == true) {
			System.out.println("Computer - Sten");
		} else {
			System.out.println("Computer - Sax");
		}

		if (coinFlipValue == true && usersPick.equals("sten") || coinFlipValue == false && usersPick.equals("Sax")) {

			System.out.println("Fuck");

		} else {
			System.out.println("ok...");
		}

	}

}
