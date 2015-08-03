package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot Dalek = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		Dalek.setSpeed(10);
		// 5. Set the pen width to 5
		Dalek.setPenWidth(5);
		// 6. Do steps #6 to #8 four times...
		for (int j = 0; j < 4; j++) {
			
		
			// 7. Set the pen color to random
			Dalek.setRandomPenColor();
			// 1. Call the drawSquare() method
			drawSquare();
			// 8. Turn the robot 90 degrees to the right
			
	}}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		for (int i = 0; i < 4; i++) {
			
		Dalek.penDown();
Dalek.move(100);
		Dalek.turn(90);
		
		}
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
