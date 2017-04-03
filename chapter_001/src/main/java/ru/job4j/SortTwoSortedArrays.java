package ru.job4j;

/**
 * class SortTwoSortedArrays.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 05.02.2017.
 */
class SortTwoSortedArrays {

	/**
	 * the method creates a sorted array from two sorted arrays.
	 * @param arrFirst - first sorted array.
	 * @param arrSecond - second sorted array.
	 * @return - return combined sorted array.
	 */
	public int[] sort(int[] arrFirst, int[] arrSecond) {

		final int[] arrCombined = new int[arrFirst.length + arrSecond.length];
		int count = 0; // it counts total number of elements already placed in the combined sorted array.
		int countArrFirst = 0; // it counts a number of elements placed in the combined sorted array from arrFirst.
		int countArrSecond = 0; // it counts a number of elements placed in the combined sorted array from arrSecond.

		// it creates a combined sorted array from two sorted arrays.
		for (int i = 0; i < arrFirst.length; i++) {
			for (int j = countArrSecond; j < arrSecond.length; j++) {
				if (arrFirst[i] > arrSecond[j]) {
					arrCombined[count] = arrSecond[j];
					countArrSecond++;
					count++;
				} else if (arrFirst[i] < arrSecond[j]) {
					arrCombined[count] = arrFirst[i];
					count++;
					countArrFirst++;
					break;
				} else {
					arrCombined[count] = arrSecond[j];
					count++;
					countArrFirst++;
					break;
				}
			}
		}

		// it adds last elements from arrFirst or arrSecond that do not require sorting in preceding sorting operation.
		if (countArrSecond == arrSecond.length) {
			int k = 0;
			for (int i = countArrFirst; i < arrFirst.length; i++) {
				arrCombined[count + k] = arrFirst[i];
				k++;
			}
		} else {
			int m = 0;
			for (int i = countArrSecond; i < arrSecond.length; i++) {
				arrCombined[count + m] = arrSecond[i];
				m++;
			}
		}
		return arrCombined;
	}
}