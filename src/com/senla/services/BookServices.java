package com.senla.services;

import com.senla.entities.Book;
import com.senla.entities.Order;
import com.senla.statuses.BookStatus;
import com.senla.statuses.OrderStatus;

import java.util.ArrayList;
import java.util.Calendar;

public class BookServices {


    public void removeBookFromStore(Book book, Order order) {
        if (order != null)
            order.setStatus(OrderStatus.REQUEST);
        book.setStatus(BookStatus.ABSENT);
    }


    public void addBookToStore(Book book, Order order) {
        if (order != null)
            order.setStatus(OrderStatus.NEW);
        book.setStatus(BookStatus.PRESENT);
    }

    public Book createBook(int ID, String name, Calendar calendar, float price, BookStatus bookStatus){
        return new Book(ID, name, calendar, price, bookStatus);
    }

    public void showBooks(ArrayList<Book> books, BookStatus status){
        if (status == BookStatus.ALL)
            for (var book: books)
                printBook(book);
        else
            for (var book: books)
                if (book.getStatus() == status)
                    printBook(book);
    }

    public Book findBook(String name, ArrayList<Book> books) {
        for (var book: books)
            if (book.getName().equals(name))
                return book;
        return null;
    }

    private void printBook(Book book) {
        System.out.println("ID            : " + book.getID());
        System.out.println("Name          : " + book.getName());
        System.out.println("Price         : " + book.getPrice());
        System.out.println("Date of issue : " + book.getDateOfIssue());
        System.out.println("Receipt Date  : " + book.getReceiptDate());
        System.out.println("Status        : " + book.getStatus());
        System.out.println("=========================================================");
    }

    public void addBook(ArrayList<Book> books, Book book) {
        books.add(book);
    }

    public void deleteBook(Book book, ArrayList<Book> books) {
        books.remove(book);
    }
}
