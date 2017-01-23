package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Sergey Dubouski.
 * @version $id$.
 * @since 20.01.2017.
*/
public class ClipArrayTest {

	/**
	 * Test.
	*/
	@Test
	public void whenArrayWithFiveDuplicatesThenNoDuplicates() {

		String[] expectedResult = new String[] {"Hello", "ZZZ", "World", "Abr", "Sun"};

		final ClipArray ca = new ClipArray();
		final String[] actualResult = ca.clip(new String[] {"Hello", "Hello", "ZZZ", "World", "Abr", "World", "Sun", "Sun", "Hello", "World"});

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test.
	*/
	@Test
	public void whenArrayWithThreeDuplicatesThenNoDuplicates() {

		String[] expectedResult = new String[] {"Hello"};

		final ClipArray ca = new ClipArray();
		final String[] actualResult = ca.clip(new String[] {"Hello", "Hello", "Hello", "Hello"});

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test.
	*/
	@Test
	public void whenArrayWithFourDuplicatesThenNoDuplicates() {

		String[] expectedResult = new String[] {"Hello", "ZZZ", "World", "Abr", "Sun"};

		final ClipArray ca = new ClipArray();
		final String[] actualResult = ca.clip(new String[] {"Hello", "Hello", "ZZZ", "World", "Abr", "World", "Sun", "Sun", "Hello"});

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test.
	*/
	@Test
	public void whenArrayWithNoDuplicatesThenNoDuplicates() {

		String[] expectedResult = new String[] {"Hello", "Sun", "Sky", "Light"};

		final ClipArray ca = new ClipArray();
		final String[] actualResult = ca.clip(new String[] {"Hello", "Sun", "Sky", "Light"});

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test.
	*/
	@Test
	public void whenEmptyArrayThenEmptyArray() {

		String[] expectedResult = new String[] {};

		final ClipArray ca = new ClipArray();
		final String[] actualResult = ca.clip(new String[] {});

		assertThat(actualResult, is(expectedResult));
	}
}