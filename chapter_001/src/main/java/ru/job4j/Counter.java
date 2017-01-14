package ru.job4j;

/**
 * Counter class.
 * @author Sergey Dubouski
 * @version 1.0
 * @since 12.01.2017
*/
public class Counter {

	/**
	 * the method calculates a sum of even numbers within a given range.
	 * @param start - first number of the range.
	 * @param finish - last number of the range.
	 * @return - return the sum of even numbers within the range.
	*/
	public int add(int start, int finish) {

		int sum = 0;
		for (int i = start + 1; i < finish; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}
}