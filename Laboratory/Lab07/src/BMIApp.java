//Q03
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class BMIApp extends JFrame {
  private JTextField heightTextField, weightTextField ;
  private JButton showButton;
  private JLabel resultLabel;

  public BMIApp() {
    heightTextField = new JTextField("1", 10);
    weightTextField = new JTextField("1", 10);
    resultLabel = new JLabel("", 10);
    showButton = new JButton("Calculate BMI");
    JPanel commandpanel = new JPanel();
    commandpanel.add(new JLabel("Enter height: "));
    commandpanel.add(heightTextField);
    commandpanel.add(new JLabel("Enter weight: "));
    commandpanel.add(weightTextField);
    commandpanel.add(showButton);
    commandpanel.add(resultLabel);
    getContentPane().add(commandpanel, BorderLayout.CENTER);
    showButton.addActionListener( new ShowListener() );
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(450, 150);
    setVisible(true);
  }

  //complete inner member class here
  class ShowListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		try {		
			double weight = Double.parseDouble(weightTextField.getText());
			double height = Double.parseDouble(heightTextField.getText());
			double bmi = weight / (Math.pow(height, 2));
			
			if (bmi < 0) {
				resultLabel.setText("ERROR: invalid! Try again.");
			} else if ((bmi > 0) &&(bmi < 18.5)) {
				resultLabel.setText("You are classified as Underweight.");
			} else if ((bmi >= 18.5) && (bmi < 25.0)) {
				resultLabel.setText("You are classified as Normal.");
			} else if ((bmi >= 25.0) && (bmi < 30.0)) {
				resultLabel.setText("You are classified as Overweight.");
			} else if (bmi >= 30.0) {
				resultLabel.setText("You are classified as Obese.");
			}

		} catch (Exception ex) {
			resultLabel.setText("ERROR: invalid! Try again.");
		}
	}
	  
  }


  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {new BMIApp();}
    });
  }
}