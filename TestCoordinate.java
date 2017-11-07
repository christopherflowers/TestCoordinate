package uwstout.cs144.labs.lab02;

import java.util.Scanner;

/**
 * The purpose of this program is to convert rectangular coordinate values into
 * polar coordinates.
 * 
 * @author Flowers
 * @version 2016-09-20
 */

public class TestCoordinate {

	/**
	 * The purpose of this program is to convert rectangular coordinate values
	 * into polar coordinates.
	 * 
	 * @param args
	 *            Command line parameters
	 * 
	 *            Input:x = 5, y = 8, r = 9.4340, theta = 57.995
	 * 
	 *            Input:x = 1, y = 4, r = 4.1231, theta = 75.964
	 * 
	 *            Input:x = -7, y = 6, r = 9.2195, theta = 139.40
	 * 
	 * 
	 */

	public static void main(String[] args) {

		// declare your variables here
		int var1;
		int var2;

		// Reads input from the keyboard
		Scanner input = new Scanner(System.in);
		// Reads in two integers for the x, y value we
		// are representing. They are read in the order
		// x and then y.
		//replace var1 and var2 with the names of the
		// variables that you created above to store the
		// x, y coordinate
		System.out.print("Enter the x value: ");
		var1 = input.nextInt();
		System.out.print("Enter the y value: ");
		var2 = input.nextInt();

		// create a Coordinate object with your x, y values and store
		// it in a variable
		Coordinate myCoordinate;
		myCoordinate = new Coordinate(var1, var2);
		// call on getR method
		// store that info
		double r = myCoordinate.getR();
		// call on getTheta method
		// store that info
		double theta = myCoordinate.getTheta();

		// print to the screen the x, y values and the
		// r, theta values of the coordinate. Format it so that
		// it is easily readable by a human
		System.out.println("The coordinate is (" + var1 + ", " + var2 + ")");
		System.out.println("The radian value of a polar (r, theta) is " + r
				+ ", and the theta value of a polar (r, theta) is " + theta);

		input.close(); // releases resources
	}

}