package com.senla.init;

import com.senla.entities.Book;
import com.senla.entities.Cash;
import com.senla.entities.Order;
import com.senla.entities.Store;

import java.util.ArrayList;

public interface IAdministrator {
    void              saveChanges             ();
    boolean           bookIsPresent           (Book book, ArrayList<Book> books);
    void              removeBookFromStore     (Book book, Store store);
    void              addBookToStore          (Book book, Store store);
    Order             createOrder             (String ID, Book booksInOrder);
    Order             findOrder               (ArrayList<Order> orders, Order order);
    void              removeOrder             (ArrayList<Order> orders, Order order);
    void              addOrder                (ArrayList<Order> orders, Order order);
    void              cancelOrder             (Order order);
    void              completeOrder           (Order order);
    ArrayList<Cash>   getStoreCash            (Store store);
    void              addCashToStore          (Store store, Cash cash);
}
