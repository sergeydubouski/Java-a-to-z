package ru.job4j;

/**
 * Turn class.
 * @author Sergey Dubouski
 * @version 1.0
 * @since 19.01.2017
*/
public class Turn {
	
	int [] arrayTurn;
	
	public Turn (int first, second, third, fourth, fifth) {
		
		arrayTurn = new int [] {first, second, third, fourth, fifth};
	}
	
	public void back () {
		
		for (int i = 0; i < arrayTurn.length; i ++) {
			
			int tempStorage = this.arrayTurn[i];
			this.arrayTurn[i] = this.arrayTurn[arrayTurn.length - i - 1];
			this.arrayTurn[arrayTurn.length - i - 1]  = tempStorage;			
		}
	}
}