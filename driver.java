/**
 * 
 */
package Question2;
/**
 * @author j
 *
 */
public class driver {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) { // MAIN
		// TODO Auto-generated method stub
		
		Octagon oct1 = new Octagon(0);
		Octagon oct2 = new Octagon(0);
		
		oct1.updateFromConsole();
		oct1.writeToConsole();
		oct2.updateFromConsole();
		oct2.writeToConsole();
		System.out.println(check(oct1.compareTo(oct2)));
				
	} // end MAIN 
	
	public static String check(int compareTo) {
		if (compareTo == -1) {
			return "The first geometric figure is the largest.";
		}
		else if (compareTo == 1) {
			return "The second geometric figure is the largest.";
		}
		else if (compareTo ==0) {
			return "The geometric figures are of equal size.";
		}
		return null;	
	}
	
} // end CLASS
