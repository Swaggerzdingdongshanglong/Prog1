package statemets;

import java.util.Scanner;

public class uppgift3 {

	public static void main(String[] args) {

		Scanner userScanner = new Scanner(System.in);

		System.out.println("Even or uneven: ");
		int number = userScanner.nextInt();
		
		if (number % 2 == 1) {
			System.out.println("Uneven");
		} else {
			System.out.println("Even");
			
		}
		
		
	}

}
