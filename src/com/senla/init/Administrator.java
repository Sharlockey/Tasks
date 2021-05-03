package com.senla.init;

import com.senla.dao.BookDAO;
import com.senla.dao.OrderDAO;
import com.senla.dataprocessor.Generator;
import com.senla.entities.Book;
import com.senla.entities.Order;
import com.senla.services.BookServices;
import com.senla.services.OrderServices;
import com.senla.statuses.BookStatus;
import com.senla.statuses.OrderStatus;

import java.util.*;

public class Administrator implements IAdministrator {
    private final ArrayList<Book>      booksInStore;
    private final ArrayList<Order>     orderList;
    private final OrderServices        orderServices;
    private final BookServices         bookServices;
    private final BookDAO              bookDAO;
    private final OrderDAO             orderDAO;


    public Administrator() {
        bookServices         = new BookServices();
        orderServices        = new OrderServices();
        bookDAO              = new BookDAO();
        orderDAO             = new OrderDAO();
        booksInStore         = new ArrayList<>();
        orderList            = new ArrayList<>();
        importData();
    }

    // Data Access Object Action

    @Override
    public void saveChanges() {

    }
    private void importData() {

    }

    // Book Action

    @Override
    public void createBook(String name, Calendar calendar, float price) {
        bookServices.addBook(booksInStore, bookServices.createBook(Generator.getRandomID(),
                                                                   name,
                                                                   calendar,
                                                                   price,
                                                                   BookStatus.PRESENT));
    }
    @Override
    public void deleteBook(String name) {
        bookServices.deleteBook(bookServices.findBook(name, booksInStore), booksInStore);
    }
    @Override
    public void addBookToStore(String name) {
        bookServices.addBookToStore(bookServices.findBook(name, booksInStore), orderServices.findOrderOfBook(name, orderList));
    }
    @Override
    public void removeBookFromStore(String name) {
        bookServices.removeBookFromStore(bookServices.findBook(name, booksInStore), orderServices.findOrderOfBook(name, orderList));
    }
    @Override
    public void showBooksInStore(BookStatus status) {bookServices.showBooks(booksInStore, status);}

    // Order action

    @Override
    public void createOrder(String name) {
        orderServices.addOrder(orderList, orderServices.createOrder(Generator.getRandomID(),
                                                                    bookServices.findBook(name, booksInStore)));
    }
    @Override
    public void removeOrder(int ID) {
        orderServices.removeOrder(orderList, orderServices.findOrder(orderList, ID));
    }
    @Override
    public void completeOrder(int ID) {
        orderServices.completeOrder(orderServices.findOrder(orderList, ID));
    }
    @Override
    public void cancelOrder(int ID) {
        orderServices.cancelOrder(orderServices.findOrder(orderList, ID));
    }
    @Override
    public void requestOrder(int ID, String name) {
        orderServices.addOrder(orderList, orderServices.createRequest(ID, bookServices.findBook(name, booksInStore)));
    }
    @Override
    public void showOrderInStore(OrderStatus status) {
        orderServices.showOrder(orderList, status);
    }

}