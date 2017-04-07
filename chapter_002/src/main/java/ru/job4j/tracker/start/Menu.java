package ru.job4j.tracker.start;

/**
 * class Menu.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 01.04.2017.
*/
class Menu {
	/**
	 * constructor.
	*/
	Menu() {
		super();
	}
	/**
	 * menu for a user.
	*/
	private final String[] menuItems = {"0. Add new item",
										"1. Show all items",
										"2. Edit item",
										"3. Delete item",
										"4. Find item by id",
										"5. Find item by name",
										"6. Exit program"
										};

	/**
	 * the method displays a menu.
	*/
	void displayMenuItems() {
		for (String element : this.menuItems) {
			System.out.println(element);
		}
	}
}