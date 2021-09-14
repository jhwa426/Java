import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SimpleDemo extends JFrame {
  private JTextField textField1, textField2, textField3;
  public SimpleDemo() {
    super("Simple Demo");
 	setLayout(new FlowLayout());
    textField1 = new JTextField(15);
    textField2 = new JTextField(15);
    textField3 = new JTextField(30);
    getContentPane().add(textField1);
    getContentPane().add(textField2);
    getContentPane().add(textField3);

    MyHandler handler = new MyHandler();
    textField1.addActionListener(handler);
    textField2.addActionListener(handler);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Instructing the frame to exit on closing the window
    this.setSize(800,150); //setting frame size
    this.setVisible(true); //set the frame visible
  }

   private class MyHandler implements ActionListener {
   @Override
     public void actionPerformed(ActionEvent e) {
	   String word1 = textField1.getText()+" "+textField2.getText();
	   textField3.setText(word1);
     }
   }
   public static void main(String[] args) {
     javax.swing.SwingUtilities.invokeLater(new Runnable() {
       public void run() {new SimpleDemo();}
     });
  }
}
