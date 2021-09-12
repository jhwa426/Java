import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlowLayoutDemo extends JFrame {
  public FlowLayoutDemo() {
 	Container p = getContentPane();
    p.setLayout(new FlowLayout());
  	p.add(new JButton("Button 1"));
 	p.add(new JButton("Button 2"));
 	p.add(new JButton("Button 3"));
 	p.add(new JButton("Long-Named Button 4"));
 	p.add(new JButton("5"));
    setTitle("FlowLayoutDemo Example - RIGHT alignment");
  }
  public static void main(String[] args) {
    FlowLayoutDemo frame = new FlowLayoutDemo();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(200, 200);
    frame.setVisible(true);
  }
}