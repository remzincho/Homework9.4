
public class Main {

	public static void main(String[] args) {
		Book a = new Book("a","author1",450);
		Book b = new Book("b","author2",500);
		Book c = new Book("c","author3",650);
		Library x = new Library("Library1","Address1");
		Library y = new Library("Library2","Address2");
		System.out.println(a + "\n" + b + "\n" + c + "\n " + x + " \n" + y);
		
		x.addBook(c);
		x.addBook(a);
		x.addBook(b);
		x.addBook(b);
		x.addBook(c);
		y.addBook(c);
		y.addBook(a);
		y.addBook(a);
		y.addBook(c);		
		System.out.println(a + "\n" + b + "\n" + c + "\n " + x + " \n" + y);
		
		y.removeBook(a);
		y.removeBook(a);
		System.out.println(a + "\n" + b + "\n" + c + "\n " + x + " \n" + y);


	}

}
