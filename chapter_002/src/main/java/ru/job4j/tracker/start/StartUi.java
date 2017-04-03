package ru.job4j.tracker.start;

/**
 * class StartUi.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 01.04.2017.
*/
public class StartUi {

	Tracker tracker = new Tracker();
	ConsoleInput consoleInput = new ConsoleInput();
	private String userInput = null;

/** 
 * the method starts the application.
 * @param args - user's input.
*/
	public static void main(String[] args){
		
		StartUi startUi = new StartUi();		

		while(userInput != "6") {
			Menu.displayMenuItems();
		}
	}
}