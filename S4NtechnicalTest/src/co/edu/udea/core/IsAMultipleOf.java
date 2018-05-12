/**
 * 
 */
package co.edu.udea.core;

/**
 * This class contains the specific methods for check is a number is a multiple
 * of 'three' or 'five'.
 * @author Sebastián Lobo R.
 *
 */
public class IsAMultipleOf {
	
	/**
	 * This method checks if a number is multiple of 'three'.
	 * @param number number to checking.
	 * @return true when the number is multiple of 'three', otherwise return false
	 */
	public boolean three(int number) {
		if (number % 3 == 0)
			return true;
		return false;
	}

	/**
	 * This method checks if a number is multiple of 'five'.
	 * @param number number to checking.
	 * @return true when the number is multiple of 'five', otherwise return false
	 */
	public boolean five(int number) {
		if (number % 5 == 0)
			return true;
		return false;
	}
}
