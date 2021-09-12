import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BorderLayoutDemo extends JFrame {
  public BorderLayoutDemo() {
 	Container pane = getContentPane();
    pane.setLayout(new BorderLayout());
    
 	JButton button = new JButton("Button 1 (PAGE_START)");
 	pane.add(button, BorderLayout.PAGE_START);
 	
 	button = new JButton("Button 2 (CENTER)");
 	pane.add(button, BorderLayout.CENTER);
 	
	button = new JButton("Button 3 (LINE_START)");
 	pane.add(button, BorderLayout.LINE_START);
 	
 	button = new JButton("Button 4 (PAGE_END)");
 	pane.add(button, BorderLayout.PAGE_END);
 	
 	button = new JButton("Button 5 (LINE_END)");
 	pane.add(button, BorderLayout.LINE_END);
  }

  public static void main(String[] args) {
    BorderLayoutDemo frame = new BorderLayoutDemo();
    frame.setTitle("BorderLayoutDemo Example");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(600, 400);
    frame.setVisible(true);
  }
}