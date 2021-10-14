// GraphicsTest
import java.util.ArrayList;
import javax.swing.JFrame;

public class GraphicsTest {

	public static void main(String[] args) {

		ArrayList<StickFigure> figures = new ArrayList<>();
		StickFigure f1 = new StickFigure(200, 450);
		figures.add(f1);
		StickFigure f2 = new StickFigure(400, 750);
		figures.add(f2);

		JFrame application = new JFrame("My Stick Figures");
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DrawingPanel p = new DrawingPanel(figures);
		application.add(p);
		application.setSize(1000, 750);
		application.setVisible(true);

	}

}