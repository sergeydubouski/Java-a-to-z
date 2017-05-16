package ru.job4j.chess;

/**
 * class OccupiedCellException.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 14.05.2017.
*/
public class OccupiedCellException extends RuntimeException {
	/**
	 * constructor.
	 * @param msg - message to display.
	*/
	public OccupiedCellException(String msg) {
		super(msg);
	}
}