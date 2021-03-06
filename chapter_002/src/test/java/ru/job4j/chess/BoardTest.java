package ru.job4j.chess;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Sergey Dubouski
 * @version $id$
 * @since 16.05.2017
*/
public class BoardTest {
	/**
	 * Test.
	*/
	@Test
	public void whenMoveFigureThenItMoved() {
		Board board = new Board();
		final int sourcePosX = 3;
		final int sourcePosY = 1;
		final int destPosX = 6;
		final int destPosY = 4;
		board.addFigure(sourcePosX, sourcePosY, new Bishop(new Cell(sourcePosX, sourcePosY)));
		boolean result = board.move(new Cell(sourcePosX, sourcePosY), new Cell(destPosX, destPosY));
		assertThat(result, is(true));
	}
	/**
	 * Test.
	*/
	@Test
	public void whenAddFigureThenOccupiedCellException() {
		Board board = new Board();
		final int fig1PosX = 3;
		final int fig1PosY = 1;
		final int fig2PosX = 3;
		final int fig2PosY = 1;
		String result = " ";
		board.addFigure(fig1PosX, fig1PosY, new Bishop(new Cell(fig1PosX, fig1PosY)));
		try {
			board.addFigure(fig2PosX, fig2PosY, new Bishop(new Cell(fig2PosX, fig2PosY)));
		} catch (OccupiedCellException ocex) {
			result = ocex.getMessage();
		}
		assertThat(result, is("CELL IS ALREADY OCCUPIED"));
	}
	/**
	 * Test.
	*/
	@Test
	public void whenMoveFigureThenFigureNotFoundException() {
		Board board = new Board();
		final int sourcePosX = 3;
		final int sourcePosY = 1;
		final int destPosX = 6;
		final int destPosY = 4;
		String result = " ";
		board.addFigure(sourcePosX, sourcePosY, new Bishop(new Cell(sourcePosX, sourcePosY)));
		try {
			board.move(new Cell(destPosX, destPosY), new Cell(sourcePosX, sourcePosY));
		} catch (FigureNotFoundException fnfex) {
			result = fnfex.getMessage();
		}
		assertThat(result, is("CELL IS EMPTY"));
	}
	/**
	 * Test.
	*/
	@Test
	public void whenMoveFigureThenOccupiedWayException() {
		Board board = new Board();
		final int sourcePosX = 3;
		final int sourcePosY = 1;
		final int destPosX = 6;
		final int destPosY = 4;
		final int midPosX = 5;
		final int midPosY = 3;
		String result = " ";
		board.addFigure(sourcePosX, sourcePosY, new Bishop(new Cell(sourcePosX, sourcePosY)));
		board.addFigure(midPosX, midPosY, new Bishop(new Cell(midPosX, midPosY)));
		try {
			board.move(new Cell(sourcePosX, sourcePosY), new Cell(destPosX, destPosY));
		} catch (OccupiedWayException owex) {
			result = owex.getMessage();
		}
		assertThat(result, is("CELL IS OCCUPIED"));
	}
	/**
	 * Test.
	*/
	@Test
	public void whenMoveFigureThenImpossibleMoveException() {
		Board board = new Board();
		final int sourcePosX = 3;
		final int sourcePosY = 1;
		final int destPosX = 3;
		final int destPosY = 2;
		String result = " ";
		board.addFigure(sourcePosX, sourcePosY, new Bishop(new Cell(sourcePosX, sourcePosY)));
		try {
			board.move(new Cell(sourcePosX, sourcePosY), new Cell(destPosX, destPosY));
		} catch (ImpossibleMoveException imex) {
			result = imex.getMessage();
		}
		assertThat(result, is("IMPOSSIBLE MOVE FOR THE BISHOP"));
	}
}