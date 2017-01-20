package ru.job4j;

/**
 * class SortArray.
 * @author Sergey Dubouski
 * @version 1.0
 * @since 19.01.2017
*/
class SortArray {

	/**
	 * the method sorts an one-dimensional array in ascending order.
	 * @param arrayIn - one-dimensional array arrayIn.
	 * @return - sorted arrayIn.
	*/
	public int[] sort(int[] arrayIn) {
	boolean flag = true;

		while (flag) {
			flag = false;

			for (int i = 0; i < arrayIn.length - 1; i++) {
				int tempStorage = 0;

				if (arrayIn[i] < arrayIn[i + 1]) {
					tempStorage = arrayIn[i];
					arrayIn[i] = arrayIn[i + 1];
					arrayIn[i + 1] = tempStorage;
					flag = true;
				}
			}
		}
      	return arrayIn;
	}
}