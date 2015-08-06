package day1.robot;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
import org.jointheleague.graphical.robot.RobotWindow;


public class FeedTheRobot implements KeyEventDispatcher
{
	Robot robot = new Robot();
	
	int miniX = new Random().nextInt(1780);
	int miniY = new Random().nextInt(1000);Robot food = new Robot("mini");
	private void feedTheRobot()
	{
		// 1. use the addFood() method to add food for the robot
	 addFood(100, 150);
	 
	 
	 
	food.moveTo(miniX, miniY);
	 
	}
	
private void goUp()
	{
		// 2. Print "going up". Test it out by running your code and pressing the up key
		System.out.println("going up");
		// 3. Make the robot move up the screen
	robot.move(50);
	}

	private void goDown()
	{
		// 4. make the robot move down the screen
		robot.move(-50);
	}
	
	private void goLeft()
	{
	// 5. make the robot move left
	robot.turn(-15);
	}

	private void goRight()
	{
		// 6. make the robot move right
		robot.turn(15);
	}	int robotLocationX;
	int robotLocationY;

	private void checkIfFoodFound() throws Exception
	{
	 robotLocationX = robot.getX();
	 robotLocationY = robot.getY();
	
		// 7. Print out the variables for robotLocationX and robotLocationY
	  System.out.print(robotLocationX);
		// 8. if robot is at same location as food
	  
			// print "chomp"
			// say "chomp" with Runtime.getRuntime().exec("say chomp");
			// call the eatFood() method
		
	}

private void eatFood() {
		component.setText("");
	}

	private void addFood(int x, int y)
	{
	component.setLocation(x,y);
		window.add(component);
		
	}

	RobotWindow window = robot.getWindow();
	Label component = new Label("*########");

	public static void main(String[] args)
	{
		FeedTheRobot feeder = new FeedTheRobot();
		feeder.controlTheRobot();
		feeder.feedTheRobot();
	}

	private void controlTheRobot() 
{
KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		robot.show();
		robot.setSpeed(10);
	}

	public boolean dispatchKeyEvent(KeyEvent e)
	{
		if (e.getID() == KeyEvent.KEY_PRESSED)
		{
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				 goDown();
			if (robotLocationX> miniX-50 && robotLocationX< miniX+50 && robotLocationY> miniY-50 && robotLocationY< miniY+50){
				 miniX = new Random().nextInt(1780);
				 miniY = new Random().nextInt(1000);
				 food.moveTo(miniX, miniY);
			speak("sutch wow");
			
			}
						try {
	
			checkIfFoodFound();
			} catch (Exception exception) {}
		}
		return false;
	}
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

