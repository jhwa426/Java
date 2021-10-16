package musicApp;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.util.zip.DataFormatException;


/**
 * Class to manage reading of MusicTrack data from a CSV text file. Using an
 * instance of MusicTrackReader, a client repeatedly calls the 
 * MusicTrackReader's next() method to retrieve MusicTrack objects. When
 * next() returns null, there are no further MusicTrack objects to retrieve.
 * 
 * MusicTracktReader expects the students.csv file to be stored in the 
 * directory that contains the src/ directory for this project.
 * 
 *
 */
public class MusicTrackReader {
	public static String DEFAULT_FILE_NAME = "cool_aussie_music.csv";

	private BufferedReader _fileReader;
	private String _filename;

	/**
	 * Default constructor that creates a MusicTrackReader to read a data file 
	 * named by FILE_NAME.
	 * 
	 * @throws FileNotFoundException
	 *             if the file expected by this MusicTrackReader doesn't exist.
	 */
	public MusicTrackReader() throws FileNotFoundException {
		this(DEFAULT_FILE_NAME);
	}

	/**
	 * Constructs a MusicTrackReader to read a data file whose name is
	 * specified.
	 * 
	 * @throws FileNotFoundException
	 *             if the filename specified doesn't exist.
	 */
	public MusicTrackReader(String filename) throws FileNotFoundException {
		_fileReader = null;
		_filename = filename;

		FileInputStream fis = new FileInputStream(_filename);

		try {
			fis.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	/**
	 * Returns the number of MusicTrack objects represented in the data file.
	 * Each MusicTrack object occupies one line, and so the returned value
	 * corresponds to the number of line breaks in the file.
	 */
	public int getNumberOfMusicTrackObjects() {
		InputStream is = null;
		int result = -1;

		try {
			is = new BufferedInputStream(new FileInputStream(_filename));
			byte[] c = new byte[1024];
			int count = 0;
			int readChars = 0;
			boolean empty = true;
			while ((readChars = is.read(c)) != -1) {
				empty = false;
				for (int i = 0; i < readChars; ++i) {
					if (c[i] == '\n') {
						++count;
					}
				}
			}
			result = (count == 0 && !empty) ? 1 : count;

			is.close();

		} catch (IOException e) {
			System.err.println(e);
		}

		return result;
	}

	/**
	 * Attempts to construct a MusicTrack object from the text file. Each call
	 * to next() advances through the text file by one line.
	 * 
	 * @return a MusicTrack object, based on the current line of text in the
	 *         data file, or null if there are no further lines of text to read.
	 * @throws IOException
	 *             if the data file cannot be found or read. An IOException is
	 *             not recoverable and the user of MusicTrackReader should
	 *             not make further next() calls.
	 * @throws DataFormatException
	 *             if a line representing music data doesn't contain
	 *             exactly 3 data items.
	 */
	public MusicTrack next() throws DataFormatException {
		MusicTrack result = null;

		try {

			// Create the BufferedReader if this is the first call to next().
			// Any problem with opening the file results in an IOException.
			if (_fileReader == null) {
				_fileReader = new BufferedReader(new FileReader(_filename));
			}

			String line = _fileReader.readLine();

			if (line == null) {
				// There are no further data items to read from the file.
				try {
					_fileReader.close();
					_fileReader = null;
				} catch (IOException e) {
					// Ignore any error when closing the file.
				}
			} else {
				// Parse the line into tokens.
				String[] tokens = line.split(",");

				// If 7 tokens aren't present, throw a DataFormatException.
				if (tokens.length != 3) {
					throw new DataFormatException();
				}

				// Construct MusicTrack object from the input line. 
				String title = tokens[0];
				String artist = tokens[1];
				String album = tokens[2];

				result = new MusicTrack(title, artist, album);
			}
		} catch (IOException e) {
			// IO errors shouldn't occur - the file has been checked to exist.
			System.err.println(e);
		}

		return result;
	}

	public static void main(String[] args) {
		MusicTrackReader reader = null;

		try {
			reader = new MusicTrackReader();
		} catch (FileNotFoundException e) {
			System.out.println("Error opening data file - program exiting.");
			System.exit(1);
		}

		MusicTrack result = null;

		do {
			try {
				result = reader.next();
				if (result != null) {
					System.out.println(result);
				}
			} catch (NumberFormatException | DataFormatException e) {
				System.out
						.println("Error reading music data - skipping record.");
			}
		} while (result != null);

	}
}
