package ru.job4j;

/**
 * Paint class.
 * @author Sergey Dubouski
 * @version 1.0
 * @since 14.01.2017
*/
public class Paint {

	/**
	 * the method draws a piramid.
	 * @param h - the piramid's height.
	 * @return - piramid string.
	*/
	public String piramid(int h) {

		StringBuilder stringPiramid = new StringBuilder();

		//create the pick of a triangle
		for (int i = 0; i < h; i++) {
			stringPiramid.append(" ");
		}
		stringPiramid.append(String.format("^%s", System.getProperty("line.separator")));

		//create left and right sides of a triangle
		for (int i = h; i < h * 2 - 1; i++) {
			int k = 0;
			for (int j = 0; j < h * 2 - i - 1; j++) {
				k++;
				stringPiramid.append(" ");
			}
			stringPiramid.append("^");

			for (int j = 0; j < i - k; j++) {
				stringPiramid.append(" ");
			}
			stringPiramid.append(String.format("^%s", System.getProperty("line.separator")));
		}

		return (h > 0) ? stringPiramid.toString() : "Cannot create a piramid with the given height!";
	}
}