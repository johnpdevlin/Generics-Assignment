package Question2;

public class GeometricFigure2 { // ABSTRACT CLASS //
	
	// VARIABLES //
	private int sides;
	private double sideLength;
	private boolean filled;
	private double area;
    // END VARIABLES
	
	
	// BOOLEANS
	public GeometricFigure2() { 
		filled = false;
    }
    
	public boolean isFilled() {
		return filled;
    }
    
	public void setFilled(boolean filled) {
		this.filled = filled;
    }
	// end BOOLEANS
    
	
	// GETTERS & SETTERS 
	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}


	/**
	 * @return the sideLength
	 */
	public double getSideLength() {
		return sideLength;
	}

	/**
	 * @param sideLength the sideLength to set
	 */
	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}

	/**
	 * @return the sides
	 */
	public int getSides() {
		return sides;
	}

	/**
	 * @param sides the sides to set
	 */
	public void setSides(int sides) {
		this.sides = sides;
	}
	// end GETTERS & SETTERS 

	
	// METHODS
	public void display() {
		System.out.println("This is some geometric figure."); 
	}

	public double calcArea() {
		return area;
	}	
	
	
	

	// end METHODS //
		
	
} // END CLASS //
