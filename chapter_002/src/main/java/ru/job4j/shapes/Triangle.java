package ru.job4j.shapes;

/**
 * class Triangle.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 12.04.2017
*/
class Triangle implements Shape {
	/**
	 * the method creates a geometric figure.
	 * @return - shape of a geometric figure.
	*/
	public String pic() {
		return String.format("%4s*%s %2s*%1s*%s %1s*%3s*%s *******", " ", System.getProperty("line.separator"), " ", " ", System.getProperty("line.separator"), " ", " ", System.getProperty("line.separator"));
	}
}