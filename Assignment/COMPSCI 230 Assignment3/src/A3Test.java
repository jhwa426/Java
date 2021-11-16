
public class A3Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimationViewer p  = new AnimationViewer(true);
		p.createNewShape(105, 205); //rect
		p.setCurrentShapeType(1);
		p.createNewShape(100, 200); //oval
		p.setCurrentShapeType(0);
		p.createNewShape(105, 205);
		p.setCurrentText("A3");
//		p.new MyMockAdapter().mouseClicked(new MockEvent(14, 26));
//		p.paintComponent(painter);
	}

}
