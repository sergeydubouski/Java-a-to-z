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
class ClipArrayTest {

	/**
	 * Test.
	*/
	@Test
	public void whenArrayWithDuplicatesThenNoDuplicates() {

		String[] expectedResult = new String[] {"Hello", "ZZZ", "World", "Abr", "Sun"};

		final ClipArray ca = new ClipArray();
		final String[] actualResult = ca.clip(new String[] {"Hello", "Hello", "ZZZ", "World", "Abr", "World", "Sun", "Sun", "Hello", "World"});

		assertThat(actualResult, is(expectedResult));
	}
}