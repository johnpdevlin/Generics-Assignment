/**
 * 
 */
package Question2;

/**
 * @author j
 * @param <T>
 *
 */
public interface ComparableGeometricFigure<T extends GeometricFigure2> extends Comparable<T> {

	public int compareTo(T toCompare);
	
	
	
	
}