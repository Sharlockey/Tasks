package com.senla.console.items;

import com.senla.console.actions.IAction;

public class MenuItem {
    private final String title;
    private final IAction doAction;
    private final Menu nextMenu;

    public MenuItem(String title, IAction doAction, Menu nextMenu){
        this.title = title;
        this.doAction = doAction;
        this.nextMenu = nextMenu;
    }

    public String getTitle() {
        return title;
    }

    public void doAction() {
        doAction.execute();
    }

    public Menu getNextMenu() {
        return nextMenu;
    }
}
