//Q2
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PressMeDemo extends JFrame  {
  JTextField textField1;
  JButton pressButton;
  String[] messages = new String[]{"YOU RANG!", "NOT NOW!", "MAYBE LATER!"};
  int count;
  public PressMeDemo() {
    textField1 = new JTextField(10);
    pressButton = new JButton("PRESS ME");
    pressButton.addActionListener( new MyListener());
    JPanel p = new JPanel();
    p.add(textField1);
    p.add(pressButton);
    getContentPane().add(p);
    setSize(180, 200);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
//complete this
  public class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
//		if(e.getSource() == pressButton) {
//			pressButton.setText(textField1.getText());
//		}
//		else if (e.getSource() == pressButton.getAction()) {
//			pressButton.setText(messages[1].toString());
//		}
		
		textField1.setText(messages[count]);
		count = (count+1) % messages.length;
		
	}
	  
  }
  
  

  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() { new PressMeDemo(); }
    });
  }
}