package ru.job4j.chess;

/**
 * class Figure.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 14.05.2017.
*/
abstract class Figure {
	/**
	 * variable contains a cell occupied by the figure.
	*/
	private final Cell cell;
	/**
	 * constructor.
	 * @param cell - cell object.
	*/
	Figure(Cell cell) {
		this.cell = cell;
	}
	/**
	 * method defines a figure's path way from the source to a destination cell.
	 * @param dest - a destination cell.
	 * @return - array of cell of the path way.
	*/
	public abstract Cell[] way(Cell dest);
	/**
	 * method clones the object.
	 * @param dest - a destination cell.
	 * @return - a Bishop object.
	*/
	public abstract Figure clone(Cell dest);
}