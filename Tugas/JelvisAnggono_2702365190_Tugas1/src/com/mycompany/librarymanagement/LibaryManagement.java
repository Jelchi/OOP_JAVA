package com.mycompany.librarymanagement;

import Models.Book;
import Models.Order;
import Models.User;
import Utils.BookManagement;
import Utils.DisplayData;
import Utils.OrderManagement;
import Utils.UserManagement;

import java.util.HashMap;

public class LibaryManagement {
    public static void main(String[] args) {
        HashMap<Integer, Book> books =  new HashMap<>();
        HashMap<Integer, Order> orders = new HashMap<>();
        HashMap<Integer, User> users = new HashMap<>();

        /* add New Users to libary */
        UserManagement.addUser(users, "fikri", "fikri@mail.com", "fikrifikri");
        UserManagement.addUser(users, "hasan", "hasan@mail.com", "hasanwuy");

        /* add New Books to libary*/
        BookManagement.addBook(books, "7 kiat kurus", 2019, "Salma");
        BookManagement.addBook(books, "Kamu itu baik", 2021, "Kiki");

        OrderManagement.addOrder(orders, users.get(1),books.get(1));

        /* Showing data */
        for(Integer i : users.keySet()){
            System.out.println("User email: " + users.get(i).email +", User name: "+ users.get(i).name);
        }
        DisplayData.displayOrders(orders);
    }
}
