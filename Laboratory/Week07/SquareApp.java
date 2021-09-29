//Q08

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class SquareApp extends JFrame {
  private JTextField numberTextField;
  private JButton calculateButton;
  private JLabel resultLabel;
  public SquareApp() {
    numberTextField = new JTextField(4);
    calculateButton = new JButton("Calculate");
    resultLabel = new JLabel("4");
    JPanel commandpanel = new JPanel();
    commandpanel.add(numberTextField);
    commandpanel.add(calculateButton);
    commandpanel.add(resultLabel);
    getContentPane().add(commandpanel, BorderLayout.NORTH);
    calculateButton.addActionListener( new MyListener() );
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(250, 150);
    setVisible(true);
  }
  
  class MyListener implements  ActionListener{
	//complete this
	  
	public void actionPerformed(ActionEvent e) {
		int num = Integer.parseInt(numberTextField.getText());
		
		resultLabel.setText((num*num)+"");
	}
  }
  
  
  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {new SquareApp();}
    });
  }
}