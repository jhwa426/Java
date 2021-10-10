import javax.swing.JTextField;

/**
 * 
 * This is the observable class in this observer pattern example.
 * 
 * This class registers (adds) one or more observer objects for the 
 * notifications generated by the objects of the observable class. 
 *
 */

public class TextFieldObservable extends JTextField{
	public TextFieldObservable(int size) {
		super(size);
		
		// this code registers an observer with an observable
		this.addActionListener(new TextFieldObserver()); 
	}
}
