package singleton;

//Librarian singleton example 2

public class Librarian2 { 
	private static Librarian2 _librarian; 
	private String _name = "John Hanks";
	
	private Librarian2(){		
	} 
	
	public static Librarian2 getLibrarian(){ 
		if(_librarian == null)
			_librarian = new Librarian2();
		return _librarian; 
	} 
}
