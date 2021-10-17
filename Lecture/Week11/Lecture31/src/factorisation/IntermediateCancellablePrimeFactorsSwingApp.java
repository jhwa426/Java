package factorisation;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

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
 * This class demonstrates SwingWorker's mechanisms for canceling background 
 * tasks and reporting intermediate results.
 * 
 * @author Ia Warren
 *
 */
@SuppressWarnings("serial")
public class IntermediateCancellablePrimeFactorsSwingApp extends JPanel {

	private JButton _startBtn;        // Button to start the calculation process.
	private JTextArea _factorValues;  // Component to display the result.
	private JButton _abortBtn;
	
	// SwingWorker to return a final result of type List<Long> and intermediate
	// results of type Long.
	private SwingWorker<List<Long>,Long> _worker;
	
	public IntermediateCancellablePrimeFactorsSwingApp() {
		// Create the GUI components.
		JLabel lblN = new JLabel("Value N:");
		final JTextField tfN = new JTextField(20);
		
		_startBtn = new JButton("Compute");
		_abortBtn = new JButton("Abort");
		_abortBtn.setEnabled(false);
		
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
				
				// Enable the Abort button.
				_abortBtn.setEnabled(true);
				
				_factorValues.setText(null);
				
				// Create and execute a SwingWorker to perform the calculation in the background.
				_worker = new PrimeFactorisationWorker(n);
				_worker.execute();
				
				// Set the cursor to busy.
				setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			}
		});
		
		// Add an ActionListener to the abort button. When clicked, the
		// button's handler sends the SwingWorker a cancel() message and
		// disables the abort button.
		_abortBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				_worker.cancel(false);
				_abortBtn.setEnabled(false);
			}
		});
		
		// Construct the GUI. 
		JPanel controlPanel = new JPanel();
		controlPanel.add(lblN);
		controlPanel.add(tfN);
		controlPanel.add(_startBtn);
		controlPanel.add(_abortBtn);
		
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
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create and set up the content pane.
		JComponent newContentPane = new IntermediateCancellablePrimeFactorsSwingApp();
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
	 * In addition, PrimeFactorisationWorker periodically checks to see if it's 
	 * been cancelled, in which case it aborts further processing and finishes.
	 * PrimeFactorisationWorker also reports factors as and when they are found
	 * rather using SwingWorker's support for generating intermediate results. 
	 *
	 */
	private class PrimeFactorisationWorker extends SwingWorker<List<Long>, Long> {
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
				if(isCancelled()) {
					return null;
				}

				// If i is a factor of N, repeatedly divide it out.
				while (n % i == 0) {
					primeFactors.add(i);
					
					// Call publish to report the found factor as as 
					// intermediate result.
					publish(i);
					n = n / i;
				}
			}
			
	        // If biggest factor occurs only once, n > 1
	        if (n > 1) {
	        	primeFactors.add(n);
	        	publish(n);
	        }
			return primeFactors;
		}
		
		/**
		 * Method that Swing arranges to be executed on the Event Dispatch 
		 * thread. This method updates the app's text-area component by 
		 * appending a factor.
		 */
		@Override
		protected void process(List<Long> factors) {
			for(Long factor : factors) {
				_factorValues.append(factor + "\n");
			}
		}
		
		/**
		 * Method that Swing arranges to be executed on the Event Dispatch
		 * thread when the PrimeFactorisationWorker object has completed its
		 * processing. This method changes the state of the app's buttons and
		 * cursor.
		 */
		@Override
		protected void done() {
			// Always re-enable the start button and disable the abort button.
			_startBtn.setEnabled(true);
			_abortBtn.setEnabled(false);
			
			// Restore the cursor to its default.
			setCursor(Cursor.getDefaultCursor());
		}
	}
}

