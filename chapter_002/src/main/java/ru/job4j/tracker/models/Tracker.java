package ru.job4j.tracker.models;

/**
 * class Tracker.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 26.03.2017.
*/
public class Tracker
{
	private Item[] items = new Item[10];
	private int numberOfItems = 0;
/**
 * constructor.
*/	
	public Tracker()
	{
		super();
	}
/**
 * the method add an item to the array of items.
 * @param item - item to add.
 * @return - return the item.
*/
	public Item add(Item item)
	{
		items[numberOfItems++] = item;			
		return item;
	}
/**
 * the method overwrite an item from the array of items.
 * @param item - item to write.
 * @return - return the item.
*/
	public void update(Item item)
	{
		int count = -1;
		for(Item element : items)
		{
			count++;
			if(element.getId().equals(item.getId()))
			{
				items[count] = item;
			}
		}
	}
/**
 * the method delete an item from the array of items.
 * @param item - item to delete.
*/
	public void delete(Item item)
	{
		int count = 0;
		for(Item element : this.items)
		{
			count++;
			if(element != null && element.getId().equals(item.getId()))
			{
				if(count != this.items.length)
				{
					System.arraycopy(this.items, count, this.items, count - 1, this.items.length - count);
					this.items[this.items.length - 1] = null;
					this.numberOfItems--;
				}
				else
				{
					this.items[count - 1] = null;
					this.numberOfItems--;				
				}
			}
		}
	}
/**
 * the method finds all items in the array of items.
 * @return - return all items from the array of items.
*/
	public Item[] findAll()
	{
		return foundItems;
	}
/**
 * the method finds an item by name from the array of items.
 * @param key - name of the item to find.
 * @return - return an array of found items.
*/
	public Item[] findByName(String key)
	{
		return foundItems;
	}
/**
 * the method finds an item by id from the array of items.
 * @param id - id of the item to find.
 * @return - return a found item of found items.
*/
	public Item findById(String id)
	{
		return foundItems;
	}
}