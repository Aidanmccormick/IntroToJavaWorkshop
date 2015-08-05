package day1.robot;

import javax.swing.JOptionPane;

public class question {public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("what's your name");
	JOptionPane.showMessageDialog(null, "hello, "+answer);
	JOptionPane.showInputDialog("what are you doing");
}

}
