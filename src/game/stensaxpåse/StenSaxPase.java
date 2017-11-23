package game.stensaxpåse;

import java.util.Random;
import java.util.Scanner;

public class StenSaxPase {

	public static void main(String[] args) {

		Scanner usersGuess = new Scanner(System.in);

		int win = 0;
		int loss = 0;
		int draw = 0;

		int numberOfGames = 10;

		for (int i = 0; i < numberOfGames; i++) {
			System.out.println("Game: " + (i + 1));

			System.out.println("Sten Sax P�se ");

			String usersPick = usersGuess.nextLine().toLowerCase();

			// System.out.println(usersPick);
			Random randomGenerator = new Random();
			int stensaxpåseValue = randomGenerator.nextInt(3);

			// System.out.println();

			if (stensaxpåseValue == 0) {
				System.out.println("Computer - Sten");
			} else if (stensaxpåseValue == 1) {
				System.out.println("Computer - P�se");
			} else {
				System.out.println("Computer - Sax");
			}
			if (stensaxpåseValue == 0 && usersPick.equals("sten") || stensaxpåseValue == 1 && usersPick.equals("p�se")
					|| stensaxpåseValue == 2 && usersPick.equals("sax")) {
				System.out.println("Draw");

			} else if (stensaxpåseValue == 0 && usersPick.equals("p�se")
					|| stensaxpåseValue == 1 && usersPick.equals("sax")
					|| stensaxpåseValue == 2 && usersPick.equals("sten")) {
				System.out.println("...");
				win++;
			} else {
				System.out.println("Patetisk...");
				loss++;
			}
			System.out.println("Wins " + win);
		}

	}

}
