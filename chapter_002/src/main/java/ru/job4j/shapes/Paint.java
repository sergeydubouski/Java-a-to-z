package ru.job4j.shapes;

/**
 * class Paint.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 12.04.2017
*/
class Paint {
	/**
	 * the method draws a geometric figure.
	 * @param shape - shape oblject.
	*/
	public void draw(Shape shape) {
		System.out.println(shape.pic());
	}
}