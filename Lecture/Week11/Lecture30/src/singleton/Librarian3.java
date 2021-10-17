package singleton;

//Librarian singleton example 3 (supports multithreading - Lecture 31-32)

public class Librarian3 { 
	private static Librarian3 _librarian; 
	private String _name = "John Hanks";
	
	private Librarian3(){		
	} 
	
	public static synchronized Librarian3 getLibrarian(){ 
		if(_librarian == null)
			_librarian = new Librarian3();
		return _librarian; 
	} 
}
