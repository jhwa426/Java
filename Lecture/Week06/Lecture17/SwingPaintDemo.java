import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MyPanel extends JPanel {

  public MyPanel() {  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    // Draw Text
    g.drawString("Hello World!",50,100);
    g.drawRect(10, 20, 30, 40);
  }
}

public class SwingPaintDemo {
  private static void createAndShowGUI() {
    //Create and set up the window.
    JFrame frame = new JFrame("Swing Paint Demo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setContentPane(new MyPanel());

    //Display the window.
    frame.setSize(250, 200);
    frame.setVisible(true);
    String num1 = JOptionPane.showInputDialog("Enter first integer");
	String num2 = JOptionPane.showInputDialog("Enter second integer");
	int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
	JOptionPane.showMessageDialog(null, "The sum is " + sum,
	  "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);

	Color newColor = JColorChooser.showDialog(null, "Fill Color", Color.blue);
	JOptionPane.showMessageDialog(null, "The sum is " + newColor,
  "Selected Color", JOptionPane.PLAIN_MESSAGE);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        createAndShowGUI();
      }
    });
  }
}