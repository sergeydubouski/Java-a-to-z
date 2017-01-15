package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Sergey Dubouski
 * @version $id$
 * @since 15.01.2017
*/
public class PiramidTest {

	/**
	 * Test piramid.
	*/
	@Test
	public void whenHeightZeroThenErrorMsg() {
		final int h = 0;
		final String expectedResult = "Cannot create a piramid with the given height!";

        final Paint paint = new Paint();
		final String actualResult = paint.piramid(h);

        assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test piramid.
	*/
	@Test
	public void whenHeightOneThenPiramid() {
		final int h = 1;
		final String expectedResult = " ^\r\n";

        final Paint paint = new Paint();
		final String actualResult = paint.piramid(h);

        assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test piramid.
	*/
	@Test
	public void whenHeightTwoThenPiramid() {
		final int h = 2;
		final String expectedResult = "  ^\r\n ^ ^\r\n";

        final Paint paint = new Paint();
		final String actualResult = paint.piramid(h);

        assertThat(actualResult, is(expectedResult));
	}
}