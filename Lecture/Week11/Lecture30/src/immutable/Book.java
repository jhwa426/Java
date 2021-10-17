package immutable;

//Book - example of an immutable class

final class Book {
	private final String _title;
	private final String _author;
	private int _numberOfPages;
	public Book(String title, String author, int numPages) {
	    _title = title;
	    _author = author;
	    _numberOfPages = numPages;
	}
	public String getTitle() {
		return _title;
	}
	public String getAuthor() {
		return _title;
	}
	public int getNumberOfPages() {
		return _numberOfPages;
	}	
}