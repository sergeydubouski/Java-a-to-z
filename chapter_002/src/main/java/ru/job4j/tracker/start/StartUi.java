package ru.job4j.tracker.start;

import ru.job4j.tracker.models.Tracker;
//import ru.job4j.tracker.models.Item;

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
	/**
	 * the variable contains user input to exit the program.
	*/
	//public static final String EXIT_PROGRAM_NUMBER = "6";
	/**
	 * constructor.
	*/
	StartUi() {
		super();
	}
	/**
	 * init method.
	*/
	void init() {
		Input input = new ConsoleInput();
		MenuTracker menu = new MenuTracker(new Tracker(), input);
		menu.fillActions();
		do {
			menu.displayMenu();
			key = input.ask("SELECT: ");
			menu.perform(key);
		} while (!"y".equals(this.input.ask("Enter y to exit the program")));
	}
	/**
	 * main method.
	 * @param args - args.
	*/
	public static void main(String[] args) {
		new startUi.init();
	}
	/**
	 * the method initializes the application.
	*/
	/*void init() {
		String userInput = " ";
		while (!userInput.equals(StartUi.EXIT_PROGRAM_NUMBER)) {
			this.menu.displayMenuItems();
			userInput = this.consoleInput.ask("SELECT: ");
			switch (userInput) {
				case "0":
					this.addNewItem();
					break;
				case "1":
					this.showAllItems();
					break;
				case "2":
					this.editItem();
					break;
				case "3":
					this.deleteItem();
					break;
				case "4":
					this.findItemById();
					break;
				case "5":
					this.findItemsByName();
					break;
				case "6":
					System.out.println(ConsoleOutput.PROGRAM_SHUT_DOWN_MSG.getMessage());
					break;
				default:
					System.out.println(ConsoleOutput.INVALID_INPUT_MSG.getMessage());
			}
		}
	}*/
	/**
	 * Menu object.
	*/
	//private Menu menu = new Menu();
}