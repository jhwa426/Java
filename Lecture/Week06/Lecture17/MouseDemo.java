import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

public class MouseDemo extends JFrame {
  int mouseX, mouseY;
  DrawPanel drawPanel;
  public MouseDemo() {
    drawPanel = new DrawPanel();
    drawPanel.addMouseListener(new MyMouseAdapter());
    getContentPane().add(drawPanel, BorderLayout.CENTER);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 250);
    setVisible(true);
}
class MyMouseAdapter extends MouseAdapter {
  public void mousePressed( MouseEvent e ) {
    mouseX = e.getX( );
    mouseY = e.getY( );
    repaint( );
  }
}
class DrawPanel extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);  // paint parent's background
      g.drawString("("+mouseX+","+mouseY+")", mouseX, mouseY);
  }
}
  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() { new MouseDemo(); }
    });
  }
}