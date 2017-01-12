package ru.job4j;

/**
 * Point class.
 * @author Sergey Dubouski
 * @version 1.0
 * @since 10.01.2017
*/
public class Point {

	/**
	 * the variable contains x-coordinates of a point.
	*/
	private double x;

	/**
	 * the variable contains y-coordinate of a point.
	*/
	private double y;

	/**
	 * constructor sets x and y coordinates of a point.
	 * @param x - x coordinate is set.
	 * @param y - y coordinate is set.
	*/
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * the method calculates a distance between two points.
	 * @param point - it's a reference variable to an object of a Point class.
	 * @return - return a distance between two points.
	*/
	public double distanceTo(Point point) {
		double distance = Math.sqrt(Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2));
		return distance;
	}
}