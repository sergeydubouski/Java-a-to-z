package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * Test.
 *
 * @author Sergey Dubouski
 * @version $Id$
 * @since 10.01.2017
*/
public class TriangleTest {

    /**
     * the variable contains accepted variation between expected and actual results.
     */
	public static final double ACCEPTED_ERROR = 0.01d;

    /**
     * Test area's calculation with a valid input.
     */
    @Test
	public void whenThreePointsAreDifferentThenAreaIsCalculated() {
		final double expectedResult = 4.50d;

		final double ax = 10d;
		final double bx = 9d;
		final double cx = 1d;
		final double ay = 0d;
		final double by = 1d;
		final double cy = 0d;
		final Point a = new Point(ax, ay);
		final Point b = new Point(bx, by);
		final Point c = new Point(cx, cy);

		Triangle triangle = new Triangle(a, b, c);
		final double actualResult = triangle.area();

		assertThat(actualResult, is(closeTo(expectedResult, ACCEPTED_ERROR)));
	}

	 /**
     * Test area's calculation with an invalid input.
     */
    @Test
	public void whenTwoPointsAreSameThenAreaIsNotCalculated() {
		final double expectedResult = 0d;

		final double ax = 10d;
		final double bx = 10d;
		final double cx = 1d;
		final double ay = 9d;
		final double by = 9d;
		final double cy = 0d;
		final Point a = new Point(ax, ay);
		final Point b = new Point(bx, by);
		final Point c = new Point(cx, cy);

		Triangle triangle = new Triangle(a, b, c);
		final double actualResult = triangle.area();

		assertThat(actualResult, is(closeTo(expectedResult, ACCEPTED_ERROR)));
	}
}