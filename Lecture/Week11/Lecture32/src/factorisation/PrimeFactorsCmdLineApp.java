package factorisation;

import java.util.List;
import java.util.Scanner;

/**
 * Simple command-line application that allows a user to enter a value for N 
 * and which calculates its prime factors. A background thread is used to run
 * the calculation and can be aborted at any time by the user pressing any key.
 * 
 * @author Ian Warren
 *
 */
public class PrimeFactorsCmdLineApp {
	// Default value for N - use this if no value is supplied on the command 
	// line.
	private static final long defaultN = 9201111169755555649L;
	
	public static void main(String[] args) {
		long n = defaultN;
		
		if(args.length == 1) {
			// User has entered a command line argument for N.
			try {
				n = Long.parseLong(args[0]);
			} catch(NumberFormatException e) {
				// User has entered a value that is not a Long, so assume the
				// default value.
			}
		}
			
		// Create a thread with the logic to calculate prime factors of N.
		PrimeFactorsTask task = new PrimeFactorsTask(n);
		final Thread worker = new Thread(task);
		
		// Create another thread to monitor the keyboard for input.
		Thread inputReader = new Thread( new Runnable() {
			@Override
			public void run() {
				Scanner keyboard = new Scanner(System.in);
				
				// Block while waiting for the user to press the Enter key.
				keyboard.nextLine();
				
				// The user has pressed Enter - interrupt the calculation 
				// thread.
				worker.interrupt();
			}
		});
		
		// Execute the threads.
		worker.start();
		inputReader.start();
		
		System.out.println("Computing prime factors for N=" + n);
		System.out.println("Hit Enter to abort...");		
		
		try {
			// Wait for the worker to complete processing - either by 
			// completing normally, or because the worker terminated early due
			// to being interrupted.
			worker.join();
			
			if(task.getState() == PrimeFactorsTask.TaskState.Aborted) {
				System.out.println("Calculation interrupted and aborted.");
			} else {
				System.out.println("Prime factors:");
				List<Long> primeFactors = task.getPrimeFactors();
				for(long factor : primeFactors) {
					System.out.println(factor);
				}
			}
		} catch(InterruptedException e) {
			// Main thread interrupted while calling join() on worker.
			e.printStackTrace();
		}
	}
}
