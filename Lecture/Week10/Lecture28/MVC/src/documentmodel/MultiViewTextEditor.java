package documentmodel;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;

public class MultiViewTextEditor extends JPanel {

   public MultiViewTextEditor() {
      JLabel label = new JLabel("Type something");
      JTextField textField1 = new JTextField(20);      
      JTextField textField2 = new JTextField(20);  
      
      Document document = new PercentageDocument2();
      textField1.setDocument(document);
      textField2.setDocument(document);

      add(label);
      add(textField1);
      add(textField2);
   }

   private static void createAndShowGUI() {
      JFrame frame = new JFrame("TextFieldDemo");
        
      JComponent demo = new MultiViewTextEditor();

      frame.add(demo);
      frame.pack();
      frame.setVisible(true);
   }

   public static void main(String[ ] args) {
      createAndShowGUI();
   }
}
