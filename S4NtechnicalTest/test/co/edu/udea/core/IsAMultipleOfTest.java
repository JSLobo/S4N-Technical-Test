/**
 * 
 */
package co.edu.udea.core;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * unit tests for the IsAMultipleOf class
 * 
 * @author Sebastián Lobo R.
 *
 */
public class IsAMultipleOfTest {

	@Test
	public void testThreeIsAMultipleOfThree() {
		IsAMultipleOf isAMultipleOf = new IsAMultipleOf();
		boolean isAMultiple = false;
		isAMultiple = isAMultipleOf.three(3);
		assertTrue(isAMultiple == true);
	}

	@Test
	public void testThreeIsAMultipleOfFive() {
		IsAMultipleOf isAMultipleOf = new IsAMultipleOf();
		boolean isAMultiple = false;
		isAMultiple = isAMultipleOf.five(3);
		assertTrue(isAMultiple == false);
	}

	@Test
	public void testFiveIsAMultipleOfThree() {
		IsAMultipleOf isAMultipleOf = new IsAMultipleOf();
		boolean isAMultiple = false;
		isAMultiple = isAMultipleOf.three(5);
		assertTrue(isAMultiple == false);
	}

	@Test
	public void testFiveIsAMultipleOfFive() {
		IsAMultipleOf isAMultipleOf = new IsAMultipleOf();
		boolean isAMultiple = false;
		isAMultiple = isAMultipleOf.five(5);
		assertTrue(isAMultiple == true);
	}

	@Test
	public void testThirteenIsAMultipleOfThree() {
		IsAMultipleOf isAMultipleOf = new IsAMultipleOf();
		boolean isAMultiple = false;
		isAMultiple = isAMultipleOf.three(13);
		assertTrue(isAMultiple == false);
	}

	@Test
	public void testThirteenIsAMultipleOfFive() {
		IsAMultipleOf isAMultipleOf = new IsAMultipleOf();
		boolean isAMultiple = false;
		isAMultiple = isAMultipleOf.five(13);
		assertTrue(isAMultiple == false);
	}

	@Test
	public void testFifteenIsAMultipleOfThree() {
		IsAMultipleOf isAMultipleOf = new IsAMultipleOf();
		boolean isAMultiple = false;
		isAMultiple = isAMultipleOf.three(15);
		assertTrue(isAMultiple == true);
	}

	@Test
	public void testFifteenIsAMultipleOfFive() {
		IsAMultipleOf isAMultipleOf = new IsAMultipleOf();
		boolean isAMultiple = false;
		isAMultiple = isAMultipleOf.five(15);
		assertTrue(isAMultiple == true);
	}

	@Test
	public void testTwentyIsAMultipleOfThree() {
		IsAMultipleOf isAMultipleOf = new IsAMultipleOf();
		boolean isAMultiple = false;
		isAMultiple = isAMultipleOf.three(20);
		assertTrue(isAMultiple == false);
	}

	@Test
	public void testTwentyIsAMultipleOfFive() {
		IsAMultipleOf isAMultipleOf = new IsAMultipleOf();
		boolean isAMultiple = false;
		isAMultiple = isAMultipleOf.five(20);
		assertTrue(isAMultiple == true);
	}

	@Test
	public void testThirtyOneIsAMultipleOfThree() {
		IsAMultipleOf isAMultpleOf = new IsAMultipleOf();
		boolean isAMultiple = false;
		isAMultiple = isAMultpleOf.three(31);
		assertTrue(isAMultiple == false);
	}

	@Test
	public void testThirtyOneIsAMulipleOfFive() {
		IsAMultipleOf isAMultipleOf = new IsAMultipleOf();
		boolean isAMultiple = false;
		isAMultiple = isAMultipleOf.five(31);
		assertTrue(isAMultiple == false);
	}

	@Test
	public void testFortyFiveIsAMultipleOfThree() {
		IsAMultipleOf isAMultipleOf = new IsAMultipleOf();
		boolean isAMultiple = false;
		isAMultiple = isAMultipleOf.three(45);
		assertTrue(isAMultiple == true);
	}

	@Test
	public void testFortyFiveIsAmultipleOfFive() {
		IsAMultipleOf isAMultipleOf = new IsAMultipleOf();
		boolean isAMultiple = false;
		isAMultiple = isAMultipleOf.five(45);
		assertTrue(isAMultiple == true);
	}

	@Test
	public void testSeventyNineIsAMultipleOfThree() {
		IsAMultipleOf isAMultipleOf = new IsAMultipleOf();
		boolean isAMultiple = false;
		isAMultiple = isAMultipleOf.three(79);
		assertTrue(isAMultiple == false);
	}

	@Test
	public void testSeventyNineIsAMultipleOfFive() {
		IsAMultipleOf isAMultipleOf = new IsAMultipleOf();
		boolean isAMultiple = false;
		isAMultiple = isAMultipleOf.five(79);
		assertTrue(isAMultiple == false);
	}

	@Test
	public void testNinetyIsAMultipleOfThree() {
		IsAMultipleOf isAMultipleOf = new IsAMultipleOf();
		boolean isAMultiple = false;
		isAMultiple = isAMultipleOf.three(90);
		assertTrue(isAMultiple == true);
	}

	@Test
	public void testNinetyIsAMultipleOfFive() {
		IsAMultipleOf isAMultipleOf = new IsAMultipleOf();
		boolean isAMultiple = false;
		isAMultiple = isAMultipleOf.five(90);
		assertTrue(isAMultiple == true);
	}

}
