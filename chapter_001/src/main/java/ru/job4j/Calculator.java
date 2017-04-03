package ru.job4j;

/**
 * Calculator class.
 * @author Sergey Dubouski
 * @version 1.0
 * @since 07.01.2017
*/
public class Calculator {

	/**
	 * variable contains results of computation.
	*/
	private double result;

	/**
	 * the method calculates addition of two numbers.
	 * @param first - it's a first argument
	 * @param second - it's a second argument
	*/
	public void add(double first, double second) {
		this.result = first + second;
	}

	/**
	 * the method calculates subtraction of two numbers.
	 * @param first - it's a first argument
	 * @param second - it's a second argument
	*/
	public void subtract(double first, double second) {
		this.result = first - second;
	}

	/**
	 * the method calculates multiplication of two numbers.
	 * @param first - it's a first argument
	 * @param second - it's a second argument
	*/
	public void multiply(double first, double second) {
		this.result = first * second;
	}

	/**
	 * the method calculates division of two numbers.
	 * @param first - it's a first argument
	 * @param second - it's a second argument
	*/
	public void divide(double first, double second) {
		this.result = first / second;
	}

	/**
	 * the method returns the result of computation.
	 * @return result
	*/
	public double getResult() {
		return this.result;
	}
}