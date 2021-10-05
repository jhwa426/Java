//Q09

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class GreetingApp extends JFrame {
  private JTextField nameField;
  private JButton showButton, clearButton;
  private JLabel greetLabel;
  public GreetingApp() {
    nameField = new JTextField(10);
    showButton = new JButton("Show");
    clearButton = new JButton("Clear");
    greetLabel = new JLabel("");
    JPanel commandpanel = new JPanel();
    commandpanel.add(nameField);
    commandpanel.add(showButton);
    commandpanel.add(clearButton);
    commandpanel.add(greetLabel);
    getContentPane().add(commandpanel, BorderLayout.NORTH);
    showButton.addActionListener( new MyListener() );
    clearButton.addActionListener( new ClearListener() );
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 150);
    setVisible(true);
  }
  
  //complete this
  class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = nameField.getText();
		greetLabel.setText("Hello, " + str);
	}
  }
  
  class ClearListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = nameField.getText();
		greetLabel.setText("");
		
	}
  }

  
  
  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {new GreetingApp();}
    });
  }
}