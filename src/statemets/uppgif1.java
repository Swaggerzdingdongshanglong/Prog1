package statemets;

import java.util.Scanner;

public class uppgif1 {

	public static void main(String[] args) {

		// Används för att skanna det användaren skriver. Gör så att användaren kan
		// skriva.
		Scanner userScanner = new Scanner(System.in);
		// skrivs ut när du kör programmet.
		System.out.println("Skriv in ett nummer: ");
		// tar input från användaren(heltal)
		int userNumber = userScanner.nextInt();
		// kollar om user number är större än 8 och mindre än 10, eller större än 33.
		if (userNumber > 8 && userNumber < 10 || userNumber > 33) {
			//skriver ut good om du vinner.
			System.out.println("Good");
		} else {
			//skriver ut bad on du förlorar.
			System.out.println("Bad");
		}

	}

}
