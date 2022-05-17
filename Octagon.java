/**
 * 
 */
package Question2;

import java.util.Scanner;

/**
 * Octagon dictates the behaviour of Octagon objects
 *
 */
public class Octagon extends GeometricFigure2 implements consoleIO, ComparableGeometricFigure<Octagon> { // CLASS

	// VARIABLES //
	private final int sides = 8;
	// END VARIABLES
	
	Scanner scanner = new Scanner(System.in); // creates new scanner object

	Octagon (int sideLength) { // CONSTRUCTOR
		super();
		setSideLength(sideLength);
		setSides(sides);
	} // end CONSTRUCTOR

	
	// METHODS //
	
	@Override
	public void updateFromConsole() { // updateFromConsole()
		// Requests and takes input of Octagon parameter
		System.out.println("Please enter the length of the side of the Octagon:");
		setSideLength(scanner.nextInt());
	} // end updateFromConsole

	@Override
	public void writeToConsole() { // writeToConsole()
		// Prints details of the Octagon shape
		System.out.println("\nThis Octagon has " +sides+ " sides of length " +getSideLength()+ " and a total area of  " +calcArea()+"\n");	
	} // end writeToConsole()

	public double calcArea (){
		// Calculates and sets area
		double area = 2 * (Math.pow(getSideLength(), 2)) * (1+Math.sqrt(2));
		return area; 
	} // end calcArea
	
	public  int compareTo(Octagon toCompare) {
		// TODO Auto-generated method stub
		double areaDifference = toCompare.calcArea() - this.calcArea();
		if (areaDifference < 0) {
			return -1;
		}
		else if (areaDifference > 0) {
			return 	1;
		}
		else {
			return 0;
		}
	}
	
	// END METHODS //
	
	
} // end CLASS
