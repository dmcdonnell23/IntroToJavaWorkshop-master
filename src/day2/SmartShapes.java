package day2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class SmartShapes {

	public static void main(String[] args) throws Exception {
		// 1. Make a new Robot
		Robot l = new Robot();

		// 3. Put the robot's pen down
		l.setPenColor(Color.orange);
		l.penDown();

		// 6. Make the robot move as fast as possible
		l.setSpeed(80);

		// 5. Do everything below here 4 times
		for (int i = 0; i < 4; i++) {

			// 2. Move your robot 200 pixels
			l.move(50 * i);
			// 4. Turn the robot 90 degrees to the right
			l.turn(360 / 4);

			// 7. Change steps 4 and 5 to draw a different shape (e.g. triangle

			// (3-sides), pentagon (5-sides), decagon (10-sides)).

		}

	}
}
