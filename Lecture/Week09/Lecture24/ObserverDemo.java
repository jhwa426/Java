import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * 
 */

/**
 * 
 * The main class for Observer pattern demo example
 * This class acts as a container (aggregation/composition) for the observable JTextField
 *
 */
public class ObserverDemo extends JFrame{
	 private TextFieldObservable textField;  
	 public ObserverDemo() {
		 super("Observer Demo");
		 setLayout(new FlowLayout());
		 
		 //create a text field (observable in this example), and add to the container JFrame
		 textField = new TextFieldObservable(15);			
		 add(textField);			 
				 
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Instructing the frame to exit on closing the window
	     this.setSize(800,650); //setting frame size
	     this.setVisible(true); //set the frame visible
	 }	 
	 
     public static void main(String[] args) {
	    new ObserverDemo();  //Initialize BlankJavaGUI frame
	 }
}
