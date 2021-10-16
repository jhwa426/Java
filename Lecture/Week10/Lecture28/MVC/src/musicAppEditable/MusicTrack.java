package musicAppEditable;

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
	
	/**
	 * sets this MusicTrack object's title.
	 * @return
	 */
	
	public void setTitle(String title) {
		_title = title;
	}
	
	/**
	 * sets this MusicTrack object's artist.
	 * @return
	 */
	public void setArtist(String artist) {
		_artist = artist;
	}
	
	/**
	 * sets this MusicTrack object's album.
	 * @return
	 */
	public void setAlbum(String album) {
		_album = album;
	}
	
	public String toString() {
		return "(title: " + _title + ", artist: " + _artist + ", album: " + _album + ")";
	}
}
