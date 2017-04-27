package ru.job4j.tracker.start;

/**
 * interface UserAction.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 26.04.2017.
*/
public interface UserAction {
	/**
	 * the method returns a key.
	 * @return - key.
	*/
	int key();
	/**
	 * the method exectutes a user's request.
	*/
	void execute();
	/**
	 * the method returns an action's description.
	 * @return - description.
	*/
	String info();
}