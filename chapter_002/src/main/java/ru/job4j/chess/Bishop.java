package ru.job4j.chess;

/**
 * class Bishop.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 14.05.2017.
*/
public class Bishop extends Figure {
	/**
	 * method defines a figure's path way from the source to a destination cell.
	 * @param dest - a destination cell.
	 * @return - array of cell of the path way.
	*/
	public Cell[] way(Cell dest) {
		int diffX = dest.getPosX() - this.cell.getPosX();
		int diffY = dest.getPosY() - this.cell.getPosY();
		Cell[] result = new Cell[Math.abs(diffX)];

		if ((Math.abs(diffX) != Math.abs(diffY)) || (diffX == 0)) {
			throw new ImpossibleMoveException("IMPOSSIBLE MOVE FOR THE BISHOP");
		}
		for (int i = 1; i != Math.abs(diffX) + 1; i++) {
			result[i-1] = new Cell(this.cell.getPosX() + i * (diffX / Math.abs(diffX)), this.cell.getPosY() + i * (diffY / Math.abs(diffY)));
		}
		return result;
	}
	/**
	 * method clones the object.
	 * @param cell - a new cell.
	 * @return - a Bishop object.
	*/
	public Bishop clone(Cell cell) {		
		return new Bishop(cell);
	}
}