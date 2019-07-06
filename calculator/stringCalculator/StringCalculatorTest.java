package stringCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	private StringCalculator sc = new StringCalculator();

	@Test
	public void emptyStringShouldReturnZero() {
		assertEquals(0, sc.add(""));
	}
	
	@Test
	public void enteredNumberShouldReturn() {
		assertEquals(1, sc.add("1"));
	}
	
	@Test
	public void numbersWithDelimeterShouldReturnSum() {
		assertEquals(3, sc.add("1,2"));
	}
	
	@Test
	public void multipleNumbersWithDelimeterShouldReturnSum() {
		assertEquals(6, sc.add("1,2,3"));
	}
	
	@Test
	public void multipleNumbersWithNewLineShouldReturnSum() {
		assertEquals(6, sc.add("1\n2,3"));
	}
	
	@Test
	public void beginningOfTheStringContainsSeperateLineShouldReturnSum() {
		assertEquals(3, sc.add("//;\n1;2"));
	}
	
	@Test
	public void negativeNumbersThrowExceptionTheRestShouldReturnSum() {
		assertEquals(3, sc.add("-1,-2,1,2"));
	}
	
	@Test
	public void biggerNumbersAreIgnoredTheRestShouldReturnSum() {
		assertEquals(2, sc.add("2,1000"));
	}


}
