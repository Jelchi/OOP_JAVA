package Libary;

import java.util.Scanner;

import Manager.BookManager;
import Manager.OrderManager;
import Manager.UserManager;
import Models.Book;
import Models.Order;
import Models.User;

public class Libary {
	public static void main (String[]args) {
		UserManager userManager = new UserManager(); 
		BookManager bookManager = new BookManager(); 
		OrderManager orderManager = new OrderManager(); 
		
		// Adding users 
		User win =  new User(1, "Winner Pranata", "winner@gmail.com", "win"); 
		User jelvis = new User(2,  "Jelvis Anggono", "Jelvisanggono@gmail.com", "Jelvis"); 
		
		userManager.register(win); 
		userManager.register(jelvis);
		
		// Adding books 
		Book physics = new Book(1, "Physics", 2023, "Einstein"); 
		Book mathematic = new Book (2, "Mathematic", 2023, "Issac"); 
		
		bookManager.register(mathematic);
		bookManager.register(physics);

		 
		
		//Adding orders
		Order winPhysics = new Order(1, win, physics); 
		Order winMath = new Order(2, win, mathematic); 
		Order jelPhysics = new Order(3, jelvis, physics); 
		Order jelMath = new Order(4, jelvis, mathematic); 
		
		orderManager.add(winPhysics);
		orderManager.add(winMath);
		orderManager.add(jelPhysics);
		orderManager.add(jelMath);
		
		// GET USER 
		Scanner input = new Scanner(System.in); 
		System.out.println("Input name to search: ");
		String name = input.nextLine(); 
		
		User toFind = userManager.get(name); 
		if(toFind != null) {
			System.out.println(toFind.getId());
			System.out.println(toFind.getName());
			System.out.println(toFind.getEmail());
			System.out.println(toFind.getUsername());
		}
		
		//GET BOOK
		System.out.println("Input title of book to search: ");
		String nameBook = input.nextLine(); 
		
		Book toFindBook = bookManager.get(nameBook); 
		
		if(toFindBook != null) {
			System.out.println(toFindBook.getId());
			System.out.println(toFindBook.getTitle());
			System.out.println(toFindBook.getYear());
			System.out.println(toFindBook.getAuthor());
		}
		
		//Order 
		orderManager.list(); 
		
		input.close(); 
	}
}
