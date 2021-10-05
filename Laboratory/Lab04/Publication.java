//Q11 - Q12
abstract class Publication {
	protected String title;
	protected String publisher;
	protected int totalPages = 1;
	
	//A constructor that creates an object with the specified title and publisher.
	public Publication(String title, String publisher) {
		this.title = title;
		this.publisher = publisher;
	}
	
	//An overloaded constructor that creates an object with the specified title, publisher and the total number of pages.
	public Publication(String title, String publisher, int totalPages) {
		this.title = title;
		this.publisher = publisher;
		this.totalPages = totalPages;
	}
	
	public abstract String toString();
	
	public String getTitle() {
		return this.title;
	}
	
	public String getPublisher() {
		return this.publisher;
	}
	
	public int getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(int num) {
		if (num > 0) {
			this.totalPages = num;
		}
	}
	public static void main(String[] args) {

	}
}

//Q13 - Q14
class Book extends Publication {
	private String author;
	private String isbn;
	private double price = 1.0;
	
	//A constructor that creates an object with the specified title, publisher, author, ISBN code and price .
	public Book(String title, String publisher, String author, String isbn, double price) {
		super(title, publisher);
		this.author = author;
		this.isbn = isbn;
		this.price = price;
	}
	
	// An overloaded constructor that creates an object with the specified title, publisher, author, ISBN code, price and total number of pages.
	public Book(String title, String publisher, String author, String isbn, double price, int totalPages) {
		super(title, publisher);
		this.author = author;
		this.isbn = isbn;
		this.price = price;
		this.totalPages = totalPages;
	}
	
	public String toString() {
		return String.format("%s(%s, %d), published by %s, ISBN:%s, price:%.2f", super.title, this.author, super.totalPages, super.publisher, this.isbn,this.price);
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getISBN() {
		return this.isbn;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double p) {
		if (p > 0) {
			this.price = p;
		}
	}
}

