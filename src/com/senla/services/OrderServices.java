package com.senla.services;

import com.senla.entities.Book;
import com.senla.entities.Order;
import com.senla.statuses.BookStatus;
import com.senla.statuses.OrderStatus;

import java.util.ArrayList;

public class OrderServices {

    public Order findOrder(ArrayList<Order> orders, int ID) {
        for (var search: orders) {
            if (ID == search.getID()) {
                return search;
            }
        }
        return null;
    }

    public void removeOrder(ArrayList<Order> orders, Order order) {
        orders.remove(order);
    }

    public void cancelOrder(Order order) {
        order.setStatus(OrderStatus.CANCELED);
    }

    public void completeOrder(Order order) {
        order.setStatus(OrderStatus.COMPLETED);
    }

    public Order createOrder(int ID, Book book){
        if (book.getStatus() == BookStatus.PRESENT)
            return new Order(ID, book, OrderStatus.NEW);
        else
            return new Order(ID, book, OrderStatus.REQUEST);
    }

    public Order createRequest(int ID, Book book) {
        return new Order(ID, book, OrderStatus.REQUEST);
    }

    public void showOrder(ArrayList<Order> orders, OrderStatus status) {
        if (status == OrderStatus.ALL)
            for (var order: orders)
                printOrder(order);
        else
            for (var order: orders)
                if(order.getStatus() == status)
                    printOrder(order);
    }

    private void printOrder(Order order) {
        System.out.println("ID             : " + order.getID());
        System.out.println("Book           : " + order.getBooksInOrder().getName());
        System.out.println("Summary price  : " + order.getSummaryPrice());
        System.out.println("Execution date : " + order.getExecutionDate());
        System.out.println("Status         : " + order.getStatus());
    }

    public void addOrder(ArrayList<Order> orders,Order order) {
        orders.add(order);
    }

    public Order findOrderOfBook(String name, ArrayList<Order> orders) {
        for (var order: orders)
            if (order.getBooksInOrder().getName().equals(name))
               return order;
        return null;
    }

}
