/**Our very basic HELLO WORLD program got GOOEE'D
 *  
 */

/**Import statements for:
 * - one of AWT's Layout Managers called FlowLayout
 * - one of Swing's Containers called JFrame
 * - one of Swing's Components called JLabel
 */
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldGUI extends JFrame {
    private final JLabel label;  //Declaring a JLabel
    
    public HelloWorldGUI() {
        super("Java GUI"); // calling the super constructor in JFrame to set the title of the frame window
        setLayout(new FlowLayout()); // set the layout of the frame window
        label = new JLabel("Welcome World! I am now GOOee'd :)"); //initialize the label
        add(label); //add the label to JFrame's content pane
    }

    public static void main(String[] args) {
        HelloWorldGUI hFrame = new HelloWorldGUI();  //Initialize HelloWorldGUI frame
        hFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Instructing the frame to exit on closing the window
        hFrame.setSize(300,150); //setting frame size
        hFrame.setVisible(true); //set the frame visible
    }
}
