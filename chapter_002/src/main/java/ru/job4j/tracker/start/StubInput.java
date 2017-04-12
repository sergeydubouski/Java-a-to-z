package ru.job4j.tracker.start;

/**
 * class StubInput.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 10.04.2017
*/
public class StubInput implements Input {
	/**
	 * the variable contains answers.
	*/
	private String[] answers;
	/**
	 * the variable contains a position in the answers' array.
	*/
	private int position = 0;
	/**
	 * constructor.
	 * @param answers - answers' array.
	*/
	public StubInput(String[] answers) {
		super();
		this.answers = answers;
	}
	/**
	 * the method returns an answer.
	 * @param question - question.
	 * @return - return an answer.
	*/
	public String ask(String question) {
		return this.answers[position++];
	}
}