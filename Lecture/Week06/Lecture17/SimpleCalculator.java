// Q1
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class SimpleCalculator extends JFrame {
  private JTextField textField1, textField2, textField3;
  private JButton addButton;
  public SimpleCalculator() {
     super( "Calculator" );
     setLayout(new FlowLayout());
     JLabel label1 = new JLabel("=");
     textField3 = new JTextField(4);
     textField1 = new JTextField(4);
     textField2 = new JTextField(6);
     addButton = new JButton("+");
     getContentPane().add(textField1);
     getContentPane().add(addButton);
     getContentPane().add(textField2);
     getContentPane().add(label1);
     getContentPane().add(textField3);
     addButton.addActionListener( new MyListener() );
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setSize(600, 150);
     setVisible(true);
  }
  //complete this
  
  public class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		int num1 = Integer.parseInt((textField1.getText()));
		int num2 = Integer.parseInt((textField2.getText()));
		
//		String str = textField1.getText() + textField2.getText();
		String str = num1 + num2 + "";
		textField3.setText(str);
	}
	  
  }
  
  
  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {new SimpleCalculator();}
    });
  }
}