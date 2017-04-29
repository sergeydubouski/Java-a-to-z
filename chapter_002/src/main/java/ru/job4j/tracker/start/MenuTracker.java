package ru.job4j.tracker.start;

import ru.job4j.tracker.models.Tracker;
import ru.job4j.tracker.models.Item;
/**
 * class MenuTracker.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 26.04.2017.
*/
public class MenuTracker {
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
	 * variable contains a number of actions.
	*/
	private static final int NUMBER_OF_ACTIONS = 6;
	/**
	 * variable contains action's objects.
	*/
	private UserAction[] action = new UserAction[NUMBER_OF_ACTIONS];
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
	MenuTracker(Tracker tracker, Input input) {
		super();
		this.tracker = tracker;
		this.input = input;
	}
	/**
	 * the method fills action array.
	*/
	void fillActions() {
		this.action[Integer.valueOf("0")] = new AddItem();
		this.action[Integer.valueOf("1")] = new ShowItems();
		this.action[Integer.valueOf("2")] = new EditItem();
		this.action[Integer.valueOf("3")] = new DeleteItem();
		this.action[Integer.valueOf("4")] = new FindItemById();
		this.action[Integer.valueOf("5")] = new FindItemByName();
	}
	/**
	 * the method shows a menu.
	*/
	void displayMenu() {
		for (int i = 0; i != this.action.length; i++) {
			System.out.println(this.action[i].info());
		}
	}
	/**
	 * the method shows a menu.
	 * @param userChoice - user choice.
	*/
	void perform(String userChoice) {
		if (userChoice.equals("0") && userChoice.equals("1") && userChoice.equals("2") && userChoice.equals("3") && userChoice.equals("4") && userChoice.equals("5")) {
			this.action[Integer.valueOf(userChoice)].execute();
		}
	}
	/**
	 * class AddItem.
	 * @author Sergey Dubouski.
	 * @version 1.0.
	 * @since 27.04.2017
	*/
	private class AddItem implements UserAction {
		/**
		 * the method returns a key.
		 * @return - key.
		*/
		public String key() {
			return "0";
		}
		/**
		 * the method exectutes a user's request.
		*/
		public void execute() {
			String name = MenuTracker.this.consoleInput.ask(MenuTracker.ConsoleOutput.ENTER_NAME_MSG.getMessage());
			String description = MenuTracker.this.consoleInput.ask(MenuTracker.ConsoleOutput.ENTER_DESCRIPTION_MSG.getMessage());
			MenuTracker.this.tracker.add(new Item(System.currentTimeMillis(), name, description));
		}
		/**
		 * the method returns an action's description.
		 * @return - description.
		*/
		public String info() {
			return String.format("%s. %s", this.key(), "Add item");
		}
	}
	/**
	 * class ShowItems.
	 * @author Sergey Dubouski.
	 * @version 1.0.
	 * @since 27.04.2017
	*/
	private class ShowItems implements UserAction {
		/**
		 * the method returns a key.
		 * @return - key.
		*/
		public String key() {
			return "1";
		}
		/**
		 * the method exectutes a user's request.
		*/
		public void execute() {
			if (MenuTracker.this.tracker.findAll().length != 0) {
				for (Item item : MenuTracker.this.tracker.findAll()) {
					System.out.println(MenuTracker.ConsoleOutput.ITEM_ID_MSG.getMessage() + item.getId());
					System.out.println(MenuTracker.ConsoleOutput.ITEM_NAME_MSG.getMessage() + item.getName());
					System.out.println(MenuTracker.ConsoleOutput.ITEM_DESCRIPTION_MSG.getMessage() + item.getDescription());
				}
			}  else {
				System.out.println(MenuTracker.this.ConsoleOutput.NO_ITEMS_FOUND_MSG.getMessage());
				}
		}
		/**
		 * the method returns an action's description.
		 * @return - description.
		*/
		public String info() {
			return String.format("%s. %s", this.key(), "Show all items");
		}
	}
	/**
	 * class EditItem.
	 * @author Sergey Dubouski.
	 * @version 1.0.
	 * @since 27.04.2017
	*/
	private class EditItem implements UserAction {
		/**
		 * the method returns a key.
		 * @return - key.
		*/
		public String key() {
			return "2";
		}
		/**
		 * the method exectutes a user's request.
		*/
		public void execute() {
			Item item = MenuTracker.this.tracker.findById(MenuTracker.this.consoleInput.ask(MenuTracker.ConsoleOutput.ENTER_ID_OF_ITEM_TO_EDIT_MSG.getMessage()));
			if (item != null) {
				System.out.println(MenuTracker.ConsoleOutput.ITEM_TO_EDIT_MSG.getMessage());
				System.out.println(MenuTracker.ConsoleOutput.ITEM_ID_MSG.getMessage() + item.getId());
				System.out.println(MenuTracker.ConsoleOutput.ITEM_NAME_MSG.getMessage() + item.getName());
				System.out.println(MenuTracker.ConsoleOutput.ITEM_DESCRIPTION_MSG.getMessage() + item.getDescription());
				System.out.println(MenuTracker.ConsoleOutput.EDIT_FIELDS_MSG.getMessage());
				String name = MenuTracker.this.consoleInput.ask(MenuTracker.ConsoleOutput.ENTER_NEW_NAME_MSG.getMessage());
				String description = MenuTracker.this.consoleInput.ask(MenuTracker.ConsoleOutput.ENTER_NEW_DESCRIPTION_MSG.getMessage());
				MenuTracker.this.tracker.update(new Item(item.getId(), name, description));
			} else {
				System.out.println(MenuTracker.ConsoleOutput.NO_ITEMS_FOUND_MSG.getMessage());
				}
		}
		/**
		 * the method returns an action's description.
		 * @return - description.
		*/
		public String info() {
			return String.format("%s. %s", this.key(), "Edit item");
		}
	}
	/**
	 * class DeleteItem.
	 * @author Sergey Dubouski.
	 * @version 1.0.
	 * @since 27.04.2017
	*/
	private class DeleteItem implements UserAction {
		/**
		 * the method returns a key.
		 * @return - key.
		*/
		public String key() {
			return "3";
		}
		/**
		 * the method exectutes a user's request.
		*/
		public void execute() {
			Item item = MenuTracker.this.tracker.findById(MenuTracker.this.consoleInput.ask(MenuTracker.ConsoleOutput.ENTER_ID_OF_ITEM_TO_DELETE_MSG.getMessage()));
			if (item != null) {
				MenuTracker.this.tracker.delete(item);
			} else {
				System.out.println(MenuTracker.ConsoleOutput.NO_ITEMS_FOUND_MSG.getMessage());
				}
		}
		/**
		 * the method returns an action's description.
		 * @return - description.
		*/
		public String info() {
			return String.format("%s. %s", this.key(), "Delete item");
		}
	}
	/**
	 * class FindItemById.
	 * @author Sergey Dubouski.
	 * @version 1.0.
	 * @since 27.04.2017.
	*/
	private class FindItemById implements UserAction {
		/**
		 * the method returns a key.
		 * @return - key.
		*/
		public String key() {
			return "4";
		}
		/**
		 * the method exectutes a user's request.
		*/
		public void execute() {
			Item item = MenuTracker.this.tracker.findById(MenuTracker.this.consoleInput.ask(MenuTracker.ConsoleOutput.ENTER_ID_OF_ITEM_TO_FIND_MSG.getMessage()));
			if (item != null) {
				System.out.println(MenuTracker.ConsoleOutput.ITEM_ID_MSG.getMessage() + item.getId());
				System.out.println(MenuTracker.ConsoleOutput.ITEM_NAME_MSG.getMessage() + item.getName());
				System.out.println(MenuTracker.ConsoleOutput.ITEM_DESCRIPTION_MSG.getMessage() + item.getDescription());
			} else {
				System.out.println(MenuTracker.ConsoleOutput.NO_ITEMS_FOUND_MSG.getMessage());
				}
			//return item;
		}
		/**
		 * the method returns an action's description.
		 * @return - description.
		*/
		public String info() {
			return String.format("%s. %s", this.key(), "Find item by id");
		}
	}
	/**
	 * class FindItemByName.
	 * @author Sergey Dubouski.
	 * @version 1.0.
	 * @since 27.04.2017
	*/
	private class FindItemByName implements UserAction {
		/**
		 * the method returns a key.
		 * @return - key.
		*/
		String key() {
			return "5";
		}
		/**
		 * the method exectutes a user's request.
		*/
		public void execute() {
			Item[] items = MenuTracker.this.tracker.findByName(MenuTracker.this.consoleInput.ask(MenuTracker.ConsoleOutput.ENTER_NAME_MSG.getMessage()));
			if (items.length != 0) {
				for (Item item : items) {
					System.out.println(MenuTracker.ConsoleOutput.ITEM_ID_MSG.getMessage() + item.getId());
					System.out.println(MenuTracker.ConsoleOutput.ITEM_NAME_MSG.getMessage() + item.getName());
					System.out.println(MenuTracker.ConsoleOutput.ITEM_DESCRIPTION_MSG.getMessage() + item.getDescription());
				}
			}  else {
				System.out.println(MenuTracker.ConsoleOutput.NO_ITEMS_FOUND_MSG.getMessage());
				}
			//return items;
		}
		/**
		 * the method returns an action's description.
		 * @return - description.
		*/
		public String info() {
			return String.format("%s. %s", this.key(), "Find item by name");
		}
	}
}