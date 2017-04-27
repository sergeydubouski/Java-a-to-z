package ru.job4j.tracker.start;

/**
 * class MenuTracker.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 26.04.2017.
*/
class MenuTracker {

	/**
	 * constructor.
	*/
	MenuTracker() {
		super();
	}
	
	/**
	 * variable comtains actions' objects.
	*/
	private UserAction[] action = new UserAction[];
	
	class ShowItems implements UserAction {
		
	}
	class EditItem implements UserAction {
		
	}
	class DeleteItem implements UserAction {
		
	}
	class FindItemById implements UserAction {
		
	}
	class FindItemByName implements UserAction {
		
	}
}