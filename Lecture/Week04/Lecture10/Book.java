import java.util.ArrayList;

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
	
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book("The JFC Swing Tutorial", "Kathy Walrath", "0201914670"));
		books.add(new EBook("ABC Tutorial", "Dick Smith", "1234567890", "http//abc.com", 128));
		books.add(new PaperBook("Bad habits that lead to success", "Seth Devilin", "3456344550", 314));
		String[] data = getTitles(books);
		System.out.println(Arrays.toString(data));
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


class PaperBook extends Book{
	protected int numberOfPages;
	
	
	// constructor
	public PaperBook(String title, String author ,String ISBNCode, int numberOfPages){
		super(title, author, ISBNCode);
		this.numberOfPages = numberOfPages;
	}
	
	public int getNumberOfPages() {
		return this.numberOfPages;
	}
	
	public String toString() {
		String str = String.format("%s and the number of pages = %d", super.toString(), this.numberOfPages);
		return str;
	}
	
	public static String[] getTitles(ArrayList<Book> books) {
		String[] result = new String[books.size()];
		for(int i = 0; i < books.size(); i++) {
			Book p = books.get(i);
			result[i] = p.getTitle();
		}
		return result;
	}
	
}











