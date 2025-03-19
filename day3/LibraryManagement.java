package week1.day3;

public class LibraryManagement {

	public static void main(String[] args) {
		
		Library obj = new Library();
		String book = obj.addBook("Book Title Added!");
		System.out.println(book);
		obj.issueBook();
		
	}

}
