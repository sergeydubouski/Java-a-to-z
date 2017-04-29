package ru.job4j.tracker.start;

import ru.job4j.tracker.models.Tracker;

/**
 * class StartUi.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 01.04.2017.
*/
public class StartUi {
	/**
	 * Tracker object.
	*/
	private Tracker tracker;
	/**
	 * Input object.
	*/
	private Input input;
	/**
	 * constructor.
	 * @param tracker - tracker.
	 * @param input - input.
	*/
	StartUi(Tracker tracker, Input input) {
		super();
		this.tracker = tracker;
		this.input = input;
	}
	/**
	 * init method.
	*/
	void init() {
		MenuTracker menu = new MenuTracker(this.tracker, this.input);
		menu.fillActions();
		do {
			menu.displayMenu();
			menu.perform(input.ask("SELECT: "));
		} while (!"y".equals(input.ask("Enter y to exit the program: ")));
	}
	/**
	 * main method.
	 * @param args - args.
	*/
	/*public static void main(String[] args) {
		new StartUi(new Tracker(), new ConsoleInput()).init();
	}*/
}