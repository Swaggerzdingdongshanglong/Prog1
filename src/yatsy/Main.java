package yatsy;

import java.awt.Color;
import java.util.jar.JarException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		// private com.sun.speech.freetts.Voice voice;

		// public Voice(String name) {

		// this.name = name;

		// this.voice = VoiceManager.getInstance().getVoice(this.name);

		// this.voice.allocate();

		// }

		printBoard();

	}

	/**
	 * Print the game board
	 */
	private static void printBoard() {

		JOptionPane.showMessageDialog(null, "Blossom", "Board", -1);
		String name = JOptionPane.showInputDialog("Enter your first name:");

		String lastName = JOptionPane.showInputDialog("And your last name?:");
	    JOptionPane.showMessageDialog(null, "Nice to meet you " + name + " " + lastName);
		ImageIcon icon = new ImageIcon("C:/maestro.jpg");
		JOptionPane.showInputDialog(null, "This is you!", "This is you!", -1, icon, null, null);
		
		

	}

}
