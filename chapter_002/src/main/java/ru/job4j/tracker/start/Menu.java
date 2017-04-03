package ru.job4j.tracker.start;

/**
 * class Menu.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 01.04.2017.
*/
public class Menu {
/**
 * menu for a user.
*/
	private static final String[] MENU_ITEMS = {"0. Add new item",
												"1. Show all items",
												"2. Edit item",
												"3. Delete item",
												"4. Find item by id",
												"5. Find item by name",
												"6. Exit program",
											   };

/**
 * the method displays a menu.
*/
	public static void displayMenuItems(){
		for(String element : this.menu){
			System.out.println(element);
		}
	}
}