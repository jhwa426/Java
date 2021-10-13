/**A blank Java GUI frame
 */

/**import statements for:
 * - one of Swing's Containers called JFrame
 */
import javax.swing.JFrame;

public class BlankJavaGUI extends JFrame {
    public BlankJavaGUI() {
        super("Blank Java GUI"); // calling the super constructor in JFrame to set the title of the frame window
    }

    public static void main(String[] args) {
    	BlankJavaGUI bFrame = new BlankJavaGUI();  //Initialize BlankJavaGUI frame
        bFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Instructing the frame to exit on closing the window
        bFrame.setSize(800,650); //setting frame size
        bFrame.setVisible(true); //set the frame visible
    }
}
