package alten.jinterview;

import static org.junit.Assert.*;

import org.junit.Test;

import alten.jinterview.exceptions.InvalidInputException;

public class CheckerTest {

	private static final int[] input = {5, 7, -2, 10, -1, 3, 32};
	
	@Test
	public void testIsValidWhenValid() {
		Checker checker = new Checker(-10, 50);
		try {
			assertTrue(checker.isValid(input));
		} catch (InvalidInputException e) {
			fail();
		}
	}
	
	@Test(expected = InvalidInputException.class)
	public void testIsValidWhenNotValid() throws InvalidInputException {
		Checker checker = new Checker(-10, 10);
		checker.isValid(input);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIsValidWhenNull() throws InvalidInputException {
		Checker checker = new Checker(-10, 10);
		checker.isValid(null);
	}
}
