package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Sergey Dubouski
 * @version $id$
 * @since 19.01.2017
*/
public class SortArrayTest {

	/**
	 * Test.
	*/
	@Test
	public void whenRandomOrderThenAscendingOrder() {
		final int first = 14;
		final int second = 11;
		final int third = 15;
		final int fourth = 0;
		final int fifth = 8;

		int[] expectedResult = new int[] {third, first, second, fifth, fourth};

		SortArray sortArray = new SortArray();
		int[] actualResult = sortArray.sort(new int[] {first, second, third, fourth, fifth});

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test.
	*/
	@Test
	public void whenOneThenOne() {
		final int first = 14;

		int[] expectedResult = new int[] {first};

		SortArray sortArray = new SortArray();
		int[] actualResult = sortArray.sort(new int[] {first});

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test.
	*/
	@Test
	public void whenTheeFourThenFourThree() {
		final int first = 3;
		final int second = 4;

		int[] expectedResult = new int[] {second, first};

		SortArray sortArray = new SortArray();
		int[] actualResult = sortArray.sort(new int[] {first, second});

		assertThat(actualResult, is(expectedResult));
	}
}