import javax.swing.SwingUtilities;

public class RunMozzieHunt implements Runnable {

	public void run() {
		MozzieHunt m = new MozzieHunt();
	}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new RunMozzieHunt());
	}

}
