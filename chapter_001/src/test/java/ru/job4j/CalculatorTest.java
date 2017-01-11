package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Sergey Dubouski
 * @version $Id$
 * @since 09/01/2017
*/
public class CalculatorTest {

    /**
     * Test addition.
     */
    @Test
	public void whenAddSevenToNineThenSixteen() {
		final Calculator calc = new Calculator();
		final double first = 7d;
		final double second = 9d;
		final double expectedResult = 16d;
		calc.add(first, second);
		final double actualResult = calc.getResult();

		assertThat(expectedResult, is(actualResult));
	}

    /**
     * Test subtraction.
     */
    @Test
	public void whenSubtractSevenFromNineThenTwo() {
		final Calculator calc = new Calculator();
		final double first = 9d;
		final double second = 7d;
		final double expectedResult = 2d;
		calc.subtract(first, second);
		final double actualResult = calc.getResult();

		assertThat(expectedResult, is(actualResult));
	}

    /**
     * Test multiplication.
     */
    @Test
	public void whenMultiplySevenByNineThenSixtythree() {
		final Calculator calc = new Calculator();
		final double first = 7d;
		final double second = 9d;
		final double expectedResult = 63d;
		calc.multiply(first, second);
		final double actualResult = calc.getResult();

		assertThat(expectedResult, is(actualResult));
	}

    /**
     * Test division.
     */
    @Test
	public void whenDivideFifteenByThreeThenFive() {
		final Calculator calc = new Calculator();
		final double first = 15d;
		final double second = 3d;
		final double expectedResult = 5d;
		calc.divide(first, second);
		final double actualResult = calc.getResult();

		assertThat(expectedResult, is(actualResult));
	}
}