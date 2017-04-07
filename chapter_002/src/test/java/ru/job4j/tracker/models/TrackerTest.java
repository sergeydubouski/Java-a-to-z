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
		assertThat(tracker.findAll()[0], is(item));
	}
	/**
	 * Test.
	*/
	@Test
	public void whenUpdateItemThenTrackerHasSameItem() {
		Item originalItem = new Item(1L, "original item", "original description");
		Item updatedItem = new Item(1L, "updated item", "updated description");
		Tracker tracker = new Tracker();
		tracker.add(originalItem);
		tracker.update(updatedItem);
		assertThat(tracker.findAll()[0], is(updatedItem));
	}
	/**
	 * Test.
	*/
	@Test
	public void whenUpdateItemThenTrackerHasOriginalItem() {
		Item originalItem = new Item(1L, "original item", "original description");
		Item updatedItem = new Item(2L, "updated item", "updated description");
		Tracker tracker = new Tracker();
		tracker.add(originalItem);
		tracker.update(updatedItem);
		assertThat(tracker.findAll()[0], is(originalItem));
	}
	/**
	 * Test.
	*/
	@Test
	public void whenDeleteItemThenTrackerDoesNotHaveThatItem() {
		final long firstId = 1L;
		final long secondId = 2L;
		final long itemToDeleteId = 3L;
		Item firstItem = new Item(firstId, "first item", "first description");
		Item secondItem = new Item(secondId, "second item", "second description");
		Item itemToDelete = new Item(itemToDeleteId, "deleted item", "deleted item description");
		Tracker tracker = new Tracker();
		tracker.add(firstItem);
		tracker.add(secondItem);
		tracker.add(itemToDelete);
		tracker.delete(itemToDelete);
		assertThat(tracker.findAll().length, is(2));
	}
	/**
	 * Test.
	*/
	@Test
	public void whenFindAllThenTrackerResturnsAllItems() {
		final long firstId = 1L;
		final long secondId = 2L;
		final long thirdId = 3L;
		final int expectedLengthOfArray = 3;
		Item firstItem = new Item(firstId, "first item", "first description");
		Item secondItem = new Item(secondId, "second item", "second description");
		Item thirdItem = new Item(thirdId, "third item", "third item description");
		Tracker tracker = new Tracker();
		tracker.add(firstItem);
		tracker.add(secondItem);
		tracker.add(thirdItem);
		assertThat(tracker.findAll().length, is(expectedLengthOfArray));
	}
	/**
	 * Test.
	*/
	@Test
	public void whenFindItemsByNameThenTrackerResturnsFoundItems() {
		final long firstId = 1L;
		final long secondId = 2L;
		final long thirdId = 3L;
		Item firstItem = new Item(firstId, "first item", "first description");
		Item secondItem = new Item(secondId, "second item", "second description");
		Item thirdItem = new Item(thirdId, "third item", "third item description");
		Tracker tracker = new Tracker();
		tracker.add(firstItem);
		tracker.add(secondItem);
		tracker.add(thirdItem);
		assertThat(tracker.findByName("second item")[0], is(secondItem));
	}
	/**
	 * Test.
	*/
	@Test
	public void whenFindItemsByIdThenTrackerResturnsFoundItems() {
		final long firstId = 1L;
		final long secondId = 2L;
		final long thirdId = 3L;
		Item firstItem = new Item(firstId, "first item", "first description");
		Item secondItem = new Item(secondId, "second item", "second description");
		Item thirdItem = new Item(thirdId, "third item", "third item description");
		Tracker tracker = new Tracker();
		tracker.add(firstItem);
		tracker.add(secondItem);
		tracker.add(thirdItem);
		assertThat(tracker.findById("3"), is(thirdItem));
	}
	/**
	 * Test.
	*/
	@Test
	public void whenFindItemsByIdThenTrackerResturnsNull() {
		final long firstId = 1L;
		final long secondId = 2L;
		final long thirdId = 3L;
		final String expectedResultNull = null;
		Item firstItem = new Item(firstId, "first item", "first description");
		Item secondItem = new Item(secondId, "second item", "second description");
		Item thirdItem = new Item(thirdId, "third item", "third item description");
		Tracker tracker = new Tracker();
		tracker.add(firstItem);
		tracker.add(secondItem);
		tracker.add(thirdItem);
		assertThat(tracker.findById("4"), is(expectedResultNull));
	}
}