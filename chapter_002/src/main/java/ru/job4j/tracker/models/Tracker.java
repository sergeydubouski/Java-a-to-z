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
 * the method update an item from the array of items.
 * @param item - item to update.
 * @return - return the updated item.
*/
	public void update(Item item)
	{
		
	}
/**
 * the method delete an item from the array of items.
 * @param item - item to delete.
*/
	public void delete(Item item)
	{
		for(Item element : items)
		{
			int count = 0;
			if(element == item)
			{
				
			}
		}
		numberOfItems--;
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
/**
 * the method shifts an array to the left.
 * @param startIndex - index of an array from which sorting starts.
 * @return - return a sortedArray.
*/
	private Items[] sortArray(int startIndex)
	{
		for(int i = 0; i < items.length; i++)
		{
			if(items[i] == null)
			{
				for(int j = i; j < items.length - 1; j++)
				{
					items[j] = items[j + 1];
					items[j + 1] = null;
				}
			}
		}
		return items;
	}	
}