package ru.job4j.tracker.start;

/**
 * class MenuOutOfRangeException.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 03.05.2017.
*/
public class MenuOutOfRangeException extends RuntimeException {
	/**
	 * constructor.
	 * @param msg - message to display.
	*/
	public MenuOutOfRangeException(String msg) {
		super(msg);
	}
}