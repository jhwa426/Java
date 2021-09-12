//Q1
class Book implements Comparable<Book>{
  private String title, author;
  private int numOfPages=1;
  
  public Book(String title, String author, int pages) {
    this.title = title;
    this.author = author;
    numOfPages = pages;
  }
  
  public String toString() {
    return String.format("%s(%s, %d pages)",title,author,numOfPages);
  }
  
  public int compareTo(Book other) {
	  if (this.numOfPages == other.numOfPages) {
		  return this.title.compareTo(other.title);
	  }
	  else {
		  return this.numOfPages - other.numOfPages;
	  }
	  
//	  return this.numOfPages == other.numOfPages ? this.title.compareTo(other.title) : this.numOfPages - other.numOfPages;
  }
  
}