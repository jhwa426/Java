//Q04
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class ShowNameApp extends JFrame {
  private JTextField firstnameTextField, surnameTextField;
  private JLabel greetLabel;

  public ShowNameApp() {
    firstnameTextField = new JTextField("Bob", 5);
    surnameTextField = new JTextField("Hill", 5);
    greetLabel = new JLabel("NAME", 10);
    JPanel commandpanel = new JPanel();
    commandpanel.add(new JLabel("Select a firstname: "));
    commandpanel.add(firstnameTextField);
    commandpanel.add(new JLabel("Enter a surname: "));
    commandpanel.add(surnameTextField);
    commandpanel.add(greetLabel);
    getContentPane().add(commandpanel, BorderLayout.NORTH);
    firstnameTextField.addActionListener( new MyListener() );
    surnameTextField.addActionListener( new MyListener() );
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600, 200);
    setVisible(true);
  }

  //complete inner member class here
  class  MyListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		String firstName = firstnameTextField.getText();
		String lastName = surnameTextField.getText().toUpperCase();
		greetLabel.setText(String.format("Hello, %s %s",firstName, lastName));
	}
  }



  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {new ShowNameApp();}
    });
  }
}