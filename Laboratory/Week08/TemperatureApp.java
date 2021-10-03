//Q01
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class TemperatureApp extends JFrame {
  private JTextField celsiusField, fahrenheitField ;
  public TemperatureApp() {
    celsiusField = new JTextField("32", 10);
    fahrenheitField = new JTextField("0", 10);
    JPanel commandpanel = new JPanel();
    commandpanel.add(new JLabel("Celsius:"));
    commandpanel.add(celsiusField);
    commandpanel.add(new JLabel("Fahrenheit:"));
    commandpanel.add(fahrenheitField);
    getContentPane().add(commandpanel, BorderLayout.NORTH);
    celsiusField.addActionListener( new CelToFahListener() );
    fahrenheitField.addActionListener( new FahToCelCListener() );
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 150);
    setVisible(true);
  }

  //complete inner classes here
  class CelToFahListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		try {
			float celsius = Float.parseFloat(celsiusField.getText());
			double fahrenheit = Math.round((9.0 / 5.0) * celsius + 32);
			fahrenheitField.setText(String.format("%.0f", fahrenheit));
			
		} catch (Exception ex) {
			celsiusField.setText("");
			fahrenheitField.setText("");
		}
	}
  }
  
  class FahToCelCListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		try {
			float fahrenheit = Float.parseFloat(fahrenheitField.getText());
			double celsius = Math.round((fahrenheit-32)*5)/9.0;
			celsiusField.setText(String.format("%.0f",celsius));
			
		} catch (Exception ex) {
			celsiusField.setText("");
			fahrenheitField.setText("");
		}
	}
  }

  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {new TemperatureApp();}
    });
  }
}