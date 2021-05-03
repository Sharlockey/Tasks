package com.senla.console.actions;

import com.senla.init.IAdministrator;
import com.senla.statuses.BookStatus;
import com.senla.statuses.OrderStatus;

import java.util.Scanner;

public class ShowAction implements IAction{

    @Override
    public void execute(IAdministrator administrator) {
        var scanner = new Scanner(System.in);
        System.out.println("""
                Choose type of object you want to look:
                1. Show books in Store.
                2. Show store orders.
                \s""");

        switch (scanner.nextInt()) {
            case 1 -> {
                System.out.println("""
                        Choose required mode:
                        1. All
                        2. Present
                        3. Absent
                        """);
                chooseBookStatus(scanner.nextInt(), administrator);
            }
            case 2 -> {
                System.out.println("""
                        Choose required mode:
                        1. All
                        2. New
                        3. Completed
                        4. Canceled
                        5. Request
                        """);
                chooseOrderStatus(scanner.nextInt(), administrator);
            }
            default -> System.out.println("Invalid argument. Nothing was shown.");
        }
    }

    private void chooseBookStatus(int key, IAdministrator administrator){
        switch (key) {
            case 1 -> administrator.showBooksInStore(BookStatus.ALL);
            case 2 -> administrator.showBooksInStore(BookStatus.PRESENT);
            case 3 -> administrator.showBooksInStore(BookStatus.ABSENT);
            default -> System.out.println("Invalid argument. Nothing was shown.");
        }
    }

    private void chooseOrderStatus(int key, IAdministrator administrator) {
        switch (key) {
            case 1 -> administrator.showOrderInStore(OrderStatus.ALL);
            case 2 -> administrator.showOrderInStore(OrderStatus.NEW);
            case 3 -> administrator.showOrderInStore(OrderStatus.COMPLETED);
            case 4 -> administrator.showOrderInStore(OrderStatus.CANCELED);
            case 5 -> administrator.showOrderInStore(OrderStatus.REQUEST);
            default -> System.out.println("Invalid argument. Nothing was shown.");
        }
    }
}
