package ru.job4j.test;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Sergey Dubouski
 * @version $id$
 * @since 16.05.2017
*/
public class ChessTest {

	/**
	 * Test.
	*/
	@Test
	public void whenAddNewItemThenTrackerHasSameItem() {
		Tracker tracker = new Tracker();
		StartUi startUi = new StartUi(tracker, new StubInput(new String[] {"0", "first item", "first description", "y"}));
		startUi.init();
		assertThat(tracker.findAll()[0].getName(), is("first item"));
	}
	/**
	 * Test.
	*/
	@Test
	public void whenUpdatedItemThenTrackerHasUpdatedItem() {
		Tracker tracker = new Tracker();
		tracker.add(new Item(1, "first item", "first description")); // add an item
		StartUi startUi = new StartUi(tracker, new StubInput(new String[] {"2", "1", "updated item's name", "updated item's description", "y"}));
		startUi.init();
		assertThat(tracker.findAll()[0].getName(), is("updated item's name"));
	}
	/**
	 * Test.
	*/
	@Test
	public void whenDeletedItemThenTrackerDoesNotHaveTheItem() {
		Tracker tracker = new Tracker();
		tracker.add(new Item(1, "first item", "first description")); // add first item
		tracker.add(new Item(2, "second item", "second description")); // add second item
		StartUi startUi = new StartUi(tracker, new StubInput(new String[] {"3", "1", "y"}));
		startUi.init();
		assertThat(tracker.findAll()[0].getName(), is("second item"));
	}
	/**
	 * Test.
	*/
	@Test
	public void whenFindItemByIdThenTrackerHasTheItem() {
		Tracker tracker = new Tracker();
		tracker.add(new Item(1, "first item", "first description")); // add first item
		StartUi startUi = new StartUi(tracker, new StubInput(new String[] {"1"}));
		assertThat(tracker.findById("1").getName(), is("first item"));
	}
	/**
	 * Test.
	*/
	@Test
	public void whenFindItemByNameThenTrackerHasTheItem() {
		Tracker tracker = new Tracker();
		tracker.add(new Item(1, "first item", "first description")); // add first item
		StartUi startUi = new StartUi(tracker, new StubInput(new String[] {"first item"}));
		assertThat(tracker.findByName("first item")[0].getName(), is("first item"));
	}
}