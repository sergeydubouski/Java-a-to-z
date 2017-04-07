package ru.job4j.tracker.start;

/**
 * class StartUi.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 01.04.2017.
*/
class StartUi {
	/**
	 * ConsoleInput object.
	*/
	private ConsoleInput consoleInput = new ConsoleInput();
	/**
	 * Menu object.
	*/
	private Menu menu = new Menu();
	/**
	 * Action object.
	*/
	private Action action = new Action();
	/**
	 * constructor.
	*/
	StartUi() {
		super();
	}
	/**
	 * the method initializes the application.
	*/
	void init() {
		String userInput = " ";
		while (!userInput.equals(Action.EXIT_PROGRAM_NUMBER)) {
			this.menu.displayMenuItems();
			userInput = this.consoleInput.ask("SELECT: ");
			this.action.actionToPerform(userInput);
		}
	}
	/**
	 * main method.
	 * @param args - args.
	*/
	public static void main(String[] args) {
		StartUi startUi = new StartUi();
		startUi.init();
	}
}