package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot Dalek = new Robot();
Dalek.penDown();
Dalek.setPenColor(Color.red);
for (int i = 0; i < 13; i++) {
	Dalek.setSpeed(20);
	Dalek.move(100);
	Dalek.turn(15);
}
	}
}