package ru.job4j;

import java.util.Arrays;

/**
 * class ClipArray.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 20.01.2017.
*/
class ClipArray {

	/**
	 * the method removes duplicates from an array.
	 * @param arrayIn - array to clip.
	 * @return - return clipped array.
	*/
	public String[] clip(String[] arrayIn) {

		int arrayOutLength = 0;
		boolean flag = true;

		//sort out the array
		for (int i = 0; i < arrayIn.length - 1; i++) {

			for (int j = i + 1; j < arrayIn.length; j++) {

				if (arrayIn[i] == arrayIn[j]) {

					for (int k = j; k < arrayIn.length - 1; k++) {
						arrayIn[k] = arrayIn[k + 1];
					}
				}
			}
		}

		//clip the array
		for (int i = 0; i < arrayIn.length - 1; i++) {

			for (int j = i + 1; j < arrayIn.length; j++) {

				if (arrayIn[i] == arrayIn[j] && flag) {
					arrayOutLength = j;
					flag = false;
				}
			}
		}
		String[] arrayOut = Arrays.copyOf(arrayIn, arrayOutLength);
		return arrayOut;
	}
}