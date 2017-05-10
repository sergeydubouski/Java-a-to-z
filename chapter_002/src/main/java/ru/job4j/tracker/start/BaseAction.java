package ru.job4j.tracker.start;

/**
 * interface BaseAction.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 07.05.2017.
*/
public abstract class BaseAction implements UserAction {
	/**
	 * variable name contains a name of an action.
	*/
	private String name;
	/**
	 * variable key contains a number of an action.
	*/
	private int key;
	/**
	 * constructor.
	 * @param name - name.
	 * @param key - key.
	*/
	public BaseAction(String name, int key) {
		this.name = name;
		this.key = key;
	}
	/**
	 * the method returns info.
	 * @return - info.
	*/
	public String info() {
		return String.format("%s. %s", this.key, this.name);
	}
}