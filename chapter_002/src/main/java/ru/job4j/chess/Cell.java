package ru.job4j.chess;

/**
 * class Cell.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 14.05.2017.
*/
public class Cell {
	/**
	 * variable name contains a x position.
	*/
	private int posX;
	/**
	 * variable name contains a y position.
	*/
	private int posY;
	/**
	 * consructor.
	 * @param posX - x position.
	 * @param posY - y position.
	*/
	public Cell(int posX, int posY) {
		super();
		this.posX = posX;
		this.posY = posY;
	}
	/**
	 * method returns the x position.
	 * @return - x position.
	*/
	public int getPosX() {
		return this.posX;
	}
	/**
	 * method returns the y position.
	 * @return - y position.
	*/
	public int getPosY() {
		return this.posY;
	}
	/**
	 * method sets the x position.
	 * @param posX - x position.
	*/
	public void setPosX(int posX) {
		this.posX = posX;
	}
	/**
	 * method sets the y position.
	 * @param posY - y position.
	*/
	public void setPosY(int posY) {
		this.posY = posY;
	}
}