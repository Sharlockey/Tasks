package com.senla.services;

import com.senla.entities.Book;
import com.senla.entities.Order;
import com.senla.entities.Store;
import com.senla.statuses.BookStatus;

import java.util.ArrayList;

public class BookServices {
    public boolean bookIsPresent(Book book, ArrayList<Book> books) {
        for (var ibook: books) {
            if (ibook.getName().equals(book.getName())) {
                books.remove(ibook);
                return true;
            }
        }
        return false;
    }

    public void removeBookFromStore(Book book, Store store) {
        if(bookIsPresent(book, store.getBooks())) book.setStatus(BookStatus.ABSENT);
        store.setBooks(book);
    }

    public void addBookToStore(Book book, Store store) {
        if(!bookIsPresent(book, store.getBooks())) {
            book.setStatus(BookStatus.PRESENT);
            store.setBooks(book);
        }
    }

    private boolean checkBookInOrder(Book book, Order order) {
        return book.getName().equals(order.getBooksInOrder().getName());
    }



}
