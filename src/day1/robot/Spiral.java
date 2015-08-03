package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot Dalek = new Robot();
		// 5. Set your robot's pen to the down position
			Dalek.penDown();
		// 3. Set the robot to go at max speed (10)
		Dalek.setSpeed(20);
		// 4. Do the following (steps 5-8) 75 times
		for (int i = 0; i < 150; i++) {
			
		
			// 7. Change the pen color to random
			Dalek.setRandomPenColor();
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
			Dalek.move(5*i);
			// 2. Turn the robot 1/3 of 360 degrees to the right
		Dalek.turn(150);
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
		
			// 9. Set the pen width to i
		Dalek.setPenWidth(i);
	}
}}
