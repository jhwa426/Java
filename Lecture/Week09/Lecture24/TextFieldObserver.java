import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 * 
 * This class acts as the potential observer for the observable JTextField class
 *
 */

public class TextFieldObserver implements ActionListener {  
	
	//this code defines the actions undertaken by the observer on 
	//receiving an update/notification from the observable.
	@Override  
	public void actionPerformed(ActionEvent e) {    
		 JTextField jtext = (JTextField)e.getSource();
		 String word = "Hello "+jtext.getText();		 
		 jtext.setText(word);
	}
}
