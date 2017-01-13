package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Sergey Dubouski
 * @version $Id$
 * @since 11.01.2017
*/
public class MaxTest {

	/**
	 * test max value.
	*/
	@Test
	public void whenSecondValueMaxOutOfTwoThenMaxReturned() {

		final int first = 10;
		final int second = 12;
		final int expectedResult = 12;

		final Max m = new Max();
		final int actualResult = m.max(first, second);

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * test max value.
	*/
	@Test
	public void whenFirstValueMaxOutOfTwoThenMaxReturned() {

		final int first = 11;
		final int second = 10;
		final int expectedResult = 11;

		final Max m = new Max();
		final int actualResult = m.max(first, second);

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * test max value.
	*/
	@Test
	public void whenFirstValueMaxOutOfThreeThenMaxReturned() {
		final int first = 35;
		final int second = 32;
		final int third = 17;
		final int expectedResult = 35;

		final Max m = new Max();
		final int actualResult = m.max(first, second, third);

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * test max value.
	*/
	@Test
	public void whenSecondValueMaxOutOfThreeThenMaxReturned() {

		final int first = 41;
		final int second = 55;
		final int third = 2;
		final int expectedResult = 55;

		final Max m = new Max();
		final int actualResult = m.max(first, second, third);

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * test max value.
	*/
	@Test
	public void whenThirdValueMaxOutOfThreeThenMaxReturned() {

		final int first = 77;
		final int second = 44;
		final int third = 99;
		final int expectedResult = 99;

		final Max m = new Max();
		final int actualResult = m.max(first, second, third);

		assertThat(actualResult, is(expectedResult));
	}
}