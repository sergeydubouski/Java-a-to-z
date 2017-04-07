package ru.job4j.tracker.start;

/**
 * interface Input.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 01.04.2017.
*/
public interface Input {

	/**
	 * the method ask a question to a user.
	 * @param question - question to ask.
	 * @return - return the user' answer.
	*/
	String ask(String question);
}