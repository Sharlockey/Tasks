package com.senla.console.actions;

import com.senla.init.IAdministrator;

import java.util.Scanner;

public class BookAction implements IAction {
    @Override
    public void execute(IAdministrator administrator) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a book name:");
            String name = scanner.next();

        System.out.println("""
                Choose what do you want to do with book:
                1. Add book to store.
                2. Remove book from store.
                \s""");

        switch (scanner.nextInt()) {
            case 1 -> administrator.addBookToStore(name);
            case 2 -> administrator.removeBookFromStore(name);
            default -> System.out.println("Nothing were actioned. Wrong argument");
        }
    }
}
