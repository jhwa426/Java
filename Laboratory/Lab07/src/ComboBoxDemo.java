import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class ComboBoxDemo extends JFrame {
  private JComboBox<String> fruitComboBox;
  private JLabel resultLabel;
  private JButton showButton;

  public ComboBoxDemo() {
    fruitComboBox = new JComboBox<String>(new String[]{"Apple", "Banana", "Orange"});
    resultLabel = new JLabel("NAME", 10);
    showButton = new JButton("Click me");
    JPanel commandpanel = new JPanel();
    commandpanel.add(fruitComboBox);
    commandpanel.add(showButton);
    commandpanel.add(resultLabel);
    getContentPane().add(commandpanel, BorderLayout.NORTH);
    showButton.addActionListener( new MyListener() );
    fruitComboBox.addItemListener( new FruitListener() );
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600, 200);
    setVisible(true);
  }

  //complete this
  class MyListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	  
  }
  
  class FruitListener implements ItemListener {
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
	  
  }
  
  
  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {new ComboBoxDemo();}
    });
  }
}