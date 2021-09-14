import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TextFieldDemo1 extends JFrame  {
  JTextField textField1, textField2;
  public TextFieldDemo1() {
    textField1 = new JTextField(10);
    textField2 = new JTextField(10);
    JButton showButton = new JButton("OK");
    textField1.addActionListener( new ActionListener() {
      @Override
      public void actionPerformed( ActionEvent e ) {
        showButton.setText(textField1.getText().toUpperCase());
      }
    });
	textField2.addActionListener( new ActionListener() {
      @Override
      public void actionPerformed( ActionEvent e ) {
        showButton.setText("hello, " + textField2.getText());
      }
    });
    JPanel p = new JPanel();
    p.add(textField1);
    p.add(textField2);
    p.add(showButton);
    getContentPane().add(p);
    setSize(180, 200);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }

  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() { new TextFieldDemo1(); }
    });
  }
}