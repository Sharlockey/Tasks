package com.senla.services;

import com.senla.entities.Book;
import com.senla.entities.Order;
import com.senla.statuses.BookStatus;
import com.senla.statuses.OrderStatus;

import java.util.ArrayList;

public class OrderServices {
    public OrderServices() {

    }

    public Order createOrder(String ID, Book booksInOrder) {
        if (booksInOrder.getStatus() == BookStatus.PRESENT) return new Order(ID, booksInOrder, OrderStatus.NEW);
        else return new Order(ID, booksInOrder, OrderStatus.REQUEST);
    }

    public Order findOrder(ArrayList<Order> orders, Order order) {
        for (var search: orders) {
            if (order.getID().equals(search.getID())) {
                return search;
            }
        }
        return null;
    }

    public void removeOrder(ArrayList<Order> orders, Order order) {
        var search = findOrder(orders, order);
        if (search != null) {
            orders.remove(search);
        }
    }

    public void addOrder(ArrayList<Order> orders, Order order) {
        if (order != null) {
            orders.add(order);
        }
    }

    public void cancelOrder(Order order) {
        order.setStatus(OrderStatus.CANCELED);
    }

    public void completeOrder(Order order) {
        order.setStatus(OrderStatus.COMPLETED);
    }




}
