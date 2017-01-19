package ru.job4j;

/**
 * Turn class.
 * @author Sergey Dubouski
 * @version 1.0
 * @since 19.01.2017
*/
public class Turn {

	/**
	 * the method swaps the integer array.
	 * @param arrayIn - array arrayIn.
	 * @return - return arrayIn.
	*/
	public int[] back(int[] arrayIn) {

		for (int i = 0; i < arrayIn.length / 2; i++) {
			int tempStorage = 0;
			tempStorage = arrayIn[i];
			arrayIn[i] = arrayIn[arrayIn.length - i - 1];
			arrayIn[arrayIn.length - i - 1]  = tempStorage;
		}

		return arrayIn;
	}
}