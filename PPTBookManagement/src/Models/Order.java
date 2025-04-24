package Models;

public class Order {
	private Integer id;
	private User user; 
	private Book book;
	
	public Order(Integer id, User user, Book book) {
		super();
		this.id = id;
		this.user = user;
		this.book = book;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	} 
	
	
	
}
