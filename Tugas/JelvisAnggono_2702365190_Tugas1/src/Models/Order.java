package Models;

import java.util.HashMap;

public class Order {
    public int id;
    public User user;
    public HashMap<Integer, Book> books;

    public Order(int id, User user) {
        this.id = id;
        this.user = user;
        books = new HashMap<>();
    }
}
