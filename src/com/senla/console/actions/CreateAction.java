package com.senla.console.actions;

import com.senla.init.IAdministrator;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class CreateAction implements IAction {

    @Override
    public void execute(IAdministrator administrator) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Choose type of object you want to create:
                1. Create a book.
                2. Create an order.
                \s""");

        switch (scanner.nextInt()) {
            case 1 -> {
                System.out.println("Enter an object name");
                    String  name    = scanner.next();
                System.out.println("Enter an date of issue [day, month, year] in integer value: ");
                    int     day     = scanner.nextInt();
                    int     month   = scanner.nextInt() - 1;
                    int     year    = scanner.nextInt();
                System.out.println("Enter a price of book:");
                    float   price   = scanner.nextFloat();

                administrator.createBook(name, new GregorianCalendar(year, month , day), price);
            }
            case 2 -> {
                System.out.println("Enter the book name you want to add: ");
                    String  name    = scanner.next();
                administrator.createOrder(name);
            }
            default -> System.out.println("Invalid argument. Nothing was created.");
        }
    }
}
