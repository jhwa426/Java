package documentmodel;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;

public class TextFieldDemo extends JPanel {

   public TextFieldDemo() {
      JLabel label = new JLabel("Type something");
      JTextField textField = new JTextField(20);      

      Document document = new PercentageDocument();
      textField.setDocument(document);

      add(label);
      add(textField);
   }

   private static void createAndShowGUI() {
      JFrame frame = new JFrame("TextFieldDemo");
        
      JComponent demo = new TextFieldDemo();

      frame.add(demo);
      frame.pack();
      frame.setVisible(true);
   }

   public static void main(String[ ] args) {
      createAndShowGUI();
   }
}
