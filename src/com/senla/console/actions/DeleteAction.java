package com.senla.console.actions;

import com.senla.init.IAdministrator;

import java.util.Scanner;

public class DeleteAction implements IAction {
    @Override
    public void execute(IAdministrator administrator) {
        var scanner = new Scanner(System.in);

        System.out.println("""
                Choose an object you want to delete:
                1. Delete a book.
                2. Delete an order.
                \s""");

        switch (scanner.nextInt()) {
            case 1 -> {
                System.out.println("Enter a name of book:");
                    administrator.deleteBook(scanner.next());
            }
            case 2 -> {
                System.out.println("Enter an ID of order:");
                    administrator.removeOrder(scanner.nextInt());
            }
            default -> System.out.println("Invalid argument. Nothing was deleted");
        }
    }
}
