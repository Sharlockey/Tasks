package com.senla.entities;

import com.senla.statuses.BookStatus;

import java.util.Calendar;
import java.util.Date;

public class Book {
    private final int              ID;
    private final String           name;
    private final Date             dateOfIssue;
    private final float            price;
    private       BookStatus       status;
    private final Date             receiptDate;

    public Book(int ID, String name, Calendar calendar, float price, BookStatus status) {
        this.ID           = ID;
        this.name         = name;
        this.dateOfIssue  = new Date(calendar.getTimeInMillis());
        this.price        = price;
        this.status       = status;
        this.receiptDate  = new Date();
    }

    public String getName() {
        return name;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public float getPrice() {
        return price;
    }

    public BookStatus getStatus() {
        return status;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public int getID() {
        return ID;
    }

    public String toString() {
        return  getID() + ',' +getName() + ',' + getPrice() + ',' + getStatus() + ',' + getDateOfIssue() + ',' + getReceiptDate();
    }
}
