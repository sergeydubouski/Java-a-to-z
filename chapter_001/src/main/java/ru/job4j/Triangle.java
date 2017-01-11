package ru.job4j;

/**
 * Triangle class.
 * @author Sergey Dubouski
 * @version 1.0
 * @since 10.01.2017
*/
public class Triangle {

	/**
	 * the variable contains coordinates of apex-a of a triangle.
	*/
	private Point a;

	/**
	 * the variable contains coordinates of apex-b of a triangle.
	*/
	private Point b;

	/**
	 * the variable contains coordinates of apex-c of a triangle.
	*/
	private Point c;

	/**
	 * constructor sets coordinates of ech apex of a triangle.
	 * @param a - variable a.
	 * @param b - variable b.
	 * @param c - variable c.
	*/
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	 * the method calculates perimeter and area of a triangle.
	 * @return - return area of a triangle.
	*/
	public double area() {
	double ab = this.a.distanceTo(this.b);
	double bc = this.b.distanceTo(this.c);
	double ca = this.c.distanceTo(this.a);
		if ((ab * bc * ca) != 0) {
			double perimeter = (ab + bc + ca) / 2;
			double s = Math.sqrt(perimeter * (perimeter - ab) * (perimeter - bc) * (perimeter - ca));
			return s;
		} else {
			return 0;
			}
	}
}