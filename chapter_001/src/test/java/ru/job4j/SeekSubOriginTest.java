package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Sergey Dubouski.
 * @version $id$.
 * @since 24.01.2017.
*/
public class SeekSubOriginTest {

	/**
	 * Test.
	*/
	@Test
	public void whenNoSubThenFalse() {

		final boolean expectedResult = false;

		final SeekSubOrigin so = new SeekSubOrigin();
		final boolean actualResult = so.contains("hihihi", "");

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test.
	*/
	@Test
	public void whenSubDoesntMatchOriginThenFalse() {

		final boolean expectedResult = false;

		final SeekSubOrigin so = new SeekSubOrigin();
		final boolean actualResult = so.contains("hihihi", "h i");

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test.
	*/
	@Test
	public void whenSubLengthGreaterOriginThenFalse() {

		final boolean expectedResult = false;

		final SeekSubOrigin so = new SeekSubOrigin();
		final boolean actualResult = so.contains("hihihi", "hihihihi");

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test.
	*/
	@Test
	public void whenCapitalSubThenFalse() {

		final boolean expectedResult = false;

		final SeekSubOrigin so = new SeekSubOrigin();
		final boolean actualResult = so.contains("hihihi", "H");

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test.
	*/
	@Test
	public void whenSubMatchesOriginThenTrue() {

		final boolean expectedResult = true;

		final SeekSubOrigin so = new SeekSubOrigin();
		final boolean actualResult = so.contains("hihihi", "hihihi");

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test.
	*/
	@Test
	public void whenOneSubMatchesOriginThenTrue() {

		final boolean expectedResult = true;

		final SeekSubOrigin so = new SeekSubOrigin();
		final boolean actualResult = so.contains("hihihi", "h");

		assertThat(actualResult, is(expectedResult));
	}
}