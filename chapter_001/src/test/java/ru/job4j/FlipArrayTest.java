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
<<<<<<< HEAD
public class FlipArrayTest {
=======
public cass FlipArrayTest {
>>>>>>> dev

	/**
	 * Test.
	*/
	@Test
	public void whenArrayThenNinetyDegreeRotate() {

<<<<<<< HEAD
		final int first = 0;
		final int second = 1;
		final int third = 2;
		final int fourth = 10;
		final int fifth = 11;
		final int sixth = 12;
		final int seven = 20;
		final int eight = 21;
		final int nine = 22;

		final int[][] expectedResult = new int[][] {{seven, fourth, first}, {eight, fifth, second}, {nine, sixth, third}};

		final FlipArray fa = new FlipArray();
		final int[][] actualResult = fa.flip(new int[][] {{first, second, third}, {fourth, fifth, sixth}, {seven, eight, nine}});
=======
		int[][] expectedResult = new int[][] {{20, 10, 0},{21, 11, 1},{22, 12, 2}};

		FlipArray fa = new FlipArray();
		fa.flip(new int[][] {{0, 1, 2},{10, 11, 12},{20, 21, 22}});
>>>>>>> dev
		assertThat(actualResult, is(expectedResult));
	}
}