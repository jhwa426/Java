package musicAppEditable;

import java.awt.BorderLayout;
import java.io.FileNotFoundException;
import java.util.zip.DataFormatException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * Swing application to present a set of music tracks to the user. The app uses
 * a JTable to present the tabular data. 
 * 
 */
@SuppressWarnings("serial")
public class MusicTrackApp extends JPanel {
	
	public MusicTrackApp() {		

		// Create the Adapter.
		MusicTrackAdapter adapter = new MusicTrackAdapter();

		// Create the JTable and bind it to the Adapter.
		JTable tableComponent = new JTable(adapter);
		
		// Decorate the JTable component with a scrollbar and add it to the GUI.
		JScrollPane scrollPane = new JScrollPane(tableComponent);
		setLayout(new BorderLayout());
		add(scrollPane, BorderLayout.CENTER);
		
		// Load data into the model.
		try {
			MusicTrackReader reader = new MusicTrackReader();
			MusicTrack track = null;
			do {
				track = reader.next();
				if(track != null) {
					adapter.addTrack(track);
				}
			} while(track != null);
		} catch(FileNotFoundException e) {
			System.err.println("Unable to locate data file");
			System.exit(1);
		} catch(DataFormatException e ) {
			System.err.println("Bad record found in data file");
		}

	
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame frame = new JFrame("MusicTracker");
				frame.add(new MusicTrackApp());
				
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

	
}
