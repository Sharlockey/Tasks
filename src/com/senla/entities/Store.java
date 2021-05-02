package com.senla.entities;

import java.util.ArrayList;

public class Store {
    private final  ArrayList<Cash>   cash;
    private final  ArrayList<Book>   books;
    private final  ArrayList<Order>  orders;

    public Store () {
        this.cash   = new ArrayList<>();
        this.books  = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public ArrayList<Cash> getCash() {
        return cash;
    }

    public void setCash(Cash cash) {
        this.cash.add(cash);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(Book book) {
        this.books.add(book);
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(Order order) {
        this.orders.add(order);
    }

    public String toString() {
        StringBuilder cashString = new StringBuilder();
        StringBuilder bookString = new StringBuilder();
        StringBuilder orderString = new StringBuilder();
        for (var money: cash) {
            cashString.append(money.ToString());
        }

        for (var book: books) {
            bookString.append(book.toString());
        }

        for (var order: orders) {
            orderString.append(order.toString());
        }

        return cashString + ":" + bookString + ":" + orderString;
    }

}
