package week1.assignment;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library();
		
		System.out.println("Book Name: "+lib.addBook("Physics"));
		lib.issueBook();

	}

}
