package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String awnser = JOptionPane
				.showInputDialog("do you know how to program");
		// 2. If they say "yes", tell them they will rule the world.
		if (awnser.equals("yes")) {
			JOptionPane.showMessageDialog(null, "you will rule the world");
			// 3. Otherwise, wish them good luck washing dishes.

		} else
			JOptionPane.showMessageDialog(null,
					"you will DIE");
	}
}
