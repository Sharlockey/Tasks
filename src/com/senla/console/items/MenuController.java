package com.senla.console.items;

import com.senla.init.IAdministrator;

import java.util.Scanner;

public class MenuController {

    private final Builder builder;
    private final Navigator navigator;
    private final IAdministrator administrator;

    public MenuController(Builder builder, Navigator navigator, IAdministrator administrator) {
        this.builder = builder;
        this.navigator = navigator;
        this.administrator = administrator;
    }

    public void run() {

        builder.buildMenu(); // builds main menu and sub-menus, creates actions
        navigator.setCurrentMenu(builder.getRootMenu());
        navigator.printMenu();
        try {
            try (Scanner scanner = new Scanner(System.in)) {
                while (true) { // waits for user input, never stops until exit action is called or error occurs
                    int choice = scanner.nextInt();
                    navigator.navigate(choice);
                }
            }
        } catch (Exception e) { /// you can use try-catch inside the 'while' loop, not to terminate process in case of error
            e.printStackTrace();
        }
    }
}
