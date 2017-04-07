package ru.job4j.tracker.start;

import java.util.Scanner;

/**
 * class ConsoleInput.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 03.04.2017
*/
class ConsoleInput implements Input {
	/**
	 * constructor.
	*/
	ConsoleInput() {
		super();
	}

	/**
	 * scanner object containing console input stream.
	*/
	private Scanner scanner = new Scanner(System.in);

	/**
	 * the method ask a question to a user.
	 * @param question - question to ask.
	 * @return - return the user' answer.
	*/
	public String ask(String question) {
		System.out.print(question);
		return this.scanner.nextLine();
	}
}