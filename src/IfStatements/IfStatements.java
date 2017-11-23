package IfStatements;

import java.util.Random;

public class IfStatements {

	public static void main(String[] args) {

		Random randomGenerator = new Random();
		
		int computer = 0;
		int user = 0;
		int user2 = 0;
		
		for (int i = 0; i < 200; i++) {
		int userPick = randomGenerator.nextInt(13);
		int userPick2 =randomGenerator.nextInt(13);
		int computerPick = randomGenerator.nextInt(13);

		System.out.println("User 1 = " + userPick);
		System.out.println("User 2 = " + userPick);
		System.out.println("Computer = " + computerPick);
		
		if (userPick == computerPick && userPick2 == computerPick) {
			System.out.println("Draw");
		} else if (userPick > computerPick && userPick > userPick2) {
			System.out.println("User win");
		} else if (userPick > computerPick && userPick2 > userPick) {
			System.out.println("User2 win");
			user2++;
		} else if (computerPick > userPick && computerPick > userPick2) {
		    System.out.println("Computer win");
		    computer = computer + 2;
		} else if ( computerPick == userPick && computerPick > userPick2) {
	         computer++;
	         userPick++;
	    } else if ( computerPick == userPick2 && computerPick > userPick) {
			computer++;
			userPick2++;
	    } else if( userPick == userPick2 && computerPick < userPick) {
			userPick++;
			userPick2++;
	    } else {
	    	System.out.println("Whird");
	    }
 }
		System.out.println();
		if (computer > user && computer >user2)
			System.out.println("Computer = " + computer);
		if(user > user2) {
			System.out.println("User2 = " + user);
			System.out.println("User2 = " + user2);
		} else { 
			System.out.println("User1 = " + user);
		
		}
	
		System.out.println("Computer " + computer);
		System.out.println("User = " + user);
		System.out.println("User2 = " + user2);
		
	}
}
