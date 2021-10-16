package musicApp;

/**
 * Class to represents music tracks. A MusicTrack object has a title, an artist
 * and and album name.
 */
public class MusicTrack {

	private String _title;
	private String _artist;
	private String _album;
	
	/**
	 * Constructs a new MusicTrack object with a given title, artist and album.
	 */
	public MusicTrack(String title, String artist, String album) {
		_title = title;
		_artist = artist;
		_album = album;
	}
	
	/**
	 * Returns this MusicTrack object's title.
	 */
	public String getTitle() {
		return _title;
	}
	
	/**
	 * Returns this MusicTrack object's artist.
	 * @return
	 */
	public String getArtist() {
		return _artist;
	}
	
	/**
	 * Returns this MusicTrack object's album.
	 * @return
	 */
	public String getAlbum() {
		return _album;
	}
	
	public String toString() {
		return "(title: " + _title + ", artist: " + _artist + ", album: " + _album + ")";
	}
}
