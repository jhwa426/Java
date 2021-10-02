/**
 * 
 */
package templatepattern;


public class Hockey extends MobileGame{
	@Override
	void initializeGame() {
	   System.out.println("Hockey game initialized. Gear up! ");
	}
	
	@Override
	void startGame() {
	   System.out.println("Hockey game started. Nail the game!");
	}	
	
	@Override
	void endGame() {
	   System.out.println("Hockey game over!");
	}
}
