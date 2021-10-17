package factorisation;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of the Runnable interface to calculate prime factors for a 
 * given value N.
 * 
 * @author Ian Warren
 *
 */
public class PrimeFactorsTask implements Runnable {
	
	/**
	 * Enumerated type representing states of a PrimeFactorsTask:
	 * - Initialised, the task has been created but not yet run.
	 * - Completed, the task has run through to completion (i.e. it's finished).
	 * - Aborted, the task was started but abroted before it finished.
	 *
	 */
	public enum TaskState {Initialised, Completed, Aborted};
	
	private List<Long> _primeFactors;  // List of computed factors.
	private long _n;                   // Value of N.
	private TaskState _state;          // Current state of the task.
	
	
	/**
	 * Creates a PrimeFactorsTask with a given value for N.
	 */
	public PrimeFactorsTask(long n) {
		_primeFactors = new ArrayList<Long>();
		_n = n;
		_state = TaskState.Initialised;
	}
	
	/**
	 * Computes the prime factors for N. This method updates the task's state
	 * to Aborted or Completed depending on whether it's aborted part way 
	 * through processing. It also stores any prime factors found.
	 */
	@Override
	public void run() {
		long n = _n;
		
		// For each potential factor i.
		for (long i = 2; i*i <= n; i++) {
			if(Thread.interrupted()) {
				// Record that the owning thread has been interrupted.
				_state = TaskState.Aborted;
				return;
			}

			// If i is a factor of N, repeatedly divide it out.
			while (n % i == 0) {
				_primeFactors.add(i);
				n = n / i;
			}
		}
		
        // If biggest factor occurs only once, n > 1
        if (n > 1) {
        	_primeFactors.add(n);
        }
        
        _state = TaskState.Completed;
	}
	
	/**
	 * Returns the value of N.
	 */
	public long n() {
		return _n;
	}
	
	/**
	 * Returns a List of found prime factors for N. The List is empty if no
	 * prime factors where found.
	 * 
	 * @throws IllegalStateException if the task hasn't successfully completed
	 * processing.
	 */
	public List<Long> getPrimeFactors() throws IllegalStateException {
		if(_state != TaskState.Completed) {
			throw new IllegalStateException();
		}
		return _primeFactors;
	}
	
	/**
	 * Returns the current state of the task.
	 */
	public TaskState getState() {
		return _state;
	}
}
