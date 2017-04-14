package ru.job4j.shapes;

/**
 * class Square.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 12.04.2017
*/
class Square implements Shape {
	/**
	 * the method creates a geometric figure.
	 * @return - shape of a geometric figure.
	*/
	public String pic() {
		return String.format("******%s******%s******%s******", System.getProperty("line.separator"), System.getProperty("line.separator"), System.getProperty("line.separator"));
	}
}