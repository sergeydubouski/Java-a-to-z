package ru.job4j.chess;

/**
 * class Board.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 14.05.2017.
*/
 class Board {
	/**
	 * variable contains a maximum size of the board's game field.
	*/
	public static final MAX_SIZE = 8;
	/**
	 * variable contains all figures on the board in the game.
	*/
	Figure[][] figures = new Figure[MAX_SIZE][MAX_SIZE];
	/**
	 * method adds a figure to the figures arrays.
	 * @param figure - new figure to the game.
	 * @param posX - figure's x position.
	 * @param posY - figure's y position.
	 * @return Figure - added figure's object.
	*/
	public Figure addFigure(Figure figure, int posX, int PosY) {
		if (this.figure[posX][posY] != null) {
			throw new OccupiedCellException("CELL IS ALREADY OCCUPIED");
		}
		this.figures[posX][posY] = figure;
		return this.figures[posX][posY];
	}
	/**
	 * method deletes a figure from the figures arrays.
	 * @param posX - figure's x position.
	 * @param posY - figure's y position.
	 * @return - deleted figure's object.
	*/
	public Figure deleteFigure(int posX, int PosY) {
		if (this.figure[posX][posY] == null) {
			throw new FigureNotFoundException("CELL IS ALREADY EMPTY");
		}
		Figure deletedFigure = this.figures[posX][posY];
		this.figures[posX][posY] = null;
		return deletedFigure;
	}
	/**
	 * method moves a figure.	
	 * @param source - source cell.
	 * @param dest - destination cell.
	 * @return - boolean.
	*/
	public boolean move(Cell source, Cell dest) {
		if (this.figures[source.getPosX][source.getPosY] == null) {
			throw new FigureNotFoundException("CELL IS EMPTY");
		}
		Cell[] pathCells = this.figures[source.getPosX][source.getPosY].way(dest);
		for (cell : pathCells) {
			if (this.figures[cell.getPosX][cell.getPosY] != null) {
				throw new OccupiedWayException("PATH WAY IS BLOCKED");
			}
		}
		this.figures[dest.getPosX][dest.getPosY] = this.figures[source.getPosX][source.getPosY].clone(dest);
		this.deleteFigure([source.getPosX][source.getPosY]);
		return true;
	}
}