//Q05
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class ShowPatternApp extends JFrame {
  private JTextField numberTextField ;
  private JComboBox<String> letterComboBox;
  private JTextArea resultTextArea;

  public ShowPatternApp() {
    numberTextField = new JTextField("5", 10);
    resultTextArea = new JTextArea("", 10, 10);
    letterComboBox = new JComboBox<String>(new String[]{"*", "%", "#", "$"});
    JPanel commandpanel = new JPanel();
    commandpanel.add(new JLabel("Select a letter: "));
    commandpanel.add(letterComboBox);
    commandpanel.add(new JLabel("Enter a number: "));
    commandpanel.add(numberTextField);
    getContentPane().add(commandpanel, BorderLayout.NORTH);
    getContentPane().add(resultTextArea, BorderLayout.CENTER);
    numberTextField.addActionListener( new ShowListener() );
    letterComboBox.addItemListener( new LetterListener() );
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(450, 300);
    setVisible(true);
  }
  public void print(String letter, int row) {
    resultTextArea.setText("");
    for (int i=1; i<=row; i++) {
      for (int j=0; j<i; j++)
        resultTextArea.append(letter);
	  resultTextArea.append("\n");
	}
  }
  
  //complete inner member classes here
  class ShowListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		int count = Integer.parseInt(numberTextField.getText());
		int indexLetter = letterComboBox.getSelectedIndex();
		String str = letterComboBox.getItemAt(indexLetter);
		
		print(str, count);
	}
  }
  
  class LetterListener implements ItemListener {
	public void itemStateChanged(ItemEvent e) {
		int count = Integer.parseInt(numberTextField.getText());
		int indexLetter = letterComboBox.getSelectedIndex();
		String str = letterComboBox.getItemAt(indexLetter);
		
		print(str, count);
	}
  }


  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {new ShowPatternApp();}
    });
  }
}