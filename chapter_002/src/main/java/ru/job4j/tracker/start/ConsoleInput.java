package ru.job4j.tracker.start;

/**
 * class ConsoleInput;
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 03.04.2017 
*/

class ConsoleInput implements Input {

/**
 * scanner object containing console input stream.
*/	
	Scanner scanner = new Scanner(System.in);

/**
 * the method ask a question to a user.
 * @param question - question to ask.
 * @return - return the user' answer.
*/
	String ask(String question) {
		System.out.print(question);
		return scanner;
	}
}