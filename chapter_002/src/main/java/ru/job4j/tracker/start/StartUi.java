package ru.job4j.tracker.start;

/**
 * class StartUi.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 01.04.2017.
*/
public class StartUi {
/**
 * items' array's size.
*/
	private final String[] menu = {"0. Add new item",
										  "1. Show all items",
										  "2. Edit item",
										  "3. Delete item",
										  "4. Find item by id",
								          "5. Find item by name",
										  "6. Exit program",
										  "Select: ",
								  };
	void displayMenu(){
		for(String element : this.menu){
			System.out.println(element);
		}
	}
/**
 * the method starts the application.
 * @param args - user's input.
*/
	public static void main(String[] args){
		StartUi startUi = new StartUi();
		Tracker tracker = new Tracker();
		
		private String userInput = null;
		while(userInput != "6") {
			startUi.displayMenu();
		}
	}
}