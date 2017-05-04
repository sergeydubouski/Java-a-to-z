package ru.job4j.tracker.start;

import java.util.Scanner;

/**
 * class ValidateInput.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 03.05.2017
*/
class ValidateInput extends ConsoleInput {
	/**
	 * constructor.
	*/
	ValidateInput() {
		super();
	}

	/**
	 * the method ask a question to a user.
	 * @param question - question to ask.
	 * @return - return the user' answer.
	*/
	public String ask(String question, String[] range) {
		try {
			return super.ask(question, range);
		} catch (MenuOutOfRangeException moe) {
			System.out.print(moe);
		}
	}
}