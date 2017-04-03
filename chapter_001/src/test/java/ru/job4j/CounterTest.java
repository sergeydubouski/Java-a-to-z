package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Sergey Dubouski
 * @version $Id$
 * @since 13.01.2017
*/
public class CounterTest {

	/**
	 * Test even-even range of numbers' sum.
	*/
	@Test
	public void whenFirstNumberEvenSecondEvenThenSum() {

		final int first = 4;
		final int second = 6;
		final int expectedResult = 0;

		final Counter count = new Counter();
		final int actualResult = count.add(first, second);

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test odd-even range of numbers' sum.
	*/
	@Test
	public void whenFirstNumberOddSecondEvenThenSum() {

		final int first = 1;
		final int second = 2;
		final int expectedResult = 0;

		final Counter count = new Counter();
		final int actualResult = count.add(first, second);

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test even-odd range of numbers' sum.
	*/
	@Test
	public void whenFirstNumberEvenSecondOddThenSum() {

		final int first = 2;
		final int second = 7;
		final int expectedResult = 10;

		final Counter count = new Counter();
		final int actualResult = count.add(first, second);

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test odd-odd range of numbers' sum.
	*/
	@Test
	public void whenFirstNumberOddSecondOddThenSum() {

		final int first = 1;
		final int second = 5;
		final int expectedResult = 6;

		final Counter count = new Counter();
		final int actualResult = count.add(first, second);

		assertThat(actualResult, is(expectedResult));
	}
}