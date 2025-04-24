package Manager;

import java.util.HashMap;

import Models.Book;

public class BookManager {
	private HashMap<String, Book>books = new HashMap<>(); 
	
	public void register(Book book) {
		String key = book.getTitle(); 
		books.put(key, book); 
	}
	
	public Book get(String title) {
		return books.get(title); 
	} 
	
	public void delete(String title) {
		books.remove(title); 
	}
}


