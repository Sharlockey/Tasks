package com.senla.entities;

import com.senla.statuses.OrderStatus;

import java.util.Date;

public class Order {
    private final  int           ID;
    private final  Book          booksInOrder;
    private        OrderStatus   status;
    private final  float         summaryPrice;
    private final  Date          executionDate;

    public Order(int ID, Book bookInOrder, OrderStatus status) {
        this.ID             = ID;
        this.booksInOrder   = bookInOrder;
        this.status         = status;
        this.summaryPrice   = bookInOrder.getPrice();
        this.executionDate  = new Date();
    }

    public int getID() {
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
        return getID() + ',' + booksInOrder.getName() + ',' + getSummaryPrice() + ',' + getExecutionDate() + ',' + getStatus();
    }
}
