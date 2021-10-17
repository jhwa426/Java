package singleton;

public class LibrarianMain {
	public static void main(String[] args) {
		Librarian1 librarian = Librarian1.getLibrarian();
		System.out.println("Librarian name: "+librarian.getName());
	}
}
