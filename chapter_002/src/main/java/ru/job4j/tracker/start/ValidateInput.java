package ru.job4j.tracker.start;

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
	 * @param range - range of menu options.
	 * @return - return the user' answer.
	*/
	public String ask(String question, String[] range) {
		String userInput = " ";
		boolean invalid = true;
		do {
			try {
				userInput = super.ask(question, range);
				invalid = false;
			} catch (MenuOutOfRangeException moe) {
				System.out.println(moe.getMessage());
			}
		} while (invalid);
		return userInput;
	}
}