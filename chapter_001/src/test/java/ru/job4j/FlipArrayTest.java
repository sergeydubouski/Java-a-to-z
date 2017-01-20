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
public cass FlipArrayTest {

	/**
	 * Test.
	*/
	@Test
	public void whenArrayThenNinetyDegreeRotate() {

		int[][] expectedResult = new int[][] {{20, 10, 0},{21, 11, 1},{22, 12, 2}};

		FlipArray fa = new FlipArray();
		fa.flip(new int[][] {{0, 1, 2},{10, 11, 12},{20, 21, 22}});
		assertThat(actualResult, is(expectedResult));
	}
}