/**
 * 
 */
package templatepattern;


public class Rugby extends MobileGame{
	
	@Override
	void initializeGame() {
	   System.out.println("Rugby game initialized. Gear up! ");
	}
	
	@Override
	void startGame() {
	   System.out.println("Rugby game started. Nail the game!");
	}	
	
	@Override
	void endGame() {
	   System.out.println("Rugby game over!");
	}
}
