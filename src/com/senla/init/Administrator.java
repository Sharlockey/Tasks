package com.senla.init;

import com.senla.dao.BookDAO;
import com.senla.dao.OrderDAO;
import com.senla.dao.StoreDAO;
import com.senla.dataprocessor.DataProcessor;
import com.senla.entities.Book;
import com.senla.entities.Cash;
import com.senla.entities.Order;
import com.senla.entities.Store;
import com.senla.services.BookServices;
import com.senla.services.OrderServices;
import com.senla.services.StoreServices;
import com.senla.services.TransactionServices;

import java.util.*;

public class Administrator implements IAdministrator {
    private final Store                store;
    private final OrderServices        orderServices;
    private final BookServices         bookServices;
    private final TransactionServices  transactionServices;
    private final StoreServices        storeServices;
    private final BookDAO              bookDAO;
    private final OrderDAO             orderDAO;
    private final StoreDAO             storeDAO;
    private final DataProcessor        dataProcessor;


    public Administrator() {
        bookServices         = new BookServices();
        orderServices        = new OrderServices();
        storeServices        = new StoreServices();
        store                = new Store();
        transactionServices  = new TransactionServices();
        bookDAO              = new BookDAO();
        orderDAO             = new OrderDAO();
        storeDAO             = new StoreDAO();
        dataProcessor        = new DataProcessor();
        importData();
    }



    private void importData() {

    }

    @Override
    public void saveChanges() {

    }
    @Override
    public boolean bookIsPresent(Book book, ArrayList<Book> books) {
        return bookServices.bookIsPresent(book, books);
    }
    @Override
    public void removeBookFromStore(Book book, Store store) {
        bookServices.removeBookFromStore(book, store);
    }
    @Override
    public void addBookToStore(Book book, Store store) {
        bookServices.addBookToStore(book, store);
    }
    @Override
    public Order createOrder(String ID, Book booksInOrder) {
        return orderServices.createOrder(ID, booksInOrder);
    }
    @Override
    public Order findOrder(ArrayList<Order> orders, Order order) {
        return orderServices.findOrder(orders, order);
    }
    @Override
    public void removeOrder(ArrayList<Order> orders, Order order) {
        orderServices.removeOrder(orders, order);
    }
    @Override
    public void addOrder(ArrayList<Order> orders, Order order) {
        orderServices.addOrder(orders, order);
    }
    @Override
    public void cancelOrder(Order order) {
        orderServices.cancelOrder(order);
    }
    @Override
    public void completeOrder(Order order) {
        orderServices.completeOrder(order);
    }
    @Override
    public ArrayList<Cash> getStoreCash(Store store) {
        return transactionServices.getStoreCash(store);
    }
    @Override
    public void addCashToStore(Store store, Cash cash) {
        transactionServices.addCashToStore(store, cash);
    }
}
