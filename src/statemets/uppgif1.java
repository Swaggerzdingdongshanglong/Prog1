package statemets;

import java.util.Scanner;

public class uppgif1 {

	public static void main(String[] args) {

		// Anv�nds f�r att skanna det anv�ndaren skriver. G�r s� att anv�ndaren kan
		// skriva.
		Scanner userScanner = new Scanner(System.in);
		// skrivs ut n�r du k�r programmet.
		System.out.println("Skriv in ett nummer: ");
		// tar input fr�n anv�ndaren(heltal)
		int userNumber = userScanner.nextInt();
		// kollar om user number �r st�rre �n 8 och mindre �n 10, eller st�rre �n 33.
		if (userNumber > 8 && userNumber < 10 || userNumber > 33) {
			//skriver ut good om du vinner.
			System.out.println("Good");
		} else {
			//skriver ut bad on du f�rlorar.
			System.out.println("Bad");
		}

	}

}
