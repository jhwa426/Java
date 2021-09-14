import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TextFieldDemo2 extends JFrame  {
  JTextField textField1, textField2;
  JButton showButton;
  public TextFieldDemo2() {
    textField1 = new JTextField(10);
    textField2 = new JTextField(10);
    showButton = new JButton("OK");
    
    textField1.addActionListener( new MyListener());
	textField2.addActionListener( new MyListener());
	
    JPanel p = new JPanel();
    
    p.add(textField1);
    p.add(textField2);
    p.add(showButton);
    
    getContentPane().add(p);
    setSize(180, 200);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  
  
  class MyListener implements ActionListener {
    public void actionPerformed( ActionEvent e ) {
	  if (e.getSource() == textField1)
	    showButton.setText(textField1.getText().toUpperCase());
	  else if (e.getSource() == textField2)
        showButton.setText("hello, " + textField2.getText());
    }
  }
  
  
  
  
  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() { new TextFieldDemo2(); }
    });
  }
}