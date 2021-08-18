import java.awt.*;
import java.awt.event.*;

public class ShapesDemo extends Frame  {
  Shape[] s;
  public ShapesDemo() {
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
         System.exit(0);
      }
    });
    s = new Shape[3];
    s[0] = new Rectangle(20, 30, 40, 50);
    s[1] = new Circle(50, 60, 10);
    //s[2] = new Triangle(90, 30, 30, 60);
    s[2] = new Triangle();
    for (Shape p: s) {
		System.out.println(p.getArea());
	}

    pack();
    setBounds(100, 100, 440, 380);
    setTitle("Demo");
    setVisible(true);
  }
  public void paint(Graphics g) {
    for (int i =0; i< s.length; i++) {
      s[i].translate(100, 100);
      s[i].draw(g);
    }
  }
  public static void main(String[] args) {
    ShapesDemo demo = new ShapesDemo();
  }
}