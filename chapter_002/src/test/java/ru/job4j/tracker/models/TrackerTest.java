package ru.job4j.tracker.models;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Sergey Dubouski
 * @version $id$
 * @since 29.03.2017
*/
public class TrackerTest {

	/**
	 * Test.
	*/
	@Test
	public void whenAddNewItemThenTrackerHasSameItem() {
		Item item = new Item(1L, "first item", "first description");
		Tracker tracker = new Tracker();
		tracker.add(item);
		assertThat(tracker.getAll()[0], is(item));
	}
}