//package gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class PalindromeGUI extends Panel {
	
	// Textfield for user to enter a word.
	private TextField _text;
	
	// Buttons allowing the user to check if an entered word is a palindrome. 
	// and to quit the application.
	private Button _isPalindrome, _quit;
	
	// Label to display whether a word is palindromic.
	private Label _output;

	
	public PalindromeGUI() {
		// Build and layout the GUI.
		setUp();

		// Set up button event handlers.
		_isPalindrome.addActionListener(new ActionListener() {
			// Handler for the "Is palindrome" button.
			@Override
			public void actionPerformed(ActionEvent e) {
				// Get the user's word from the textfield.
				String enteredText = _text.getText();

				// For words that contain at least one character, determine 
				// whether they are palindromic. Use the application's label to
				// output the result of the processing.
				if (enteredText.length() > 0) {
					if (isPalindromic(enteredText)) {
						_output.setText(enteredText + " is palindromic");
					} else {
						_output.setText(enteredText + " is not palindromic");
					}
				}
			}
		});

		_quit.addActionListener(new ActionListener() {
			// Quit the application in response to the user pressing the quit
			// button.
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		// Create a Frame to house the PalindromeGUI Panel. The Frame is a "top
		// level" container/window. SwingUtilities' invokeLater() method is 
		// used to create the PalindromeGUI object and to configure the Frame.
		// More about this SwingUtilities method later in the course.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				Frame frame = new Frame("Palindrome Detector");
				frame.add(new PalindromeGUI());
		
				// Allow the program to be terminated when the window is closed.
				frame.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				});
				
				// Set window properties. pack() causes the Frame's components
				// to be laid out according to their preferred sizes. 
				// setLocationRelativeTo() causes the Frame to be centered on 
				// the screen. setVisible() malkes the Frame visible.
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}
	
	// Helper method to perform the palindromic check on a String.
	private boolean isPalindromic(String word) {
		StringBuffer buffer = new StringBuffer(word).reverse();
		return word.equalsIgnoreCase(buffer.toString());
	}

	// Helper method to build the GUI's compositional structure from
	// components and containers.
	private void setUp() {
		// Create intermediate panels.
		Panel inputPanel = new Panel();
		Panel outputPanel = new Panel();
		Panel buttonPanel = new Panel();

		// Create simple components.
		Label prompt = new Label("Word/phrase");
		_text = new TextField(20);
		_output = new Label("Please enter a word/phrase");
		_isPalindrome = new Button("Is palindrome");
		_quit = new Button("quit");

		// Add components to intermediate panels.
		inputPanel.add(prompt);
		inputPanel.add(_text);
		outputPanel.add(_output);
		buttonPanel.add(_isPalindrome);
		buttonPanel.add(_quit);

		// Add panels to this object.
		setLayout(new BorderLayout());
		add(inputPanel, BorderLayout.NORTH);
		add(outputPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
	}
}
