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

		int count = 0;

		for (int i = 0; i < arrayIn.length - count; i++) {

			for (int j = i + 1; j < arrayIn.length - count; j++) {

				if (arrayIn[i] == arrayIn[j]) {

					count += 1;

					for (int k = j; k < arrayIn.length - count; k++) {
						arrayIn[k] = arrayIn[k + 1];
					}

					j -= 1;
				}
			}
		}

		String[] arrayOut = Arrays.copyOf(arrayIn, arrayIn.length - count);
		return arrayOut;
	}
}