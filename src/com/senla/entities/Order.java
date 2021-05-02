package com.senla.entities;

import com.senla.statuses.OrderStatus;

import java.util.Date;

public class Order {
    private final  String        ID;
    private final  Book          booksInOrder;
    private        OrderStatus   status;
    private final  float         summaryPrice;
    private final  Date          executionDate;

    public Order(String ID, Book booksInOrder, OrderStatus status) {
        this.ID             = ID;
        this.booksInOrder   = booksInOrder;
        this.status         = status;
        this.summaryPrice   = booksInOrder.getPrice();
        this.executionDate  = new Date();
    }

    public String getID() {
        return ID;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public float getSummaryPrice() {
        return summaryPrice;
    }

    public Date getExecutionDate() {
        return executionDate;
    }

    public Book getBooksInOrder() {
        return booksInOrder;
    }

    public String toString() {
        return getID() + "," + getSummaryPrice() + "," + getStatus() + "," + getExecutionDate() + ":" + booksInOrder.toString();
    }
}
