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
	private Input consoleInput;
	/**
	 * position in an array.
	*/
	private int position = 0;
	/**
	 * constructor.
	 * @param tracker - tracker.
	 * @param input - input.
	*/
	MenuTracker(Tracker tracker, Input input) {
		super();
		this.tracker = tracker;
		this.consoleInput = input;
	}
	/**
	 * the method fills action array.
	*/
	void fillActions() {
		this.action[this.position] = new AddItem("Add item", this.position++);
		this.action[this.position] = new ShowItems("Show all items", this.position++);
		this.action[this.position] = new EditItem("Edit item", this.position++);
		this.action[this.position] = new DeleteItem("Delete item", this.position++);
		this.action[this.position] = new FindItemById("Find item by id", this.position++);
		this.action[this.position] = new FindItemByName("Find item by name", this.position++);
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
		this.action[Integer.valueOf(userChoice)].execute();
	}
	/**
	 * class AddItem.
	 * @author Sergey Dubouski.
	 * @version 1.0.
	 * @since 27.04.2017
	*/
	private class AddItem extends BaseAction {
		/**
		 * constructor.
		 * @param name - name.
		 * @param key - key.
		*/
		AddItem(String name, int key) {
			super(name, key);
		}
		/**
		 * the method exectutes a user's request.
		*/
		public void execute() {
			String name = MenuTracker.this.consoleInput.ask(MenuTracker.ConsoleOutput.ENTER_NAME_MSG.getMessage());
			String description = MenuTracker.this.consoleInput.ask(MenuTracker.ConsoleOutput.ENTER_DESCRIPTION_MSG.getMessage());
			MenuTracker.this.tracker.add(new Item(System.currentTimeMillis(), name, description));
		}
	}
	/**
	 * class ShowItems.
	 * @author Sergey Dubouski.
	 * @version 1.0.
	 * @since 27.04.2017
	*/
	private class ShowItems extends BaseAction {
		/**
		 * constructor.
		 * @param name - name.
		 * @param key - key.
		*/
		ShowItems(String name, int key) {
			super(name, key);
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
				System.out.println(MenuTracker.ConsoleOutput.NO_ITEMS_FOUND_MSG.getMessage());
				}
		}
	}
	/**
	 * class EditItem.
	 * @author Sergey Dubouski.
	 * @version 1.0.
	 * @since 27.04.2017
	*/
	private class EditItem extends BaseAction {
		/**
		 * constructor.
		 * @param name - name.
		 * @param key - key.
		*/
		EditItem(String name, int key) {
			super(name, key);
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
	}
	/**
	 * class DeleteItem.
	 * @author Sergey Dubouski.
	 * @version 1.0.
	 * @since 27.04.2017
	*/
	private class DeleteItem extends BaseAction {
		/**
		 * constructor.
		 * @param name - name.
		 * @param key - key.
		*/
		DeleteItem(String name, int key) {
			super(name, key);
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
	}
	/**
	 * class FindItemById.
	 * @author Sergey Dubouski.
	 * @version 1.0.
	 * @since 27.04.2017.
	*/
	private class FindItemById extends BaseAction {
		/**
		 * constructor.
		 * @param name - name.
		 * @param key - key.
		*/
		FindItemById(String name, int key) {
			super(name, key);
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
		}
	}
	/**
	 * class FindItemByName.
	 * @author Sergey Dubouski.
	 * @version 1.0.
	 * @since 27.04.2017
	*/
	private class FindItemByName extends BaseAction {
		/**
		 * constructor.
		 * @param name - name.
		 * @param key - key.
		*/
		FindItemByName(String name, int key) {
			super(name, key);
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
		}
	}
}