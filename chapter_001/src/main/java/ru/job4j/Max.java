package ru.job4j;

/**
 * Max class.
 * @author Sergey Dubouski
 * @version 1.0
 * @since 11.01.2017
*/
public class Max {

	/**
	 * the method chooses maximum value from two numbers.
	 * @param first - first number.
	 * @param second - second number.
	 * @return - return maximum value.
	*/
	public int max(int first, int second) {
		return (first > second) ? first : second;
	}

	/**
	 * the method chooses maximum value from three numbers.
	 * @param first - first number.
	 * @param second - second number
	 * @param third - third number.
	 * @return - return maximum value.
	*/
	public int max(int first, int second, int third) {
		return max(max(first, second), third);
	}
}
