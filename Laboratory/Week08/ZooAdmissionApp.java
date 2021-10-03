//Q02
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class ZooAdmissionApp extends JFrame {
  private JTextField numberField ;
  private JComboBox<String> priceComboBox;
  private int[] price = new int[]{14, 23, 18};
  private JLabel totalLabel;
  private JButton addButton;

  public ZooAdmissionApp() {
  	priceComboBox = new JComboBox<String>(new String[]{"CHILD", "ADULT", "SENIOR"});
    numberField = new JTextField("1", 10);
    totalLabel = new JLabel("0", 10);
    addButton = new JButton("Add");
    JPanel commandpanel = new JPanel();
    commandpanel.add(new JLabel("Select: "));
    commandpanel.add(priceComboBox);
    commandpanel.add(new JLabel("number of tickets: "));
    commandpanel.add(numberField);
    commandpanel.add(addButton);
    commandpanel.add(new JLabel("The total price is: $"));
    commandpanel.add(totalLabel);
    getContentPane().add(commandpanel, BorderLayout.CENTER);
    addButton.addActionListener( new AddListener() );
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(450, 150);
    setVisible(true);
  }
  
  //complete inner class here
  class AddListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		int index = priceComboBox.getSelectedIndex();
		int admission = 0;
		
		if (index == 0) {
			admission = Integer.parseInt(numberField.getText()) * price[index];
			totalLabel.setText((admission+Integer.parseInt(totalLabel.getText())) + "");
		}
		else if (index == 1) {
			admission = Integer.parseInt(numberField.getText()) * price[index];
			totalLabel.setText((admission+Integer.parseInt(totalLabel.getText())) + "");
		}
		else if (index == 2) {
			admission = Integer.parseInt(numberField.getText()) * price[index];
			totalLabel.setText((admission+Integer.parseInt(totalLabel.getText())) + "");
		}
	}
  }


  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {new ZooAdmissionApp();}
    });
  }
}