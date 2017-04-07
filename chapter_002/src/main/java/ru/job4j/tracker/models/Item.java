package ru.job4j.tracker.models;

/**
 * class Item.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 26.03.2017.
*/
public class Item {
	/**
	 * id of an item.
	*/
	private long id;
	/**
	 * name of an item.
	*/
	private String name;
	/**
	 * description of an item.
	*/
	private String description;

	/**
	 * constructor.
	 * @param id - id of the item.
	 * @param name - name of the item.
	 * @param description - description of the item.
	*/
	public Item(long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	/**
	 * the method gets the id of an item.
	 * @return - return the id of an item.
	*/
	public long getId() {
		return this.id;
	}
	/**
	 * the method gets the name of an item.
	 * @return - return the name of an item.
	*/
	public String getName() {
		return this.name;
	}
	/**
	 * the method gets the description of an item.
	 * @return - return the description of an item.
	*/
	public String getDescription() {
		return this.description;
	}
	/**
	 * the method sets the name of an item.
	 * @param name - name of an item.
	*/
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * the method sets the description of an item.
	 * @param description - description of an item.
	*/
	public void setDescription(String description) {
		this.description = description;
	}
}