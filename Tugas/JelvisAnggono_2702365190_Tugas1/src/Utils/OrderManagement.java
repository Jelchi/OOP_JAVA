package Utils;

import Models.Book;
import Models.Order;
import Models.User;

import java.util.HashMap;

public class OrderManagement {
    public static void addOrder(HashMap<Integer, Order> orders, User user, Book book){
        if(orders.isEmpty()){
            orders.put(1, new Order(1, user));
            BookManagement.addBook(orders.get(1).books,book.title, book.yearPublished, book.author );
        } else {
            Integer[] keys = orders.keySet().toArray(new Integer[orders.size()]);
            Integer lastId = keys[keys.length-1];
            orders.put(lastId+1, new Order(lastId+1, user));
            BookManagement.addBook(orders.get(lastId+1).books, book.title, book.yearPublished, book.author);
        }
    }

    public static void removeOrder(HashMap<Integer,  Order> orders, Integer orderId){
        orders.remove(orderId);
    }
}
