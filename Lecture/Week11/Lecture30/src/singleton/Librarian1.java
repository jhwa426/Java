package singleton;

//Librarian singleton example 1

public class Librarian1 { 
	private static final Librarian1 _librarian = new Librarian1(); 
	private String _name = "John Hanks";
	private Librarian1(){
	} 
	
	public static Librarian1 getLibrarian(){ 
		return _librarian; 
	} 
	
	public String getName() {
		return _name;
	}
}
