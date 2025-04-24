package Models;

public class Book {
	private Integer id; 
	private String title; 
	private Integer year; 
	private String author;
	
	public Book(Integer id, String title, Integer year, String author) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.author = author;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	} 
	
	
	
}
