package documentmodel;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class PercentageDocument extends PlainDocument{
    int counter = 0;
	@Override
	public void insertString(int offset, String str, AttributeSet a) throws BadLocationException {
		// TODO Auto-generated method stub
		String string = str+"***";
		counter++;
		if(counter<4 && str.matches("[0-9]+")) {
			super.insertString(offset, string, a);
		}				
	}
}
