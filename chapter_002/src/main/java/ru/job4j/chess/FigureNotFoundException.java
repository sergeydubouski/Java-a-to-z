package ru.job4j.tracker.start;

/**
 * class FigureNotFoundException.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 14.05.2017.
*/
public class FigureNotFoundException extends RuntimeException {
	/**
	 * constructor.
	 * @param msg - message to display.
	*/
	public FigureNotFoundException(String msg) {
		super(msg);
	}
}