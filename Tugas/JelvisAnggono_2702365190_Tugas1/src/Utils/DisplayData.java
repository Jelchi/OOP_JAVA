package Utils;

import Models.Book;
import Models.Order;
import Models.User;

import java.util.HashMap;

public class DisplayData {
    public static void displayOrders(HashMap<Integer, Order> orders){
        for(Order order : orders.values()){
            displayOrderDetail(orders, order.id);
        }
    }

    public static void displayOrderDetail(HashMap<Integer, Order>orders, Integer orderId){
        System.out.println("Order Detail Information");
        System.out.println("===================================");
        System.out.println("Order ID: "+ orders.get(orderId).id);
        System.out.println("User ID: "+ orders.get(orderId).user.id);
        System.out.println("User Name: "+ orders.get(orderId).user.name);
        System.out.println("User Email: "+ orders.get(orderId).user.email);
        System.out.println("User Username: " +orders.get(orderId).user.username);
        System.out.println("-----------------------------------");
        displayBooks(orders.get(orderId).books);

    }

    public static void displayBooks(HashMap<Integer, Book>books){
        for(Book book: books.values()){
            displayBookDetail(books, book.id);
        }
    }

    public static void displayBookDetail(HashMap<Integer, Book>books, Integer bookId){
        System.out.println("Book Detail Information");
        System.out.println("===================================");
        System.out.println("Book ID: "+ books.get(bookId).id);
        System.out.println("Book Title: "+ books.get(bookId).title);
        System.out.println("Year Published: "+ books.get(bookId).yearPublished);
        System.out.println("Book Author: "+ books.get(bookId).author);
        System.out.println("-----------------------------------");
    }

    public static void diplayUsers(HashMap<Integer, User>users){
        for(User user : users.values()){
            diplayUserDetail(users, user.id);
        }
    }

    public static void diplayUserDetail(HashMap<Integer, User>users, Integer userId){
        System.out.println("User Detail Infromation");
        System.out.println("===================================");
        System.out.println("User ID: "+ users.get(userId).id);
        System.out.println("User Name: "+ users.get(userId).name);
        System.out.println("User Email: "+ users.get(userId).email);
        System.out.println("User Username: "+ users.get(userId).username);
        System.out.println("-----------------------------------");
    }

}
