package ru.job4j.tracker.start;

/**
 * interface BaseAction.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 07.05.2017.
*/
public abstract class BaseAction implements UserAction {
	/**
	 * constructor.
	 * @param name - name.
	*/
	public BaseAction(String name) {

	}
	/**
	 * the method returns a key.
	 * @return - key.
	*/
	abstract int key() {

	}
	/**
	 * the method exectutes a user's request.
	*/
	abstract void execute() {

	}
	/**
	 * the method returns an action's description.
	 * @return - description.
	*/
	abstract String info() {

	}
}