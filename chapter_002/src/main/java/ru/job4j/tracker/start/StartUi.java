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
	 * console output to the user.
	*/
	private enum ConsoleOutput {
		/**
		 * output message to the user.
		*/
		ENTER_NAME_MSG("PLEASE ENTER YOUR NAME: "),
		/**
		 * output message to the user.
		*/
		ENTER_DESCRIPTION_MSG("PLEASE ENTER THE DESCRIPTION OF AN ITEM: "),
		/**
		 * output message to the user.
		*/
		ENTER_NEW_DESCRIPTION_MSG("PLEASE ENTER A NEW DESCRIPTION: "),
		/**
		 * output message to the user.
		*/
		EDIT_FIELDS_MSG("PLEASE EDIT THE FOLLOWING FIELDS:"),
		/**
		 * output message to the user.
		*/
		ENTER_NEW_NAME_MSG("PLEASE ENTER A NEW NAME: "),
		/**
		 * output message to the user.
		*/
		ENTER_ID_OF_ITEM_TO_EDIT_MSG("PLEASE ENTER THE ID OF AN ITEM YOU WOULD LIKE TO EDIT: "),
		/**
		 * output message to the user.
		*/
		ENTER_ID_OF_ITEM_TO_FIND_MSG("PLEASE ENTER THE ID OF AN ITEM YOU WOULD LIKE TO FIND: "),
		/**
		 * output message to the user.
		*/
		ENTER_ID_OF_ITEM_TO_DELETE_MSG("PLEASE ENTER THE ID OF AN ITEM YOU WOULD LIKE TO DELETE: "),
		/**
		 * output message to the user.
		*/
		ITEM_ID_MSG("ITEM ID: "),
		/**
		 * output message to the user.
		*/
		ITEM_NAME_MSG("NAME: "),
		/**
		 * output message to the user.
		*/
		ITEM_DESCRIPTION_MSG("ITEM DESCRIPTION: "),
		/**
		 * output message to the user.
		*/
		ITEM_TO_EDIT_MSG("ITEM TO EDIT IS:"),
		/**
		 * output message to the user.
		*/
		PROGRAM_SHUT_DOWN_MSG("PROGRAM IS SHUTTING DOWN"),
		/**
		 * output message to the user.
		*/
		NO_ITEMS_FOUND_MSG("NO ITEMS FOUND, PLEASE SELECT ANOTHER OPTION"),
		/**
		 * output message to the user.
		*/
		INVALID_INPUT_MSG("INVALID INPUT, PLEASE SELECT ANOTHER OPTION");
		/**
		 * the variable contains a message to the user.
		*/
		private final String message;
		/**
		 * constructor.
		 * @param message - message.
		*/
		ConsoleOutput(String message) {
			this.message = message;
		}
		/**
		 * the method returns an output to the user.
		 * @return - response.
		*/
		String getMessage() {
			return this.message;
		}
	}
	/**
	 * the variable contains user input to exit the program.
	*/
	public static final String EXIT_PROGRAM_NUMBER = "6";
	/**
	 * tracker object.
	*/
	private Tracker tracker = new Tracker();
	/**
	 * consoleInput object.
	*/
	private ConsoleInput consoleInput = new ConsoleInput();
	/**
	 * constructor.
	*/
	StartUi() {
		super();
	}
	/**
	 * the method adds new item.
	*/
	private void addNewItem() {
		String name = this.consoleInput.ask(ConsoleOutput.ENTER_NAME_MSG.getMessage());
		String description = this.consoleInput.ask(ConsoleOutput.ENTER_DESCRIPTION_MSG.getMessage());
		this.tracker.add(new Item(System.currentTimeMillis(), name, description));
	}
	/**
	 * the method displays all items.
	*/
	private void showAllItems() {
		if (this.tracker.findAll().length != 0) {
			for (Item item : tracker.findAll()) {
				System.out.println(ConsoleOutput.ITEM_ID_MSG.getMessage() + item.getId());
				System.out.println(ConsoleOutput.ITEM_NAME_MSG.getMessage() + item.getName());
				System.out.println(ConsoleOutput.ITEM_DESCRIPTION_MSG.getMessage() + item.getDescription());
			}
		}  else {
			System.out.println(ConsoleOutput.NO_ITEMS_FOUND_MSG.getMessage());
			}
	}
	/**
	 * the method edits an item.
	*/
	private void editItem() {
		Item item = this.tracker.findById(this.consoleInput.ask(ConsoleOutput.ENTER_ID_OF_ITEM_TO_EDIT_MSG.getMessage()));
		if (item != null) {
			System.out.println(ConsoleOutput.ITEM_TO_EDIT_MSG.getMessage());
			System.out.println(ConsoleOutput.ITEM_ID_MSG.getMessage() + item.getId());
			System.out.println(ConsoleOutput.ITEM_NAME_MSG.getMessage() + item.getName());
			System.out.println(ConsoleOutput.ITEM_DESCRIPTION_MSG.getMessage() + item.getDescription());
			System.out.println(ConsoleOutput.EDIT_FIELDS_MSG.getMessage());
			String name = this.consoleInput.ask(ConsoleOutput.ENTER_NEW_NAME_MSG.getMessage());
			String description = this.consoleInput.ask(ConsoleOutput.ENTER_NEW_DESCRIPTION_MSG.getMessage());
			this.tracker.update(new Item(item.getId(), name, description));
		} else {
			System.out.println(ConsoleOutput.NO_ITEMS_FOUND_MSG.getMessage());
			}
	}
	/**
	 * the method deletes an item.
	*/
	private void deleteItem() {
		Item item = this.tracker.findById(this.consoleInput.ask(ConsoleOutput.ENTER_ID_OF_ITEM_TO_DELETE_MSG.getMessage()));
		if (item != null) {
			this.tracker.delete(item);
		} else {
			System.out.println(ConsoleOutput.NO_ITEMS_FOUND_MSG.getMessage());
			}
	}
	/**
	 * the method finds an item by id.
	*/
	private void findItemById() {
		Item item = this.tracker.findById(this.consoleInput.ask(ConsoleOutput.ENTER_ID_OF_ITEM_TO_FIND_MSG.getMessage()));
		if (item != null) {
			System.out.println(ConsoleOutput.ITEM_ID_MSG.getMessage() + item.getId());
			System.out.println(ConsoleOutput.ITEM_NAME_MSG.getMessage() + item.getName());
			System.out.println(ConsoleOutput.ITEM_DESCRIPTION_MSG.getMessage() + item.getDescription());
		} else {
			System.out.println(ConsoleOutput.NO_ITEMS_FOUND_MSG.getMessage());
			}
	}
	/**
	 * the method finds items by name.
	*/
	private void findItemsByName() {
		Item[] items = this.tracker.findByName(this.consoleInput.ask(ConsoleOutput.ENTER_NAME_MSG.getMessage()));
		if (items.length != 0) {
			for (Item item : items) {
				System.out.println(ConsoleOutput.ITEM_ID_MSG.getMessage() + item.getId());
				System.out.println(ConsoleOutput.ITEM_NAME_MSG.getMessage() + item.getName());
				System.out.println(ConsoleOutput.ITEM_DESCRIPTION_MSG.getMessage() + item.getDescription());
			}
		}  else {
			System.out.println(ConsoleOutput.NO_ITEMS_FOUND_MSG.getMessage());
			}
	}
	/**
	 * the method performs an action based on a user's input.
	 * @param userInput - user input based on menu items.
	*/
	void actionToPerform(String userInput) {
		System.out.println(ConsoleOutput.INVALID_INPUT_MSG.getMessage());
		}
	}
	/**
	 * the method initializes the application.
	*/
	void init() {
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