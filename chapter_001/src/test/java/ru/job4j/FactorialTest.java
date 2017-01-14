package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Sergey Dubouski
 * @version $id$
 * @since 14.01.2017
*/
public class FactorialTest {

	/**
	 * Test factorial.
	*/
	@Test
	public void whenFourThenTwentyFour() {

		final int number = 4;
		final int expectedResult = 24;

		final Factorial factorial = new Factorial();
		final int actualResult = factorial.calcFactorial(number);

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test factorial.
	*/
	@Test
	public void whenZeroThenOne() {

		final int number = 0;
		final int expectedResult = 1;

		final Factorial factorial = new Factorial();
		final int actualResult = factorial.calcFactorial(number);

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test factorial.
	*/
	@Test
	public void whenOneThenOne() {

		final int number = 1;
		final int expectedResult = 1;

		final Factorial factorial = new Factorial();
		final int actualResult = factorial.calcFactorial(number);

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test factorial.
	*/
	@Test
	public void whenNegativeThenZero() {

		final int number = -1;
		final int expectedResult = 0;

		final Factorial factorial = new Factorial();
		final int actualResult = factorial.calcFactorial(number);

		assertThat(actualResult, is(expectedResult));
	}
}