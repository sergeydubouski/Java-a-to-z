package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * @author Sergey Dubouski.
 * @version $id$.
 * @since 05.02.2017.
*/
public class SortTwoSortedArraysTest {

	/**
	 * Test.
	 * Test when arrFirst.length == arrSecond.length.
	*/
	@Test
	public void when1And1Then11() {

		final int[] expectedResult = {1, 1};
		final int[] arrFirst = {1};
		final int[] arrSecond = {1};

		final SortTwoSortedArrays sta = new SortTwoSortedArrays();
		final int[] actualResult = sta.sort(arrFirst, arrSecond);

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test.
	 * Test when arrFirst.length == arrSecond.length.
	*/
	@Test
	public void when2And1Then12() {

		final int[] expectedResult = {1, 2};
		final int[] arrFirst = {2};
		final int[] arrSecond = {1};

		final SortTwoSortedArrays sta = new SortTwoSortedArrays();
		final int[] actualResult = sta.sort(arrFirst, arrSecond);

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test.
	 * Test when arrFirst.length == arrSecond.length.
	*/
	@Test
	public void when1And2Then12() {

		final int[] expectedResult = {1, 2};
		final int[] arrFirst = {1};
		final int[] arrSecond = {2};

		final SortTwoSortedArrays sta = new SortTwoSortedArrays();
		final int[] actualResult = sta.sort(arrFirst, arrSecond);

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test.
	 * Test when arrFirst.length == arrSecond.length.
	*/
	@Test
	public void when111And222Then111222() {

		final int[] expectedResult = {1, 1, 1, 2, 2, 2};
		final int[] arrFirst = {1, 1, 1};
		final int[] arrSecond = {2, 2, 2};

		final SortTwoSortedArrays sta = new SortTwoSortedArrays();
		final int[] actualResult = sta.sort(arrFirst, arrSecond);

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test.
	 * Test when arrFirst.length == arrSecond.length.
	*/
	@Test
	public void when222And111Then111222() {

		final int[] expectedResult = {1, 1, 1, 2, 2, 2};
		final int[] arrFirst = {2, 2, 2};
		final int[] arrSecond = {1, 1, 1};

		final SortTwoSortedArrays sta = new SortTwoSortedArrays();
		final int[] actualResult = sta.sort(arrFirst, arrSecond);

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test.
	 * Test when arrFirst.length == arrSecond.length.
	*/
	@Test
	public void when135And246Then123456() {

		final int[] expectedResult = {1, 2, 3, 4, 5, 6};
		final int[] arrFirst = {1, 3, 5};
		final int[] arrSecond = {2, 4, 6};

		final SortTwoSortedArrays sta = new SortTwoSortedArrays();
		final int[] actualResult = sta.sort(arrFirst, arrSecond);

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test.
	 * Test when arrFirst.length == arrSecond.length.
	*/
	@Test
	public void when246And135Then123456() {

		final int[] expectedResult = {1, 2, 3, 4, 5, 6};
		final int[] arrFirst = {2, 4, 6};
		final int[] arrSecond = {1, 3, 5};

		final SortTwoSortedArrays sta = new SortTwoSortedArrays();
		final int[] actualResult = sta.sort(arrFirst, arrSecond);

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test.
	 * Test when arrFirst.length > arrSecond.length.
	*/
	@Test
	public void when111And11Then11111() {

		final int[] expectedResult = {1, 1, 1, 1, 1};
		final int[] arrFirst = {1, 1, 1};
		final int[] arrSecond = {1, 1};

		final SortTwoSortedArrays sta = new SortTwoSortedArrays();
		final int[] actualResult = sta.sort(arrFirst, arrSecond);

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test.
	 * Test when arrFirst.length > arrSecond.length.
	*/
	@Test
	public void when222And11Then11222() {

		final int[] expectedResult = {1, 1, 2, 2, 2};
		final int[] arrFirst = {2, 2, 2};
		final int[] arrSecond = {1, 1};

		final SortTwoSortedArrays sta = new SortTwoSortedArrays();
		final int[] actualResult = sta.sort(arrFirst, arrSecond);

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test.
	 * Test when arrFirst.length > arrSecond.length.
	*/
	@Test
	public void when111And22Then11122() {

		final int[] expectedResult = {1, 1, 1, 2, 2};
		final int[] arrFirst = {1, 1, 1};
		final int[] arrSecond = {2, 2};

		final SortTwoSortedArrays sta = new SortTwoSortedArrays();
		final int[] actualResult = sta.sort(arrFirst, arrSecond);

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test.
	 * Test when arrFirst.length > arrSecond.length.
	*/
	@Test
	public void when135And46Then13456() {

		final int[] expectedResult = {1, 3, 4, 5, 6};
		final int[] arrFirst = {1, 3, 5};
		final int[] arrSecond = {4, 6};

		final SortTwoSortedArrays sta = new SortTwoSortedArrays();
		final int[] actualResult = sta.sort(arrFirst, arrSecond);

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test.
	 * Test when arrFirst.length > arrSecond.length.
	*/
	@Test
	public void when024And13Then01234() {

		final int[] expectedResult = {0, 1, 2, 3, 4};
		final int[] arrFirst = {0, 2, 4};
		final int[] arrSecond = {1, 3};

		final SortTwoSortedArrays sta = new SortTwoSortedArrays();
		final int[] actualResult = sta.sort(arrFirst, arrSecond);

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test.
	 * Test when arrFirst.length < arrSecond.length.
	*/
	@Test
	public void when11And111Then11111() {

		final int[] expectedResult = {1, 1, 1, 1, 1};
		final int[] arrFirst = {1, 1};
		final int[] arrSecond = {1, 1, 1};

		final SortTwoSortedArrays sta = new SortTwoSortedArrays();
		final int[] actualResult = sta.sort(arrFirst, arrSecond);

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test.
	 * Test when arrFirst.length < arrSecond.length.
	*/
	@Test
	public void when22And111Then11122() {

		final int[] expectedResult = {1, 1, 1, 2, 2};
		final int[] arrFirst = {2, 2};
		final int[] arrSecond = {1, 1, 1};

		final SortTwoSortedArrays sta = new SortTwoSortedArrays();
		final int[] actualResult = sta.sort(arrFirst, arrSecond);

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test.
	 * Test when arrFirst.length < arrSecond.length.
	*/
	@Test
	public void when11And222Then11222() {

		final int[] expectedResult = {1, 1, 2, 2, 2};
		final int[] arrFirst = {1, 1};
		final int[] arrSecond = {2, 2, 2};

		final SortTwoSortedArrays sta = new SortTwoSortedArrays();
		final int[] actualResult = sta.sort(arrFirst, arrSecond);

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test.
	 * Test when arrFirst.length < arrSecond.length.
	*/
	@Test
	public void when13And024Then01234() {

		final int[] expectedResult = {0, 1, 2, 3, 4};
		final int[] arrFirst = {1, 3};
		final int[] arrSecond = {0, 2, 4};

		final SortTwoSortedArrays sta = new SortTwoSortedArrays();
		final int[] actualResult = sta.sort(arrFirst, arrSecond);

		assertThat(actualResult, is(expectedResult));
	}

	/**
	 * Test.
	 * Test when arrFirst.length < arrSecond.length.
	*/
	@Test
	public void when15And234Then11() {

		final int[] expectedResult = {1, 2, 3, 4, 5};
		final int[] arrFirst = {1, 5};
		final int[] arrSecond = {2, 3, 4};

		final SortTwoSortedArrays sta = new SortTwoSortedArrays();
		final int[] actualResult = sta.sort(arrFirst, arrSecond);

		assertThat(actualResult, is(expectedResult));
	}
}