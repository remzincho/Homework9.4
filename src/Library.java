import java.util.List;
import java.util.ArrayList;

class Library {

	private String name;
	private String address;
	private List<Book> books = new ArrayList<Book>();

	Library(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	void addBook(Book one) {
		books.add(one);
	}

	void removeBook(Book one) {
		int a = -1;
		for (int i = 0; i < books.size(); i++)
			if (one.equals(books.get(i))) {
				a = i;
			}
		if (a != -1)
			books.remove(a);
	}

	@Override
	public String toString() {
		return "Library [name=" + name + ", address=" + address + ", books=" + books + "]";
	}
}