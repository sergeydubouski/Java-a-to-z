package ru.job4j;

/**
 * class FlipArray.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 20.01.2017.
*/
class FlipArray {

	/**
	 * the method flips an array 90 degree.
	 * @param arrayIn - array to flip.
	 * @return - return flipped array.
	*/
	public int[][] flip(int[][] arrayIn) {

		int[][] arrayOut = new int[arrayIn.length][arrayIn.length];

		for (int i = 0; i < arrayOut.length; i++) {
			for (int j = 0; j < arrayOut.length; j++) {
				arrayOut[j][arrayOut.length - i - 1] = arrayIn[i][j];
			}
		}
		return arrayOut;
	}
}