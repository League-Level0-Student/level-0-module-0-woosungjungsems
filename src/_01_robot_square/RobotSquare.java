package _01_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
    	Robot r = new Robot();
    	r.penDown();
    	r.setSpeed(400);
    	for (int i = 0; i < 4; i++) {
			r.move(200);
			r.turn(90);
		}
    	
 
    	// 1. Make a new Robot


        // 3. Put the robot's pen down


        // 6. Make the robot move as fast as possible


        // 5. Do everything below here 4 times


        //         2. Move your robot 200 pixels


        //         4. Turn the robot 90 degrees to the right (90 degrees)


    }
}
