package factorisation;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingWorker;

/**
 * Simple application to calculate the prime factors of a given number N.
 * 
 * The application allows the user to enter a value for N, and then calculates 
 * and displays the prime factors. For large values of N, the calculation may
 * take some time - and so the calculation is performed in a background
 * SwingWorker thread.
 * 
 * This is a minimal SwingWorker app. It doesn't report intermediate results
 * and the SwingWorker isn't cancelable.
 * 
 * @author Ian Warren
 *
 */
@SuppressWarnings("serial")
public class PrimeFactorsSwingApp extends JPanel {

	private JButton _startBtn;        // Button to start the calculation process.
	private JTextArea _factorValues;  // Component to display the result.
	
	public PrimeFactorsSwingApp() {
		// Create the GUI components.
		JLabel lblN = new JLabel("Value N:");
		final JTextField tfN = new JTextField(20);
		
		_startBtn = new JButton("Compute");
		_factorValues = new JTextArea();
		_factorValues.setEditable(false);
		
		// Add an ActionListener to the start button. When clicked, the 
		// button's handler extracts the value for N entered by the user from 
		// the textfield and creates a new instance of PrimeFactorisationWorker
		// (a SwingWorker) to find N's prime factors.
		_startBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				String strN = tfN.getText().trim();
				long n = 0;
				
				try {
					n = Long.parseLong(strN);
				} catch(NumberFormatException e) {
					System.out.println(e);
				}

				// Disable the Start button until the result of the calculation is known.
				_startBtn.setEnabled(false);
				
				_factorValues.setText(null);
				
				// Create and execute a SwingWorker to perform the calculation in the background.
				SwingWorker<List<Long>,Void> worker = new PrimeFactorisationWorker(n);
				worker.execute();
				
			}
		});
		
		// Construct the GUI. 
		JPanel controlPanel = new JPanel();
		controlPanel.add(lblN);
		controlPanel.add(tfN);
		controlPanel.add(_startBtn);
		
		JScrollPane scrollPaneForOutput = new JScrollPane();
		scrollPaneForOutput.setViewportView(_factorValues);
		
		setLayout(new BorderLayout());
		add(controlPanel, BorderLayout.NORTH);
		add(scrollPaneForOutput, BorderLayout.CENTER);
		setPreferredSize(new Dimension(500,300));
	}

	private static void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("Prime Factorisation of N");

		// Create and set up the content pane.
		JComponent newContentPane = new PrimeFactorsSwingApp();
		frame.add(newContentPane);

		// Display the window.
		frame.pack();
        frame.setLocationRelativeTo(null); 
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

	/**
	 * Subclass of SwingWorker to calculate prime factors of a given number. 
	 * 
	 * PrimeFactorisationWorker overrides doInBackground() and done() to,
	 * respectively, calculate the prime factors and update the GUI to display 
	 * the computed primes.
	 *
	 */
	private class PrimeFactorisationWorker extends SwingWorker<List<Long>, Void> {
		private long _n;
		
		public PrimeFactorisationWorker(long valueOfN) {
			_n = valueOfN;
		}
    
		/**
		 * Method that is executed by Swing using a background thread. This
		 * method does the work of calculating prime factors.
		 */
		@Override
		protected List<Long> doInBackground() {
			List<Long> primeFactors = new ArrayList<Long>();
			long n = _n;
			
			// For each potential factor i.
			for (long i = 2; i*i <= n; i++) {

				// If i is a factor of N, repeatedly divide it out.
				while (n % i == 0) {
					primeFactors.add(i);
					n = n / i;
				}
			}
			
	        // If biggest factor occurs only once, n > 1
	        if (n > 1) {
	        	primeFactors.add(n);
	        }
			return primeFactors;
		}
		
		/**
		 * Method that Swing arranges to be executed on the Event Dispatch
		 * thread when the PrimeFactorisationWorker object has completed its
		 * processing. This method updates the app's text-area component to 
		 * display the set of computed factors.
		 */
		@Override
		protected void done() {
			try {
				List<Long> result = get();
				for(Long factor : result) {
					_factorValues.append(factor + "\n");
				}
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			} finally {
				// Always re-enable the start button
				_startBtn.setEnabled(true);
			}
		}
	}
}

