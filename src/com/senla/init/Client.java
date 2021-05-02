package com.senla.init;

import com.senla.console.items.Builder;
import com.senla.console.items.MenuController;
import com.senla.console.items.Navigator;

public class Client {
    public static void doAction() {
        MenuController menu = new MenuController(new Builder(), new Navigator(), new Administrator());
        menu.run();
    }
}
