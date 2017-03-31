package ru.job4j.tracker.models;

/**
 * class Tracker.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 26.03.2017.
*/
public class Tracker {

/**
 * items' array's size.
*/
	private static final int MAX_NUMBER_OF_ITEMS = 10;
/**
 * array of items.
*/
	private final Item[] items = new Item[MAX_NUMBER_OF_ITEMS];
/**
 * added items to the items' array.
*/
	private int addedItems = 0;
/**
 * constructor.
*/
	public Tracker() {
		super();
	}
/**
 * the method adds an item to the items' array.
 * @param item - item to add.
 * @return - return the item.
*/
	public Item add(Item item) {
		this.items[this.addedItems++] = item;
		return item;
	}
/**
 * the method replaces an item in the items' array.
 * @param item - item to place.
*/
	public void update(Item item) {
		int count = -1;
		for (int i = 0; i != this.addedItems; i++) {
			if (this.items[i].getId() == item.getId()) {
				this.items[i] = item;
			}
		}
	}
/**
 * the method deletes an item in the items' array.
 * @param item - item to delete.
*/
	public void delete(Item item) {
		int count = 0;
		for (Item element : this.items) {
			count++;
			if (element != null && element.getId() == item.getId()) {
				if (count != this.items.length) {
					System.arraycopy(this.items, count, this.items, count - 1, this.items.length - count);
					this.items[this.items.length - 1] = null;
					this.addedItems--;
				} else {
					this.items[count - 1] = null;
					this.addedItems--;
				 }
			}
		}
	}
/**
 * the method finds all items in the items' array.
 * @return - return all items from the items' array.
*/
	public Item[] findAll() {
		Item[] foundItems = new Item[this.addedItems];
		System.arraycopy(this.items, 0, foundItems, 0, this.addedItems);
		return foundItems;
	}
/**
 * the method finds an item by name in the items' array.
 * @param key - name of the item to find.
 * @return - return an array of found items.
*/
	public Item[] findByName(String key) {
		int numOfFoundItems = 0;
		Item[] foundItems = new Item[this.addedItems];
		for (int i = 0; i != addedItems; i++) {
			if (this.items[i].getName().equals(key)) {
				foundItems[numOfFoundItems++] = this.items[i];
			}
		}
		return foundItems;
	}
/**
 * the method finds an item by id in the items' array.
 * @param id - id of the item to find.
 * @return - return a found item.
*/
	public Item findById(String id) {
		Item result = null;
		for (int i = 0; i != this.addedItems; i++) {
			if (String.valueOf(this.items[i].getId()).equals(id)) {
				result = this.items[i];
			}
		}
		return result;
	}
}