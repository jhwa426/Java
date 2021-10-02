/**
 * 
 */
package templatepattern;


public abstract class MobileGame {
	//define the template method
	public final void play(){
		//initialize the game
		initializeGame();
		
		//start the game
		startGame();
		
		//end the game
		endGame();
	}
	//abstract methods to be implemented in sub classes
	abstract void initializeGame();
	abstract void startGame();
	abstract void endGame();
}
