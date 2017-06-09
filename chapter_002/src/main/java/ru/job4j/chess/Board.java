package ru.job4j.chess;

/**
 * class Board.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 14.05.2017.
*/
 public class Board {
	/**
	 * variable contains a maximum size of the board in x direction.
	*/
	public static final int X_MAX_SIZE = 8;
	/**
	 * variable contains a maximum size of the board in y direction.
	*/
	public static final int Y_MAX_SIZE = 8;
	/**
	 * variable contains all figures on the board with respect to its cell.
	*/
	private final Figure[][] figures;
	/**
	 * constructor.
	*/
	public Board() {
		super();
		this.figures = new Figure[Board.X_MAX_SIZE][Board.Y_MAX_SIZE];
	}
	/**
	 * method checks if a cell is occupied.
	 * @param cell - cell.
	 * @return - return boolean whether cell is occupied or not.
	*/
	private boolean occupied(Cell cell) {
		boolean isOccupied = true;
		if (this.figures[cell.getPosX()][cell.getPosY()] == null) {
			isOccupied == false;
		}
		return isOccupied;
	}	
	/**
	 * method adds a figure to the figures arrays.
	 * @param posX - x position of the cell.
	 * @param posY - y position of the cell.
	 * @param figure - new figure to the game.
	 * @return - added figure's object.
	 * @throws OccupiedCellException - throws runtimeException exception.
	*/
	public Figure addFigure(int posX, int posY, Figure figure) throws OccupiedCellException {
		if (this.figures[posX][posY] != null) {
			throw new OccupiedCellException("CELL IS ALREADY OCCUPIED");
		}
		this.figures[posX][posY] = figure;
		return figure;
	}
	/**
	 * method deletes a figure from the figures arrays.
	 * @param cell - the figures location.
	 * @return - deleted figure's object.
	 * @throws FigureNotFoundException - throws runtimeException exception.
	*/
	private Figure deleteFigure(Cell cell) throws FigureNotFoundException {
		if (!this.occupied(cell)) {
			throw new FigureNotFoundException("CELL IS ALREADY EMPTY");
		}
		Figure deletedFigure = this.figures[cell.getPosX()][cell.getPosY()];
		this.figures[cell.getPosX()][cell.getPosY()] = null;
		return deletedFigure;
	}
	/**
	 * method moves a figure.
	 * @param source - source cell.
	 * @param dest - destination cell.
	 * @return - boolean.
	 * @throws FigureNotFoundException - throws runtimeException exception.
	 * @throws OccupiedWayException - throws runtimeException exception.
	 * @throws ImpossibleMoveException - throws runtimeException exception.
	*/
	public boolean move(Cell source, Cell dest) throws FigureNotFoundException, OccupiedWayException, ImpossibleMoveException {
		if (!this.occupied(cell)) {
			throw new FigureNotFoundException("CELL IS EMPTY");
		}
		Cell[] pathCells = this.figures[source.getPosX()][source.getPosY()].way(dest);
		for (Cell cell : pathCells) {
			if (this.occupied(cell)) {
				throw new OccupiedWayException("CELL IS OCCUPIED");
			}
		}
		this.figures[dest.getPosX()][dest.getPosY()] = this.figures[source.getPosX()][source.getPosY()].clone(dest);
		this.deleteFigure(source);
		return true;
	}
}