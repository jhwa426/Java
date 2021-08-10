class Book{
	protected String title;
	protected String author;
	protected String publisher;
	protected int yearOfEdition;
	protected String ISBNCode = "N/A";
	
	// overloaded constructor
	public Book(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	public Book(String title, String author, String publisher, int yearOfEdition, String ISBNCode) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.yearOfEdition = yearOfEdition;
		this.ISBNCode = ISBNCode;
	}
	
	public boolean equals(Object ob) {
		return ((ob instanceof Book) && ((Book)ob).ISBNCode == this.ISBNCode);
	}
	
	
	public String toString() {
		String str = String.format("Book=%s, author=%s, ISBN=%s", title, author, ISBNCode);
		return str;
	}
	
}

class EBook extends Book {
	private String downloadSite;
	private int sizeMB;
	
	// constructor that creates a EBook object
	public EBook(String title, String author ,String ISBNCode, String downloadSite, int sizeMB) {
		super(title, author, ISBNCode);
		this.downloadSite = downloadSite;
		this.sizeMB = sizeMB;
	}
	
	public String getDownloadSite() {
		return this.downloadSite;
	}
	
	public int getSizeMB() {
		return this.sizeMB;
	}
	
	public String toString() {
//		return String.format(super.toString(),"%s, web address=%s, size=%d", downloadSite, sizeMB);
		return String.format("%s, web address=%s, size=%d", super.toString(), downloadSite, sizeMB);
	}

}


