/**
 * 
 */
package co.edu.udea.core;

/**
 * This is a program that prints the numbers from 1 to 100. But for multiples of three
 * print "Fizz" instead of the number and for the multiples of five print "Buzz". 
 * For numbers which are multiples of both three and five print "FizzBuzz"."
 * @author Sebastián Lobo R.
 *
 */
public class FizzBuzzPrinter {

	private static final String fizzBuzz = "FizzBuzz";
	private static final String fizz = "Fizz";
	private static final String buzz = "Buzz";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fromOneToHundredGenerator();
	}

	public static void fromOneToHundredGenerator() {
		IsAMultipleOf isAMultipleOf = new IsAMultipleOf();
		for (int i = 1; i <= 100; i++) {
			if (isAMultipleOf.three(i) && isAMultipleOf.five(i))
				System.out.println(fizzBuzz);
			else if (isAMultipleOf.three(i))
				System.out.println(fizz);
			else if (isAMultipleOf.five(i))
				System.out.println(buzz);
			else
				System.out.println(i);
		}
	}
}
