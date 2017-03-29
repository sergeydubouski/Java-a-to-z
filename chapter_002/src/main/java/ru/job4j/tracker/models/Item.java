package ru.job4j.tracker.models;
/**
 * class Item.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 26.03.2017.
*/
class Item
{
	private long id;
	private String name;
	private String description;
	
	Item()
	{
		super();
	}
	long getId()
	{
		return this.id;
	}
	String getName()
	{
		return this.name;
	}
	String getDescription()
	{
		return this.description;
	}
	String setId()
	{
		this.id = System.currentTimeMillis();
	}
	String setName(String name)
	{
		this.name = name;
	}
	String setDescription(String description)
	{
		this.description = description;
	}
}