package com.senla.init;

import com.senla.statuses.BookStatus;
import com.senla.statuses.OrderStatus;

import java.util.Calendar;

public interface IAdministrator {
    void              saveChanges             ();
    void              createBook              (String name, Calendar calendar, float price);
    void              deleteBook              (String name);
    void              createOrder             (String name);
    void              removeBookFromStore     (String name);
    void              addBookToStore          (String name);
    void              removeOrder             (int ID);
    void              cancelOrder             (int ID);
    void              completeOrder           (int ID);
    void              showBooksInStore        (BookStatus status);
    void              showOrderInStore        (OrderStatus status);
    void              requestOrder            (int ID, String name);
}
