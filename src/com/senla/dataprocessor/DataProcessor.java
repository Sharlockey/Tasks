package com.senla.dataprocessor;

import com.senla.entities.Book;
import com.senla.entities.Order;

public class DataProcessor {
    public final static char separator = ',';

    public static String covertBookToString (Book book) {
        return  book.getID() + ',' + book.getName() + ',' + book.getPrice() + ',' + book.getStatus() + ',' + book.getDateOfIssue() + ',' + book.getReceiptDate();
    }

    public static String convertOrderToString(Order order) {
        return order.getID() + ',' + order.getBooksInOrder().getName() + ',' + order.getSummaryPrice() + ',' + order.getExecutionDate() + ',' + order.getStatus();
    }
}
