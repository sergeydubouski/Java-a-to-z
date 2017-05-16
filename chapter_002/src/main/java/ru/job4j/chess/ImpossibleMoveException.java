package ru.job4j.chess;

/**
 * class ImpossibleMoveException.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 14.05.2017.
*/
public class ImpossibleMoveException extends RuntimeException {
	/**
	 * constructor.
	 * @param msg - message to display.
	*/
	public ImpossibleMoveException(String msg) {
		super(msg);
	}
}