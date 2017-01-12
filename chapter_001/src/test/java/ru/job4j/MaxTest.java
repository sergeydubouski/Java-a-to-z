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
	public void whenTwoValuesThenMaxReturned() {

		final int first = 10;
		final int second = 12;
		final int expectedResult = 12;

		final Max m = new Max();
		final int actualResult = m.max(first, second);

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * test equal values.
	*/
	@Test
	public void whenTwoValuesEqualThenZeroReturned() {

		final int first = 12;
		final int second = 12;
		final int expectedResult = 0;

		final Max m = new Max();
		final int actualResult = m.max(first, second);

		assertThat(actualResult, is(expectedResult));
	}
}