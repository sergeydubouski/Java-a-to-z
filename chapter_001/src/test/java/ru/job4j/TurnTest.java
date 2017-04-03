package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Sergey Dubouski
 * @version $id$
 * @since 18.01.2017
*/
public class TurnTest {

	/**
	* Test Turn.
	*/
	@Test
	public void whenOneThenOne() {
		final int first = 10;
		final int[] expectedResult = {first};

		final Turn turn = new Turn();
		final int[] actualResult = turn.back(new int[] {first});

		assertThat(actualResult, is(expectedResult));
	}

	/**
	* Test Turn.
	*/
	@Test
	public void whenOneTwoThreeFourFiveThenFiveFourThreeTwoOne() {
		final int first = 10;
		final int second = 20;
		final int third = 30;
		final int fourth = 40;
		final int fifth = 50;
		final int[] expectedResult = {fifth, fourth, third, second, first};

		final Turn turn = new Turn();
		final int[] actualResult = turn.back(new int[] {first, second, third, fourth, fifth});

		assertThat(actualResult, is(expectedResult));
	}
}