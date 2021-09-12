import java.util.*;
interface Priced {
  public double getPrice();
}
class Item {
  protected String title;
  public Item(String title) {this.title = title;}
  public String getTitle() {return title;}
  public String toString() { return String.format("%s(%s)",getClass().getName(), title); }
}
class Book extends Item {
  private String author;
  public Book(String title, String author) {
    super(title);
    this.author = author;
  }
  public String getAuthor() {return author;}
  public String toString() {
    return "Book: '" + title + "' by " + author;
  }
}
class Movie extends Item {
  private int year;
  public Movie(String title, int year) {
    super(title);
    this.year = year;
  }
  public int getYear() {return year;}
  public String toString() {
    return "Movie: " + title + " (" + year + ")";
  }
}
 class CD extends Item implements Priced {
  private double price;
  public CD(String title, double price) {
    super(title);
    this.price = price;
  }
  public double getPrice() {return price;}
  public String toString() {
      return "CD: " + title + " (" + price + ")";
  }
}
public class TestGenericsApp {
  public static void main(String[] args) {
    List<Item> items = new ArrayList<Item>();
    items.add(new Movie("Psycho",1960));
    items.add(new Book("LOTR","Tolkien"));
    items.add(new CD("Ozomatli",2.50));
    //items.add("Terminator");

    for (Item i: items)
      System.out.println(i.getTitle());

    String[] sa = new String[]{"Hello", "World"};
    List<String> cs = new ArrayList<String>();
    cs.add("Morning");
    fromArrayToList(sa, cs);// T inferred to be String
    System.out.println(cs);

    List<Item> itemList2 = new ArrayList<Item>();
    Item[] itemArray = new Item[2];
    itemArray[0] = new Item("Hello");
    itemArray[1] = new Book("LOTR","Tolkien");
    fromArrayToList(itemArray,itemList2);
    System.out.println(itemList2);

	List<Movie> movieList = new ArrayList<Movie>();
    movieList.add(new Movie("Psycho",1960));
    movieList.add(new Movie("Mulan",2020));
    movieList.add(new Movie("Parasite",2019));
    movieList.add(new Movie("Rocky",1976));
    movieList.add(new Movie("Jaws",1975));
    movieList.add(new Movie("Jurassic Park",1993));
	List<Movie> moviesJ = startsWithJ(movieList);
    System.out.println(moviesJ);
  }
  // generic method:
  public static <T> void fromArrayToList(T[] a, List<T> c) {
    for (T o : a) {
      c.add(o);
    }
  }
  // generic method + bounded type parameter
  public static <T extends Item> List<T> startsWithJ(List<T> list) {
    List<T> filtered = new ArrayList<T>();
    for (T item : list)
      if (item.getTitle().startsWith("J"))
        filtered.add(item);
    return filtered;
  }
  
  // Q2
  public static <T> List <T> reverse(List<T> list) {
		List<T> reversedList = new ArrayList<T>();
		
		for (int i=list.size()-1; i>=0; i--) {
			reversedList.add(list.get(i));
		}
		return reversedList;
				
	}

  // Q3	
  public static <T extends Item> List<String> getTitleToUpperCase(List<T> list){
	  List<String> uppStr = new ArrayList<String>();
	  
	  for (int i=0; i<list.size(); i++) {
		  uppStr.add(list.get(i).title.toString().toUpperCase());
	  }
	  
	  return uppStr;
  }
  
  
  
}

