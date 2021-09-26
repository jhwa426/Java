//Q10
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class CircleAreaApp extends JFrame {
  private JTextField radiusField;
  private JButton showButton;
  private JLabel resultLabel;
  public CircleAreaApp() {
    radiusField = new JTextField("1", 10);
    showButton = new JButton("Show");
    resultLabel = new JLabel("The area is ...");
    JPanel commandpanel = new JPanel();
    commandpanel.add(new JLabel("Enter a radius"));
    commandpanel.add(radiusField);
    commandpanel.add(showButton);
    commandpanel.add(resultLabel);
    getContentPane().add(commandpanel, BorderLayout.NORTH);
    showButton.addActionListener( new MyListener() );
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 150);
    setVisible(true);
  }
  
  //complete this
  class MyListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
		try {
			int radius = Integer.parseInt(radiusField.getText());
			double area = (radius * radius) * Math.PI;
			resultLabel.setText(String.format("The area is %.2f", area));
		} catch (Exception ex) {
			resultLabel.setText("ERROR: Invalid value. Try again.");
		}
    }
  }

  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {new CircleAreaApp();}
    });
  }
}