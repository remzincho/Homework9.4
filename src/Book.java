
public class Book {
	private String name;
	private String author;
	private int page;

	public Book(String name,String author,int page){
		super();
		this.name=name;
		this.author=author;
		this.page=page;
	}
	public String toString(){
		return "Book [name=" + name + "]";
	}
}
