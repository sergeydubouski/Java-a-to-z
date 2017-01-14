package ru.job4j;

/**
 * Factorial class.
 * @author Sergey Dubouski
 * @version 1.0
 * @since 14.01.2017
*/
public class Factorial {

	/**
	 * the method calculates factorial of a given number.
	 * @param number - number.
	 * @return - return factorial of a given number.
	*/
	public int calcFactorial(int number) {
		int result = 1;
		for (int i = 1; i <= number; i++) {
			result = result * i;
		}
		return (number >= 0) ? result : 0;
	}
}