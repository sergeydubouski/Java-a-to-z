package ru.job4j.tracker.start;

/**
 * class OccupiedWayException.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 14.05.2017.
*/
public class OccupiedWayException extends RuntimeException {
	/**
	 * constructor.
	 * @param msg - message to display.
	*/
	public OccupiedWayException(String msg) {
		super(msg);
	}
}