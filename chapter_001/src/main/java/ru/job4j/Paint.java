package ru.job4j;

/**
 * Paint class.
 * @author Sergey Dubouski
 * @version 1.0
 * @since 14.01.2017
*/
public class Paint {

	/**
	 * the method draws a pyramid.
	 * @param h - the pyramid's height.
	*/
	public void paint(int h) {

		StringBuilder stringPyramid = new StringBuilder();

		//to create the pick of a triangle
		for (int i = 0; i < h; i++ ) {
			stringPyramid.append(" ");
		}
		stringPyramid.append(String.format("^%s",System.getProperty("line.separator")));

		//to create the left and right side of a triangle
		for (int i = h; i < h * 2; i++) {
			int k = 0;
			for ( int j = 0; j < h * 2 - i - 1; j++) {
				k++;
				stringPyramid.append(" ");
			}
			stringPyramid.append("^");

			for (int j = 0; j < i - k; j++) {
				stringPyramid.append(" ");
			}
			stringPyramid.append(String.format("^%s",System.getProperty("line.separator")));
		}

		System.out.println(stringPyramid.toString());
	}
}



